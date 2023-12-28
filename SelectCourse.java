import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class SelectCourse extends JPanel{
		ImageIcon bg=new ImageIcon("bbg1.png");
		Image bgblue=bg.getImage();
		
		ImageIcon b44=new ImageIcon("imback.png");
		ImageIcon b11=new ImageIcon("imsearch.png");
		
		static String sub[]={}; 
		static JComboBox cb=new JComboBox(sub);
		static Font f=new Font("Algerian",18,18);
		
		JButton b3,b4;
		JButton b1;
		
		JLabel l1;
		
	SelectCourse(){
		Font f1=new Font("Algerian",30,30);
		setFont(f1);
		
		 setLayout(null);
		
		l1=new JLabel("Avalaible Courses:");
		l1.setBounds(400,500,300,40);
		l1.setForeground(Color.white);
		l1.setFont(f1);
		add(l1);
		 
		 // jl=new JComboBox(s);
		 // jl.setBounds(720,500,500,40);
		 // jl.setFont(f1);
		 // jl.setBackground(Color.black);
		 // jl.setForeground(Color.gray);
		 add(show4());
		
		 
		b1=new JButton(b11);
		b1.setBounds(700,590,200,70);
		b1.setContentAreaFilled(false);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		add(b1);
		 
		
		
		
		
		// b3=new JButton("next");
		// b3.setBounds(100,100,180,80);
		// add(b3);
		
		b4=new JButton(b44);
		b4.setBounds(50,700,190,100);
		b4.setContentAreaFilled(false);
		b4.setOpaque(false);
		b4.setBorderPainted(false);
		add(b4);
		
	}
	
	public static JComboBox show4(){
			
		cb.setFont(f);
		cb.setBackground(Color.black);
		cb.setForeground(Color.gray);
		cb.setBounds(720,500,500,40);
			return cb;
		}
	public void paintComponent(Graphics g){
		Font f1=new Font("Algerian",50,50);
		Color c=new Color(255,255,255);
		g.setFont(f1);
		g.setColor(c);
		g.drawImage(bgblue,0,0,this);
		
		ImageIcon ii=new ImageIcon("imsc.gif");
		Image c1=ii.getImage();
		g.drawImage(c1,680,150,this);
		
		g.drawString("SELECT AVAILABLE COURSE",600,100);
		
		
		}
		
}