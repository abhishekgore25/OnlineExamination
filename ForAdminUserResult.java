import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class ForAdminUserResult extends JPanel{
		ImageIcon bg=new ImageIcon("bbb.png");
		Image bgblue=bg.getImage();
		
		ImageIcon b44=new ImageIcon("imback.png");
		ImageIcon b11=new ImageIcon("showresult.png");
		
		
		JLabel l1,l2,l3,l4;
		
		JButton b3,b4;
		
		static String column[]={"COURSE","TOTAL-QUES","ATTEMPTED-QUES","CORRECT-Answer","WRONG-Answer","MARKS Obtained","Total-Marks","Percentage"};
		static String data[][]=new String[100][8];
		
		
		static JTable t1=new JTable(data,column);
		static JScrollPane js=new JScrollPane(t1);;
		
		static Font f1=new Font("Algerian",14,14);
		
	ForAdminUserResult(){
		setFont(f1);
		Font f2=new Font("Algerian",14,14);
		
		 setLayout(null);
		
		l1=new JLabel("Student Name:");
		l1.setForeground(Color.white);
		l1.setFont(f1);
		l1.setBounds(300,200,300,40);
		add(l1);
		
		l2=new JLabel("");
		l2.setForeground(Color.white);
		l2.setFont(f1);
		l2.setBounds(600,200,300,40);
		add(l2);
		
		l3=new JLabel("Student Roll-No :");
		l3.setForeground(Color.white);
		l3.setFont(f1);
		l3.setBounds(900,200,300,40);
		add(l3);
		
		l4=new JLabel("");
		l4.setForeground(Color.white);
		l4.setFont(f1);
		l4.setBounds(1200,200,300,40);
		add(l4);
		
		
		// js.setBounds(150,250,1500,500);
		// js.setBackground(Color.black);
		// js.setForeground(Color.white);
		// js.setFont(f1);
		// t1.setBackground(Color.black);
		// t1.setForeground(Color.white);
		// t1.setFont(f1);
		add(ForAdminUserResult.show4());
		
		// b3=new JButton("next");
		// b3.setBounds(100,100,180,80);
		// add(b3);
		
			b4=new JButton(b44);//back
		b4.setBounds(50,800,190,100);
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
		
		
		
		g.drawString("RESULT",650,100);
		
		
		}
		
		static JScrollPane show4(){
			
		js.setBounds(150,250,1500,500);
		js.setBackground(Color.black);
		js.setForeground(Color.white);
		js.setFont(f1);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		t1.setFont(f1);
		return js;
		}
		
}