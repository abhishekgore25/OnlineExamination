import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
class coursePage extends JPanel{
		ImageIcon bg=new ImageIcon("bbb.png");
		Image bgblu=bg.getImage();
		ImageIcon b44=new ImageIcon("imback.png");
		ImageIcon b11=new ImageIcon("save.png");
		JButton b3,b4;
		Icon i1=new ImageIcon("imaf.png");
		Icon i2=new ImageIcon("imview.png");
		Icon i3=new ImageIcon("imu.png");
		Icon i4=new ImageIcon("imr.png");
		JTabbedPane tb;
		
		New n;
		View v;
		Update u;
		Remove r;
		
		static JLabel coursen;
		static JLabel mark,tq,tq1;
		
		static JTextField t1,t2,t3,t4;
		
		static JButton b1;
		
		Font fn=new Font("Algerian",50,50);
	coursePage(){
		
		setLayout(null);
		Font f=new Font("Algerian",24,24);
		
		
		coursen=new JLabel();
		coursen.setBounds(950,50,500,60);
		coursen.setBackground(Color.black);
		coursen.setForeground(Color.cyan);
		coursen.setFont(fn);
		add(coursen);
		
		t1=new JTextField();
		t1.setBounds(1300,300,50,50);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		t1.setFont(f);
		add(t1);
		
		t2=new JTextField();
		t2.setBounds(1400,300,50,50);
		t2.setBackground(Color.black);
		t2.setForeground(Color.white);
		t2.setFont(f);
		add(t2);
		
		t3=new JTextField();
		t3.setBounds(1500,300,50,50);
		t3.setBackground(Color.black);
		t3.setForeground(Color.white);
		t3.setFont(f);
		add(t3);
		
		mark=new JLabel("EACH MARKS:");
		mark.setBounds(1300,400,200,30);
		mark.setBackground(Color.black);
		mark.setForeground(Color.cyan);
		mark.setFont(f);
		add(mark);
		
		
		t4=new JTextField();//marks textfield
		t4.setBounds(1500,400,50,50);
		t4.setBackground(Color.black);
		t4.setForeground(Color.white);
		t4.setFont(f);
		add(t4);
		
		
		
		
		tq=new JLabel("Total Questions:");
		tq.setBounds(1300,500,200,30);
		tq.setBackground(Color.black);
		tq.setForeground(Color.cyan);
		tq.setFont(f);
		add(tq);
		
		tq1=new JLabel("totalqno");//total questtion
		tq1.setBounds(1500,500,200,30);
		tq1.setBackground(Color.black);
		tq1.setForeground(Color.cyan);
		tq1.setFont(f);
		add(tq1);
		
		
		
		
		
		
		
		tb=new JTabbedPane();
		tb.setFont(f);
		tb.setBackground(Color.black);
		tb.setForeground(Color.gray);
		tb.setBounds(160,110,880,700);
		
		
		
		
		n=new New();
		tb.addTab("New",i1,n);
		
		v=new View();
		tb.addTab("View",i2,v);
		
		u=new Update();
		tb.addTab("Update",i3,u);
		
		r=new Remove();
		tb.addTab("Remove",i4,r);
		
		
		b1=new JButton(b11);
		b1.setBounds(1480,770,200,70);
		b1.setContentAreaFilled(false);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		
		add(b1);
		
		// b3=new JButton("next");
		// b3.setBounds(0,0,180,80);
		// add(b3);
		
		
		b4=new JButton(b44);
		b4.setBounds(5,780,190,100);
		b4.setContentAreaFilled(false);
		b4.setOpaque(false);
		b4.setBorderPainted(false);
		add(b4);
		
		add(tb);
	}
	public void paintComponent(Graphics g){
		Font f1=new Font("Algerian",50,50);
		Color c=new Color(255,255,255);
		g.setFont(f1);
		g.setColor(c);
		g.drawImage(bgblu,0,0,this);
		
		
		ImageIcon boy=new ImageIcon("timer.png");
		Image im5=boy.getImage();
		g.drawImage(im5,1050,430,this);
		
		g.drawString("COURSE:",650,100);
		
		g.drawString("SET TIME",1300,250);
		g.drawString(":",1360,350);
		g.drawString(":",1460,350);
			
		}
		
}

class New extends JPanel implements ActionListener
{
	Font fn=new Font("Segoe UI Black",18,18);
	Font fn1=new Font("Segoe UI Black",24,24);
	ImageIcon b11=new ImageIcon("imadd.png");
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField id;
	JTextArea ta;
	JTextField t1,t2,t3,t4,t5;
	
	JButton b1;
	New(){
		
		setLayout(null);
		setBackground(Color.black);
		setForeground(Color.gray);
		
		l1=new JLabel("Question-ID: ");
		l1.setBounds(20,10,150,30);
		l1.setFont(fn);
		l1.setForeground(Color.white);
		add(l1);
		
		id=new JTextField();
		id.setBounds(260,10,150,30);
		id.setFont(fn);
		id.setForeground(Color.black);
		add(id);
		
		l2=new JLabel("Question-Statement: ");
		l2.setBounds(20,60,250,30);
		l2.setFont(fn);
		l2.setForeground(Color.white);
		add(l2);
		
		ta=new JTextArea();
		ta.setBounds(260,60,550,250);
		ta.setBackground(Color.gray);
		ta.setForeground(Color.black);
		ta.setFont(fn1);
		add(ta);
		
		
		l3=new JLabel("Option a: ");
		l3.setBounds(20,350,250,30);
		l3.setFont(fn);
		l3.setForeground(Color.white);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(260,350,550,30);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		t1.setFont(fn);
		add(t1);
		
		l4=new JLabel("Option b: ");
		l4.setBounds(20,400,250,30);
		l4.setFont(fn);
		l4.setForeground(Color.white);
		add(l4);
		
		t2=new JTextField();
		t2.setBounds(260,400,550,30);
		t2.setBackground(Color.black);
		t2.setForeground(Color.white);
		t2.setFont(fn);
		add(t2);
		
		l5=new JLabel("Option c: ");
		l5.setBounds(20,450,250,30);
		l5.setFont(fn);
		l5.setForeground(Color.white);
		add(l5);
		
		
		
		t3=new JTextField();
		t3.setBounds(260,450,550,30);
		t3.setBackground(Color.black);
		t3.setForeground(Color.white);
		t3.setFont(fn);
		add(t3);
		
		l6=new JLabel("Option d: ");
		l6.setBounds(20,500,250,30);
		l6.setFont(fn);
		l6.setForeground(Color.white);
		add(l6);
		
		
		
		t4=new JTextField();
		t4.setBounds(260,500,550,30);
		t4.setBackground(Color.black);
		t4.setForeground(Color.white);
		t4.setFont(fn);
		add(t4);
		
		l7=new JLabel("Correct Option: ");
		l7.setBounds(20,550,250,30);
		l7.setFont(fn);
		l7.setForeground(Color.white);
		add(l7);
		
		
		
		t5=new JTextField();
		t5.setBounds(260,550,550,30);
		t5.setBackground(Color.black);
		t5.setForeground(Color.white);
		t5.setFont(fn);
		add(t5);
		
		
		b1=new JButton(b11);
		b1.setBounds(10,590,200,50);
		b1.setContentAreaFilled(false);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		b1.addActionListener(this);
		add(b1);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			String c=coursePage.coursen.getText();
			String s1=id.getText();
			String s2=ta.getText();
			String s3=t1.getText();
			String s4=t2.getText();
			String s5=t3.getText();
			String s6=t4.getText();
			String s7=t5.getText();
			if(s6.equals("") || s2.equals("") || s3.equals("")|| s4.equals("")|| s5.equals("")|| s6.equals("")){
				JOptionPane.showMessageDialog(null,"fill Complete Fields","EMPTY",JOptionPane.ERROR_MESSAGE);
				
			}else{
				
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
						Statement st=con1.createStatement();
						String q="select * from "+c+" where questionid='"+s1+"' ";
						ResultSet rs=st.executeQuery(q);
						if(rs.next()){
							
				JOptionPane.showMessageDialog(null,"This Question ID Is Already Exist..","EMPTY",JOptionPane.ERROR_MESSAGE);
						}else{
							st.executeUpdate("insert into "+c+" values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')");
							
							String q1="select totalquestion from courses where name='"+c+"'";
							ResultSet rs2=st.executeQuery(q1);
							if(rs2.next()){
								int x=Integer.parseInt(rs2.getString(1));
								x++;
							st.executeUpdate("update courses set totalquestion='"+x+"'where name='"+c+"'");
							coursePage.tq1.setText(""+x);
							}
						}
						
			id.setText("");
			ta.setText("");
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
					
						
				
			}catch(Exception e2){
				System.out.println(e2);
			}
			}
		}
	}
}



class View extends JPanel implements ActionListener{
	
	static Font fn=new Font("Segoe UI Black",18,18);
	Font fn1=new Font("Segoe UI Black",24,24);
	
	JLabel l1,l2,l3,l4,l5,l6,l7;
	static String idn[]={};
	static JComboBox id=new JComboBox(idn);
	JTextArea ta;
	JTextField t1,t2,t3,t4,t5;
	ImageIcon b11=new ImageIcon("imshow.png");
	JButton b1;
	View(){
		
		setLayout(null);
		setBackground(Color.black);
		setForeground(Color.gray);
		
		l1=new JLabel("Question-ID: ");
		l1.setBounds(20,10,150,30);
		l1.setFont(fn);
		l1.setForeground(Color.white);
		add(l1);
		
		
		// id.setBounds(260,10,150,30);
		// id.setFont(fn);
		// id.setForeground(Color.white);
		// add(id);
		add(View.show3());
		
		l2=new JLabel("Question-Statement: ");
		l2.setBounds(20,60,250,30);
		l2.setFont(fn);
		l2.setForeground(Color.white);
		add(l2);
		
		ta=new JTextArea();
		ta.setBounds(260,60,550,250);
		ta.setBackground(Color.gray);
		ta.setForeground(Color.black);
		ta.setFont(fn1);
		add(ta);
		
		
		l3=new JLabel("Option a: ");
		l3.setBounds(20,350,250,30);
		l3.setFont(fn);
		l3.setForeground(Color.white);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(260,350,550,30);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		t1.setFont(fn);
		add(t1);
		
		l4=new JLabel("Option b: ");
		l4.setBounds(20,400,250,30);
		l4.setFont(fn);
		l4.setForeground(Color.white);
		add(l4);
		
		t2=new JTextField();
		t2.setBounds(260,400,550,30);
		t2.setBackground(Color.black);
		t2.setForeground(Color.white);
		t2.setFont(fn);
		add(t2);
		
		l5=new JLabel("Option c: ");
		l5.setBounds(20,450,250,30);
		l5.setFont(fn);
		l5.setForeground(Color.white);
		add(l5);
		
		
		
		t3=new JTextField();
		t3.setBounds(260,450,550,30);
		t3.setBackground(Color.black);
		t3.setForeground(Color.white);
		t3.setFont(fn);
		add(t3);
		
		l6=new JLabel("Option d: ");
		l6.setBounds(20,500,250,30);
		l6.setFont(fn);
		l6.setForeground(Color.white);
		add(l6);
		
		
		
		t4=new JTextField();
		t4.setBounds(260,500,550,30);
		t4.setBackground(Color.black);
		t4.setForeground(Color.white);
		t4.setFont(fn);
		add(t4);
		
		l7=new JLabel("Correct Option: ");
		l7.setBounds(20,550,250,30);
		l7.setFont(fn);
		l7.setForeground(Color.white);
		add(l7);
		
		
		
		t5=new JTextField();
		t5.setBounds(260,550,550,30);
		t5.setBackground(Color.black);
		t5.setForeground(Color.white);
		t5.setFont(fn);
		add(t5);
		
		
		b1=new JButton(b11);
		b1.setBounds(10,590,200,50);
		b1.setContentAreaFilled(false);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		add(b1);
		b1.addActionListener(this);
	}
	public static JComboBox show3(){
		
		 View.id.setBounds(260,10,150,30);
		 View.id.setFont(View.fn);
		View.id.setForeground(Color.black);
		 return id;
	}
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			String c=coursePage.coursen.getText();
			// String s1=id.getText();
			// String s2=ta.getText();
			// String s3=t1.getText();
			// String s4=t2.getText();
			// String s5=t3.getText();
			// String s6=t4.getText();
			// String s7=t5.getText();
			
			ta.setText("");
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
						Statement st=con1.createStatement();
						// String q="select questionid from "+c;
						// ResultSet rs=st.executeQuery(q);
						// View.id.removeAllItems();
						// while(rs.next()){
							// View.id.addItem(rs.getString(1));
						// }
						// View.show3();
						String s=(String)View.id.getSelectedItem();
						ResultSet rs2=st.executeQuery("select * from "+c+" where questionid='"+s+"'");
						if(rs2.next()){
							ta.setText(rs2.getString(2));
							t1.setText(rs2.getString(3));
							t2.setText(rs2.getString(4));
							t3.setText(rs2.getString(5));
							t4.setText(rs2.getString(6));
							t5.setText(rs2.getString(7));
						}
						
						
						con1.close();
						
						
		}catch(Exception e2){
				System.out.println(e2);
			}
			
		}
	}
}



class Update extends JPanel implements ActionListener{
	static Font fn=new Font("Segoe UI Black",18,18);
	Font fn1=new Font("Segoe UI Black",24,24);
	
	
	static String idn[]={};
	static JComboBox id=new JComboBox(idn);
	
	JLabel l1,l2,l3,l4,l5,l6,l7;
	
	JTextArea ta;
	JTextField t1,t2,t3,t4,t5;
	
	ImageIcon b11=new ImageIcon("imupdate.png");
	ImageIcon b22=new ImageIcon("imshow.png");
	JButton b1,b2;
	
	
	Update(){
		
		setLayout(null);
		setBackground(Color.black);
		setForeground(Color.gray);
		
		l1=new JLabel("Question-ID: ");
		l1.setBounds(20,10,150,30);
		l1.setFont(fn);
		l1.setForeground(Color.white);
		add(l1);
		
		// id=new JLabel("idlabel");
		// id.setBounds(260,10,150,30);
		// id.setFont(fn);
		// id.setForeground(Color.white);
		// add(id);
		add(Update.show3());
		
		
		l2=new JLabel("Question-Statement: ");
		l2.setBounds(20,60,250,30);
		l2.setFont(fn);
		l2.setForeground(Color.white);
		add(l2);
		
		ta=new JTextArea();
		ta.setBounds(260,60,550,250);
		ta.setBackground(Color.gray);
		ta.setForeground(Color.black);
		ta.setFont(fn1);
		add(ta);
		
		
		l3=new JLabel("Option a: ");
		l3.setBounds(20,350,250,30);
		l3.setFont(fn);
		l3.setForeground(Color.white);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(260,350,550,30);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		t1.setFont(fn);
		add(t1);
		
		l4=new JLabel("Option b: ");
		l4.setBounds(20,400,250,30);
		l4.setFont(fn);
		l4.setForeground(Color.white);
		add(l4);
		
		t2=new JTextField();
		t2.setBounds(260,400,550,30);
		t2.setBackground(Color.black);
		t2.setForeground(Color.white);
		t2.setFont(fn);
		add(t2);
		
		l5=new JLabel("Option c: ");
		l5.setBounds(20,450,250,30);
		l5.setFont(fn);
		l5.setForeground(Color.white);
		add(l5);
		
		
		
		t3=new JTextField();
		t3.setBounds(260,450,550,30);
		t3.setBackground(Color.black);
		t3.setForeground(Color.white);
		t3.setFont(fn);
		add(t3);
		
		l6=new JLabel("Option d: ");
		l6.setBounds(20,500,250,30);
		l6.setFont(fn);
		l6.setForeground(Color.white);
		add(l6);
		
		
		
		t4=new JTextField();
		t4.setBounds(260,500,550,30);
		t4.setBackground(Color.black);
		t4.setForeground(Color.white);
		t4.setFont(fn);
		add(t4);
		
		l7=new JLabel("Correct Option: ");
		l7.setBounds(20,550,250,30);
		l7.setFont(fn);
		l7.setForeground(Color.white);
		add(l7);
		
		
		
		t5=new JTextField();
		t5.setBounds(260,550,550,30);
		t5.setBackground(Color.black);
		t5.setForeground(Color.white);
		t5.setFont(fn);
		add(t5);
		
		
		b1=new JButton(b11);
		b1.setBounds(10,590,200,50);
		b1.setContentAreaFilled(false);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		b1.addActionListener(this);
		add(b1);
		
		
		
		b2=new JButton(b22);
		b2.setBounds(700,590,200,50);
		b2.setContentAreaFilled(false);
		b2.setOpaque(false);
		b2.setBorderPainted(false);
		add(b2);
		b2.addActionListener(this);
	}
	public static JComboBox show3(){
		
		 Update.id.setBounds(260,10,150,30);
		 Update.id.setFont(Update.fn);
		 
		Update.id.setForeground(Color.black);
		 return Update.id;
	}
	public void actionPerformed(ActionEvent e2){
		
			if(e2.getSource()==b2){
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
						Statement st=con1.createStatement();
						String c=coursePage.coursen.getText();
						String s=(String)Update.id.getSelectedItem();
						ResultSet rs2=st.executeQuery("select * from "+c+" where questionid='"+s+"'");
						if(rs2.next()){
							ta.setText(rs2.getString(2));
							t1.setText(rs2.getString(3));
							t2.setText(rs2.getString(4));
							t3.setText(rs2.getString(5));
							t4.setText(rs2.getString(6));
							t5.setText(rs2.getString(7));
						}
						
						
						con1.close();
						
						
		}catch(Exception e4){
				System.out.println(e4);
			}
			}
			
			
			if(e2.getSource()==b1){
				String c=coursePage.coursen.getText();
			String s1=(String)Update.id.getSelectedItem();
			String s2=ta.getText();
			String s3=t1.getText();
			String s4=t2.getText();
			String s5=t3.getText();
			String s6=t4.getText();
			String s7=t5.getText();
						try{
				Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
						Statement st=con1.createStatement();
						if(s1.equals("") || s2.equals("")||s3.equals("")||s4.equals("")||s5.equals("")||s6.equals("")||s7.equals("")){
							
						JOptionPane.showMessageDialog(null,"Please Enter Data to Update..","EMPTY",JOptionPane.ERROR_MESSAGE);
						}else
						{
							String q="update "+c+" set question='"+s2+"',o1='"+s3+"',o2='"+s4+"',o3='"+s5+"',o4='"+s6+"',correct='"+s7+"' where questionid='"+s1+"'";
					st.executeUpdate(q);
						con1.close();
						JOptionPane.showMessageDialog(null,"Qusetion Is Updated Successfully..","DATA UPDATED",JOptionPane.INFORMATION_MESSAGE);
						}
		}catch(Exception e4){
				System.out.println(e4);
			}
			}
			
		}
	}
	
	
	





class Remove extends JPanel implements ActionListener{
	static Font fn=new Font("Segoe UI Black",18,18);
	Font fn1=new Font("Segoe UI Black",24,24);
	
	
	static String idn[]={};
	static JComboBox id=new JComboBox(idn);
	
	JLabel l1,l2,l3,l4,l5,l6,l7;
	
	JTextArea ta;
	JTextField t1,t2,t3,t4,t5;
	
	ImageIcon b11=new ImageIcon("imremove.png");
	ImageIcon b22=new ImageIcon("imshow.png");
	JButton b1,b2;
	
	
	Remove(){
		
		setLayout(null);
		setBackground(Color.black);
		setForeground(Color.gray);
		
		l1=new JLabel("Question-ID: ");
		l1.setBounds(20,10,150,30);
		l1.setFont(fn);
		l1.setForeground(Color.white);
		add(l1);
		
		// id=new JLabel("idlabel");
		// id.setBounds(260,10,150,30);
		// id.setFont(fn);
		// id.setForeground(Color.white);
		// add(id);
		add(Remove.show3());
		
		
		l2=new JLabel("Question-Statement: ");
		l2.setBounds(20,60,250,30);
		l2.setFont(fn);
		l2.setForeground(Color.white);
		add(l2);
		
		ta=new JTextArea();
		ta.setBounds(260,60,550,250);
		ta.setBackground(Color.gray);
		ta.setForeground(Color.black);
		ta.setFont(fn1);
		add(ta);
		
		
		l3=new JLabel("Option a: ");
		l3.setBounds(20,350,250,30);
		l3.setFont(fn);
		l3.setForeground(Color.white);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(260,350,550,30);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		t1.setFont(fn);
		add(t1);
		
		l4=new JLabel("Option b: ");
		l4.setBounds(20,400,250,30);
		l4.setFont(fn);
		l4.setForeground(Color.white);
		add(l4);
		
		t2=new JTextField();
		t2.setBounds(260,400,550,30);
		t2.setBackground(Color.black);
		t2.setForeground(Color.white);
		t2.setFont(fn);
		add(t2);
		
		l5=new JLabel("Option c: ");
		l5.setBounds(20,450,250,30);
		l5.setFont(fn);
		l5.setForeground(Color.white);
		add(l5);
		
		
		
		t3=new JTextField();
		t3.setBounds(260,450,550,30);
		t3.setBackground(Color.black);
		t3.setForeground(Color.white);
		t3.setFont(fn);
		add(t3);
		
		l6=new JLabel("Option d: ");
		l6.setBounds(20,500,250,30);
		l6.setFont(fn);
		l6.setForeground(Color.white);
		add(l6);
		
		
		
		t4=new JTextField();
		t4.setBounds(260,500,550,30);
		t4.setBackground(Color.black);
		t4.setForeground(Color.white);
		t4.setFont(fn);
		add(t4);
		
		l7=new JLabel("Correct Option: ");
		l7.setBounds(20,550,250,30);
		l7.setFont(fn);
		l7.setForeground(Color.white);
		add(l7);
		
		
		
		t5=new JTextField();
		t5.setBounds(260,550,550,30);
		t5.setBackground(Color.black);
		t5.setForeground(Color.white);
		t5.setFont(fn);
		add(t5);
		
		
		b1=new JButton(b11);
		b1.setBounds(10,590,200,50);
		b1.setContentAreaFilled(false);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		b1.addActionListener(this);
		add(b1);
		
		
		
		b2=new JButton(b22);
		b2.setBounds(700,590,200,50);
		b2.setContentAreaFilled(false);
		b2.setOpaque(false);
		b2.setBorderPainted(false);
		add(b2);
		b2.addActionListener(this);
	}
	public static JComboBox show3(){
		
		 Remove.id.setBounds(260,10,150,30);
		 Remove.id.setFont(Remove.fn);
		 
		Remove.id.setForeground(Color.black);
		 return Remove.id;
	}
	public void actionPerformed(ActionEvent e2){
		
			if(e2.getSource()==b2){
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
						Statement st=con1.createStatement();
						String c=coursePage.coursen.getText();
						String s=(String)Remove.id.getSelectedItem();
						ResultSet rs2=st.executeQuery("select * from "+c+" where questionid='"+s+"'");
						if(rs2.next()){
							ta.setText(rs2.getString(2));
							t1.setText(rs2.getString(3));
							t2.setText(rs2.getString(4));
							t3.setText(rs2.getString(5));
							t4.setText(rs2.getString(6));
							t5.setText(rs2.getString(7));
						}
						
						
						con1.close();
						
						
		}catch(Exception e4){
				System.out.println(e4);
			}
			}
			if(e2.getSource()==b1){
				String c=coursePage.coursen.getText();
			String s1=(String)Remove.id.getSelectedItem();
			
						try{
				Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
						Statement st=con1.createStatement();
					String q="Delete from "+c+" where questionid='"+s1+"'";
					st.executeUpdate(q);
						JOptionPane.showMessageDialog(null,"Qusetion Is Deleted Successfully..","DATA Deleted",JOptionPane.INFORMATION_MESSAGE);
						ta.setText("");
							t1.setText("");
							t2.setText("");
							t3.setText("");
							t4.setText("");
							t5.setText("");
						String q1="select totalquestion from courses where name='"+c+"'";
							ResultSet rs2=st.executeQuery(q1);
							if(rs2.next()){
								int x=Integer.parseInt(rs2.getString(1));
								x--;
							st.executeUpdate("update courses set totalquestion='"+x+"'where name='"+c+"'");
							coursePage.tq1.setText(""+x);
						
						con1.close();
		}
						}catch(Exception e4){
				System.out.println(e4);
			}
			}
			
		}
	}
	
