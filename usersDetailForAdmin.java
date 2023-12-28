import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class usersDetailForAdmin extends JPanel{
		ImageIcon bg=new ImageIcon("bbg1.png");
		Image bgblue=bg.getImage();
		
		ImageIcon b44=new ImageIcon("imback.png");
		ImageIcon b11=new ImageIcon("imsearch.png");
		
		
		static JComboBox jl;
		JButton b3,b4;
		JButton b1;
		static String s[]=new String[100];
		JLabel l1;
		static Font f1;
	usersDetailForAdmin(){
		f1=new Font("Algerian",30,30);
		setFont(f1);
		
		 setLayout(null);
		
		l1=new JLabel("Avalaible Users:");
		l1.setBounds(330,450,300,40);
		l1.setForeground(Color.white);
		l1.setFont(f1);
		add(l1);
		 
		
		
		 
		b1=new JButton(b11);
		b1.setBounds(650,520,200,70);
		b1.setContentAreaFilled(false);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		add(b1);
		 
		
		
		
		
		b3=new JButton("next");
		b3.setBounds(100,100,180,80);
		add(b3);
		
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
		
		ImageIcon ii=new ImageIcon("man.png");
		Image mc=ii.getImage();
		g.drawImage(mc,50,370,this);
		
		g.drawString(" AVAILABLE USERS DETAILS",600,100);
		
		
		}
		
}