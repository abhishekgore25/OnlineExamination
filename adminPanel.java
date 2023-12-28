import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class adminPanel extends JPanel{
		ImageIcon bg=new ImageIcon("bbback.png");
		Image bgblue=bg.getImage();
		
		ImageIcon im1=new ImageIcon("immc.png");
		ImageIcon im2=new ImageIcon("cr.png");
		ImageIcon im3=new ImageIcon("lg.png");
		ImageIcon im4=new ImageIcon("users.png");
		ImageIcon im5=new ImageIcon("imv.png");
		ImageIcon im6=new ImageIcon("cp.png");
		
		
		
		
		JButton b3;
		JButton b01,b02,b03,b04,b05,b06;
	adminPanel(){
		Font f1=new Font("Algerian",30,30);
		
		setFont(f1);
		
		 setLayout(null);
		 
		b01=new JButton(im1);//manageCourses
		b01.setBounds(760,270,200,70);
		b01.setOpaque(false);
		b01.setContentAreaFilled(false);
		b01.setBorderPainted(false);
		add(b01);
		
		b02=new JButton(im2);
		b02.setBounds(760,470,200,70);
		b02.setOpaque(false);
		b02.setContentAreaFilled(false);
		b02.setBorderPainted(false);
		add(b02);
		
		b03=new JButton(im3);//logout
		b03.setBounds(760,670,200,70);
		b03.setOpaque(false);
		b03.setContentAreaFilled(false);
		b03.setBorderPainted(false);
		add(b03);
		
		b04=new JButton(im4);
		b04.setBounds(1300,270,200,70);
		b04.setOpaque(false);
		b04.setContentAreaFilled(false);
		b04.setBorderPainted(false);
		add(b04);
		
		
		b05=new JButton(im5);
		b05.setBounds(1300,470,200,70);
		b05.setOpaque(false);
		b05.setContentAreaFilled(false);
		b05.setBorderPainted(false);
		add(b05);
		
		
		b06=new JButton(im6);
		b06.setBounds(1300,670,200,70);
		b06.setOpaque(false);
		b06.setContentAreaFilled(false);
		b06.setBorderPainted(false);
		add(b06);
		
		 
		
		
		
		
		// b3=new JButton("next");
		// b3.setBounds(100,100,180,80);
		// add(b3);
		
		
		
	}
	public void paintComponent(Graphics g){
		Font f1=new Font("Algerian",50,50);
		Color c=new Color(255,255,255);
		g.setFont(f1);
		g.setColor(c);
		g.drawImage(bgblue,0,0,this);
		ImageIcon i2=new ImageIcon("adminperson.png");
		Image person=i2.getImage();
		g.drawImage(person,30,20,this);
		
		
		ImageIcon i3=new ImageIcon("ad1.png");
		Image ad1=i3.getImage();
		g.drawImage(ad1,600,250,this);	
		
		ImageIcon i4=new ImageIcon("ad2.png");
		Image ad2=i4.getImage();
		g.drawImage(ad2,600,450,this);	
		
		ImageIcon i5=new ImageIcon("ad3.png");
		Image ad3=i5.getImage();
		g.drawImage(ad3,600,640,this);
		
		ImageIcon i6=new ImageIcon("ad4.png");
		Image ad4=i6.getImage();
		g.drawImage(ad4,1100,250,this);	
		
		ImageIcon i7=new ImageIcon("ad5.png");
		Image ad5=i7.getImage();
		g.drawImage(ad5,1100,450,this);	
		
		ImageIcon i8=new ImageIcon("ad6.png");
		Image ad6=i8.getImage();
		g.drawImage(ad6,1100,640,this);
		
		g.drawString("ADMIN PANEL",650,100);
		
			
		}
		
}