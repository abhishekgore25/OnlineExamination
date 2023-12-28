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
		
		JTable t1;
		
		JScrollPane js;
		String column[]={"S.NO","COURSE","TOTAL-QUES","ATTEMPTED-QUES","CORRECT-QUES","WRONG-QUES","TOTAL MARKS","MARKS-OBTAINED","PERCENTAGE","TIME TAKEN"};
		String data[][]=new String[100][10];
		
		
	ForAdminUserResult(){
		Font f1=new Font("Algerian",24,24);
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
		
		t1=new JTable(data,column);
		js=new JScrollPane(t1);
		js.setBounds(150,250,1500,500);
		js.setBackground(Color.black);
		js.setForeground(Color.black);
		js.setFont(f1);
		t1.setBackground(Color.black);
		t1.setForeground(Color.black);
		t1.setFont(f1);
		add(js);
		
		b3=new JButton("next");
		b3.setBounds(100,100,180,80);
		add(b3);
		
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
		
}