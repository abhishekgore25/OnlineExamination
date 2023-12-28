import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class manageCourses extends JPanel{
		ImageIcon bg=new ImageIcon("bbg1.png");
		Image bgblue=bg.getImage();
		
		ImageIcon b44=new ImageIcon("imback.png");
		ImageIcon b11=new ImageIcon("dc.png");
		ImageIcon b22=new ImageIcon("uc.png");
		ImageIcon b033=new ImageIcon("anc.png");
		
		static String courses[]={};
		static JComboBox cj=new JComboBox(courses);
		
		JButton b3,b4;
		JButton b1,b2,b03;
		static Font f1=new Font("Algerian",30,30);
		
	manageCourses(){
		setFont(f1);
		
		 setLayout(null);
		
		
		 
		 add(show1());
		
		 
		
		b1=new JButton(b11);
		b1.setBounds(550,700,165,70);
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		add(b1);
		
		b2=new JButton(b22);//update
		b2.setBounds(1050,700,165,60);
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		add(b2);
		
		b03=new JButton(b033);//addnewcourse button
		b03.setBounds(440,450,165,60);
		b03.setOpaque(false);
		b03.setContentAreaFilled(false);
		b03.setBorderPainted(false);
		add(b03);
		 
		
		
		
		
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
	public void paintComponent(Graphics g){
		Font f1=new Font("Algerian",50,50);
		Color c=new Color(255,255,255);
		g.setFont(f1);
		g.setColor(c);
		g.drawImage(bgblue,0,0,this);
		
		ImageIcon ii=new ImageIcon("mc1.png");
		Image mc=ii.getImage();
		g.drawImage(mc,700,230,this);
		
		g.drawString("MANAGE COURSES",650,100);
		
			
		}
		public  JComboBox show1(){
			
		 cj.setBounds(620,450,500,40);
		 cj.setFont(f1);
		 cj.setBackground(Color.black);
		 cj.setForeground(Color.gray);
		 return cj;
		 
		}
		
}