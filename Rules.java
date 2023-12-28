import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class Rules extends JPanel{
		ImageIcon bg=new ImageIcon("bbb.png");
		Image bgblue=bg.getImage();
		
		ImageIcon b44=new ImageIcon("imback.png");
		
		
		ImageIcon im4=new ImageIcon("ims.png");
		JLabel l1;
		
		JButton b3,b4,start;
		
		
		
	Rules(){
		Font f1=new Font("Algerian",40,40);
		setFont(f1);
		Font f2=new Font("Algerian",14,14);
		
		 setLayout(null);
		
		l1=new JLabel();
		l1.setForeground(Color.cyan);
		l1.setFont(f1);
		l1.setBounds(900,50,400,90);
		add(l1);
		
		
		
		// b3=new JButton("next");
		// b3.setBounds(100,100,180,80);
		// add(b3);
		
		start=new JButton(im4);
		start.setBounds(1430,700,200,70);
		start.setBorderPainted(false);
		start.setOpaque(false);
		start.setContentAreaFilled(false);
		add(start);
		
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
		g.drawString("RULES",650,100);
		g.drawString("Rules to follow during all online proctored exams:",300,300);
		Font f2=new Font("Algerian",24,24);
		g.setFont(f2);
		g.drawString("-> You must use a functioning webcam and microphone",350,400);
		g.drawString("-> No cell phones or other secondary devices in the room or test area",350,470);
		g.drawString("-> Your desk/table must be clear or any materials except your test-taking device",350,540);
		g.drawString("-> No one else can be in the room with you",350,610);
		g.drawString("-> No use of additional applications or internet",350,680);
		g.drawString("-> No dual screens/monitors",350,750);
		
		
		
		
		
		}
		
}