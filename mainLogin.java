import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class mainLogin extends JPanel{
		ImageIcon bg=new ImageIcon("bbb.png");
		Image bgblue=bg.getImage();
		
		
		ImageIcon b11=new ImageIcon("imadmin.png");
		ImageIcon b22=new ImageIcon("imstudent.png");
		ImageIcon b44=new ImageIcon("imback.png");
		JButton b1,b2,b3,b4;
	mainLogin(){
		 setLayout(null);
		b1=new JButton(b11);//adminlogin
		b1.setBounds(700,500,290,140);
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		add(b1);
		
		b2=new JButton(b22);//student login
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		b2.setBounds(700,650,290,140);
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
		g.drawImage(bgblue,0,0,this);
		Font f1=new Font("Algerian",60,60);
		Color c=new Color(255,250,250);
		g.setFont(f1);
		g.setColor(c);
		ImageIcon ii=new ImageIcon("logo4.png");
		Image logo=ii.getImage();
		g.drawImage(logo,620,200,this);
		g.drawString("Login Page",700,100);
		
			
		}
}