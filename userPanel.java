import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class userPanel extends JPanel{
		ImageIcon bg=new ImageIcon("bbback.png");
		Image bgblue=bg.getImage();
		
		ImageIcon im1=new ImageIcon("ed.png");
		ImageIcon im2=new ImageIcon("result.png");
		ImageIcon im3=new ImageIcon("imlg.png");
		ImageIcon im4=new ImageIcon("ims.png");
		
		JButton start;
		
		
	
		static String sub[]={}; 
		static JComboBox cb=new JComboBox(sub);
		JLabel l1,l2,l3;
		JLabel l11,l22,l33;
		JButton b3;
		JButton b01,b02,b03;
		static Font f=new Font("Algerian",18,18);
	
	
	userPanel(){
		
		Font f1=new Font("Algerian",30,30);

		setFont(f1);
		 setLayout(null);
		 
		 
		l1=new JLabel("Name:");
		l1.setFont(f);
		l1.setForeground(Color.white);
		l1.setBounds(20,400,150,60);
		add(l1);
		 
		l2=new JLabel("Roll-No:");
		l2.setFont(f);
		l2.setForeground(Color.white);
		l2.setBounds(20,470,150,60);
		add(l2);
		 
		l3=new JLabel("E-mail:");
		l3.setFont(f);
		l3.setForeground(Color.white);
		l3.setBounds(20,540,150,60);
		add(l3);
		 
		l11=new JLabel("");
		l11.setFont(f);
		l11.setForeground(Color.white);
		l11.setBounds(170,400,250,60);
		add(l11);
		 
		l22=new JLabel("");
		l22.setFont(f);
		l22.setForeground(Color.white);
		l22.setBounds(170,470,250,60);
		add(l22);
		 
		l33=new JLabel("");
		l33.setFont(f);
		l33.setForeground(Color.white);
		l33.setBounds(170,540,250,60);
		add(l33);
		 
		b01=new JButton(im1);
		b01.setBounds(500,460,200,70);
		b01.setOpaque(false);
		b01.setContentAreaFilled(false);
		b01.setBorderPainted(false);
		add(b01);
		
		b02=new JButton(im2);//result
		b02.setBounds(750,460,200,70);
		b02.setOpaque(false);
		b02.setContentAreaFilled(false);
		b02.setBorderPainted(false);
		add(b02);
		
		b03=new JButton(im3);//logout
		b03.setBounds(1000,460,200,70);
		b03.setOpaque(false);
		b03.setContentAreaFilled(false);
		b03.setBorderPainted(false);
		add(b03);
		
		
		
		 // cb=new JComboBox(s);
		// cb.setFont(f);
		// cb.setBackground(Color.black);
		// cb.setForeground(Color.gray);
		// cb.setBounds(650,600,400,50);
		add(userPanel.show4());
		
		
		start=new JButton(im4);
		start.setBounds(730,720,200,70);
		start.setBorderPainted(false);
		start.setOpaque(false);
		start.setContentAreaFilled(false);
		add(start);
		
		
		// b3=new JButton("next");
		// b3.setBounds(0,0,180,80);
		// add(b3);
		
		
		
	}
	public void paintComponent(Graphics g){
		Font f1=new Font("Algerian",50,50);
		Color c=new Color(255,255,255);
		g.setFont(f1);
		g.setColor(c);
		g.drawImage(bgblue,0,0,this);
		
		ImageIcon i2=new ImageIcon("imstudent2.png");
		Image person1=i2.getImage();
		g.drawImage(person1,30,20,this);
		
		
		ImageIcon i31=new ImageIcon("imrevstudent.png");
		Image person=i31.getImage();
		g.drawImage(person,1300,500,this);
		
		
		ImageIcon i3=new ImageIcon("ad1.png");
		Image ad1=i3.getImage();
		g.drawImage(ad1,500,290,this);	
		
		ImageIcon i4=new ImageIcon("ad2.png");
		Image ad2=i4.getImage();
		g.drawImage(ad2,750,290,this);	
		
		ImageIcon i5=new ImageIcon("ad3.png");
		Image ad3=i5.getImage();
		g.drawImage(ad3,1000,290,this);
		
		
		g.drawString("USER PANEL",650,100);
		
			
		}
		
		public static JComboBox show4(){
			
		userPanel.cb.setFont(f);
		userPanel.cb.setBackground(Color.black);
		userPanel.cb.setForeground(Color.gray);
		userPanel.cb.setBounds(650,600,400,50);
			return userPanel.cb;
		}
		
}