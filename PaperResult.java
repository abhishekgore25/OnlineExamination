import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class PaperResult extends JPanel{
	
	
		ImageIcon bg=new ImageIcon("bbb.png");
		Image bgblue=bg.getImage();
		ImageIcon b00=new ImageIcon("imblack.png");
		ImageIcon b44=new ImageIcon("imback.png");
		ImageIcon b11=new ImageIcon("showresult.png");
		
		
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
		JLabel l11,l22,l33,l44,l55,l66,l77,l88,l99;
		
		JButton b3,b4;
		JButton b1,b2;
		
		
		
		
		
	PaperResult(){
		Font f1=new Font("Algerian",24,24);
		setFont(f1);
		Font f2=new Font("Comic Sans MS",25,25);
		SwingConstants sc=new SwingConstants(){};
		
		 setLayout(null);
		
		 l1=new JLabel("COURSE NAME:");
		 l1.setBounds(300,180,250,40);
		 l1.setFont(f1);
		 l1.setForeground(Color.white);
		 add(l1);
		 
		 l11=new JLabel("......");
		 l11.setBounds(550,180,250,40);
		 l11.setFont(f1);
		 l11.setForeground(Color.white);
		 add(l11);
		 
		
		 
		 
		 
		 l3=new JLabel("TOTAL QUESTION:");
		 l3.setBounds(300,240,250,40);
		 l3.setFont(f1);
		 l3.setForeground(Color.white);
		 add(l3);
		 
		 l33=new JLabel(".......:");
		 l33.setBounds(550,240,250,40);
		 l33.setFont(f1);
		 l33.setForeground(Color.white);
		 add(l33);
		 
		 
		 
		 
		
		 
		 l4=new JLabel("ATTEMPTED QUESTION:");
		 l4.setBounds(300,300,300,40);
		 l4.setFont(f1);
		 l4.setForeground(Color.white);
		 add(l4);
		 
		 l44=new JLabel("........");
		 l44.setBounds(600,300,250,40);
		 l44.setFont(f1);
		 l44.setForeground(Color.white);
		 add(l44);
		 
		 
		 
		 l5=new JLabel("CORRECT ANSWER:");
		 l5.setBounds(300,360,250,40);
		 l5.setFont(f1);
		 l5.setForeground(Color.white);
		 add(l5);
		 
		 l55=new JLabel("........");
		 l55.setBounds(550,360,250,40);
		 l55.setFont(f1);
		 l55.setForeground(Color.white);
		 add(l55);
		 
		
		 
		 l6=new JLabel("WRONG ANSWER:");
		 l6.setBounds(300,420,250,40);
		 l6.setFont(f1);
		 l6.setForeground(Color.white);
		 add(l6);
		 
		 l66=new JLabel("........");
		 l66.setBounds(550,420,250,40);
		 l66.setFont(f1);
		 l66.setForeground(Color.white);
		 add(l66);
		 
		 
		 
		
		 l7=new JLabel("MARKS OBTAINED:");
		 l7.setBounds(300,480,250,40);
		 l7.setFont(f1);
		 l7.setForeground(Color.white);
		 add(l7);
		
		 l77=new JLabel("......");
		 l77.setBounds(550,480,250,40);
		 l77.setFont(f1);
		 l77.setForeground(Color.white);
		 add(l77);
		 
		 

		 l8=new JLabel("TOTAL MARKS:");
		 l8.setBounds(300,540,250,40);
		 l8.setFont(f1);
		 l8.setForeground(Color.white);
		 add(l8);
		 

		 l88=new JLabel("......");
		 l88.setBounds(550,540,250,40);
		 l88.setFont(f1);
		 l88.setForeground(Color.white);
		 add(l88);
		 
		 
		 
		 
		 l9=new JLabel("PERCENTAGE:");
		 l9.setBounds(300,600,250,40);
		 l9.setFont(f1);
		 l9.setForeground(Color.white);
		 add(l9);
		 
		 
		 l99=new JLabel(">>>>>>>>");
		 l99.setBounds(550,600,250,40);
		 l99.setFont(f1);
		 l99.setForeground(Color.white);
		 add(l99);
		 
		 
		 
		b4=new JButton(b44);//back
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
		
		ImageIcon ii=new ImageIcon("registeri.png");
		Image rr=ii.getImage();
		g.drawImage(rr,1150,320,this);
		
		
		
		g.drawString("Paper Result",650,100);
		
		
		}
		
}