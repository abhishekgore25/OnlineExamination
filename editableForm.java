import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class editableForm extends JPanel{
	int i=0;
	String s="802E000"+i;
		ImageIcon bg=new ImageIcon("bbb.png");
		Image bgblue=bg.getImage();
		ImageIcon b00=new ImageIcon("imblack.png");
		ImageIcon b44=new ImageIcon("imback.png");
		ImageIcon b11=new ImageIcon("showresult.png");
		
		
		JLabel l1,t1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l12;
		JTextField t2,t3,t4,t5,t6,t7,t11,t12;
		JButton b3,b4;
		JButton b1,b2;
		
		
		
		
		
	editableForm(){
		Font f1=new Font("Algerian",24,24);
		setFont(f1);
		Font f2=new Font("Comic Sans MS",25,25);
		SwingConstants sc=new SwingConstants(){};
		
		 setLayout(null);
		
		 l1=new JLabel("REGISTRATION NO:");
		 l1.setBounds(300,180,250,40);
		 l1.setFont(f1);
		 l1.setForeground(Color.white);
		 add(l1);
		 
		 t1=new JLabel("");//label h yee registertion no ka
		 t1.setBounds(560,180,250,40);
		 t1.setForeground(Color.gray);
		 t1.setBackground(Color.black);
		 t1.setFont(f1);
		 add(t1);
		 
		 l2=new JLabel("USERNAME:");
		 l2.setBounds(300,240,250,40);
		 l2.setFont(f1);
		 l2.setForeground(Color.white);
		 add(l2);
		 
		 t2=new JTextField();
		 t2.setBounds(560,240,250,40);
		 t2.setForeground(Color.gray);
		 t2.setBackground(Color.black);
		 t2.setFont(f1);
		 add(t2);
		 
		 l3=new JLabel("NAME:");
		 l3.setBounds(300,300,250,40);
		 l3.setFont(f1);
		 l3.setForeground(Color.white);
		 add(l3);
		 
		 
		 t3=new JTextField();
		 t3.setBounds(560,300,250,40);
		 t3.setForeground(Color.gray);
		 t3.setBackground(Color.black);
		 t3.setFont(f1);
		 add(t3);
		 
		 l4=new JLabel("MOBILE NO:");
		 l4.setBounds(300,360,250,40);
		 l4.setFont(f1);
		 l4.setForeground(Color.white);
		 add(l4);
		 
		 
		 t4=new JTextField();
		 t4.setBounds(560,360,250,40);
		 t4.setForeground(Color.gray);
		 t4.setBackground(Color.black);
		 t4.setFont(f1);
		 add(t4);
		 
		 l5=new JLabel("GENDER:");
		 l5.setBounds(300,420,250,40);
		 l5.setFont(f1);
		 l5.setForeground(Color.white);
		 add(l5);
		 
		 
		 t11=new JTextField();
		 t11.setBounds(560,420,250,40);
		 t11.setForeground(Color.gray);
		 t11.setBackground(Color.black);
		 t11.setFont(f1);
		 add(t11);
		 
		 l6=new JLabel("E-MAIL:");
		 l6.setBounds(300,480,250,40);
		 l6.setFont(f1);
		 l6.setForeground(Color.white);
		 add(l6);
		 
		 
		 t5=new JTextField();
		 t5.setBounds(560,480,250,40);
		 t5.setForeground(Color.gray);
		 t5.setBackground(Color.black);
		 t5.setFont(f1);
		 add(t5);
		 
		 l7=new JLabel("D.O.B:");
		 l7.setBounds(300,540,250,40);
		 l7.setFont(f1);
		 l7.setForeground(Color.white);
		 add(l7);
		 
		  
		 t12=new JTextField();
		 t12.setBounds(560,540,250,40);
		 t12.setForeground(Color.gray);
		 t12.setBackground(Color.black);
		 t12.setFont(f1);
		 add(t12);
		 
		 
		 l8=new JLabel("COLLEGE NAME:");
		 l8.setBounds(300,600,250,40);
		 l8.setFont(f1);
		 l8.setForeground(Color.white);
		 add(l8);
		 
		 
		 
		 t6=new JTextField();
		 t6.setBounds(560,600,250,40);
		 t6.setForeground(Color.gray);
		 t6.setBackground(Color.black);
		 t6.setFont(f1);
		 add(t6);
		 
		 l9=new JLabel("ADDRESS:");
		 l9.setBounds(300,660,250,40);
		 l9.setFont(f1);
		 l9.setForeground(Color.white);
		 add(l9);
		 
		 
		 
		 t7=new JTextField();
		 t7.setBounds(560,660,250,40);
		 t7.setForeground(Color.gray);
		 t7.setBackground(Color.black);
		 t7.setFont(f1);
		 add(t7);
		 
		 l10=new JLabel("REGISTRATION DATE:");
		 l10.setBounds(950,180,300,40);
		 l10.setFont(f1);
		 l10.setForeground(Color.white);
		 add(l10);
		 
		 
		 l12=new JLabel("dfff");
		 l12.setBounds(1270,180,250,40);
		 l12.setFont(f1);
		 l12.setForeground(Color.gray);
		 add(l12);
		
		
		
		 
		b1=new JButton("UPDATE",b00);
		b1.setBounds(1350,700,200,70);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		b1.setForeground(Color.white);
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setFont(f2);
		b1.setOpaque(false);
		add(b1);
		 
		b2=new JButton("RESET",b00);
		b2.setBounds(1100,700,200,70);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		b2.setForeground(Color.white);
		b2.setHorizontalTextPosition(sc.CENTER);
		b2.setFont(f2);
		b2.setOpaque(false);
		add(b2);
		 
		
		// b3=new JButton("next");
		// b3.setBounds(100,100,180,80);
		// add(b3);
		
		
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
		g.drawImage(rr,1050,320,this);
		
		
		
		g.drawString("STUDENT FORM(EDITABLE)",650,100);
		
		
		}
		
}