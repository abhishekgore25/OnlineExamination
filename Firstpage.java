import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Firstpage extends JPanel {
		ImageIcon bg=new ImageIcon("bbback.png");
		Image bgblue=bg.getImage();
		
		Font f=new Font("Arial",25,25);
		
		ImageIcon b11=new ImageIcon("imhelp.png");
		ImageIcon b22=new ImageIcon("imstart.png");
		JButton b1,b2,b3;
	
	   Firstpage(){
		 setLayout(null);
		
	
		
		b1=new JButton(b11);//help
		b1.setBounds(250,720,200,100);
		b1.setFont(f);
		b1.setForeground(Color.white);
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false); 
		add(b1);
		
		
		
		b2=new JButton(b22);//start
		b2.setBounds(1150,700,200,100);
		b2.setBorderPainted(false);
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		b2.setFont(f);
		
		add(b2);
		
		
		
		// b3=new JButton("next");
		// b3.setBounds(100,100,180,80);
		// add(b3);
	
		
	}
	public void paintComponent(Graphics g){
		Font f1=new Font("Algerian",150,150);
		Color c=new Color(212,212,212);
		g.setFont(f1);
		g.setColor(c);
			g.drawImage(bgblue,0,0,this);
			

			g.drawString("Online Examination",150,300);
		

	Font f2=new Font("Algerian",50,50);
		Color c1=new Color(200,200,200);
		g.setFont(f2);
		g.setColor(c1);		
		g.drawString("Let's adopt the smart way of learning....",680,370);
			
		}
}