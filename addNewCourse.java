import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class addNewCourse extends JPanel implements KeyListener{
		ImageIcon bg=new ImageIcon("bbb.png");
		Image bgblu=bg.getImage();
		ImageIcon b44=new ImageIcon("imback.png");
		ImageIcon b011=new ImageIcon("imanc.png");
		JButton b3,b4;
		JButton b01;
		
		JTextField t1,t2,t3,t4;
		JComboBox cb;
		String s[]={"Marks","1","2","3","4","5","6","7","8","9","10"};
	addNewCourse(){
		
		setLayout(null);
		Font f=new Font("Algerian",24,24);
		
		
		// b3=new JButton("next");
		// b3.setBounds(0,0,180,80);
		// add(b3);
		
		b4=new JButton(b44);//back
		b4.setBounds(50,700,190,100);
		b4.setContentAreaFilled(false);
		b4.setOpaque(false);
		b4.setBorderPainted(false);
		add(b4);
		
		t1=new JTextField("Course Name");
		t1.setBounds(620,600,500,50);
		t1.setFont(f);
		t1.setBackground(Color.black);
		t1.setForeground(Color.gray);
		t1.addKeyListener(this);
		add(t1);
		
		
		t2=new JTextField("Hour");
		t2.setBounds(620,670,100,50);
		t2.setFont(f);
		t2.setBackground(Color.black);
		t2.setForeground(Color.gray);
		t2.addKeyListener(this);
		add(t2);
		
		
		t3=new JTextField("Minutes");
		t3.setBounds(750,670,100,50);
		t3.setFont(f);
		t3.setBackground(Color.black);
		t3.setForeground(Color.gray);
		t3.addKeyListener(this);
		add(t3);
		
		t4=new JTextField("Seconds");
		t4.setBounds(880,670,100,50);
		t4.setFont(f);
		t4.setBackground(Color.black);
		t4.setForeground(Color.gray);
		t4.addKeyListener(this);
		add(t4);
		
		cb=new JComboBox(s);
		cb.setFont(f);
		cb.setBackground(Color.black);
		cb.setForeground(Color.gray);
		cb.setBounds(1000,670,100,50);
		add(cb);
		
		b01=new JButton(b011);//anc
		b01.setBounds(780,730,250,90);
		b01.setOpaque(false);
		b01.setContentAreaFilled(false);
		b01.setBorderPainted(false);
		add(b01);
		
		
	
	}
	public void paintComponent(Graphics g){
		Font f1=new Font("Algerian",50,50);
		Color c=new Color(255,255,255);
		g.setFont(f1);
		g.setColor(c);
		g.drawImage(bgblu,0,0,this);
		
		ImageIcon i=new ImageIcon("addfile.png");
		Image af=i.getImage();
		g.drawImage(af,660,150,this);
		
		g.drawString("ADD NEW COURSE",650,100);
		
			
		}
		public void keyReleased(KeyEvent e){
			if(t1.isFocusOwner()){
				String s=t1.getText().trim();
				if(s.equals("")){
					t1.setForeground(Color.gray);
					t1.setText("Course Name");
				}
			}
			
			if(t2.isFocusOwner()){
				String s=t2.getText().trim();
				if(s.equals("")){
					t2.setForeground(Color.gray);
					t2.setText("Hour");
				}
			}
			if(t3.isFocusOwner()){
				String s=t3.getText().trim();
				if(s.equals("")){
					t3.setForeground(Color.gray);
					t3.setText("Minutes");
				}
			}
			if(t4.isFocusOwner()){
				String s=t4.getText().trim();
				if(s.equals("")){
					t4.setForeground(Color.gray);
					t4.setText("Seconds");
				}
			}
			
		}
		public void keyPressed(KeyEvent e){
			if(t1.isFocusOwner()){
				String s=t1.getText().trim();
				if(s.equals("Course Name")){
					t1.setText("");
					t1.setForeground(Color.white);
				}
			}
			if(t2.isFocusOwner()){
				String s=t2.getText().trim();
				if(s.equals("Hour")){
					t2.setText("");
					t2.setForeground(Color.white);
				}
			}
			
			if(t3.isFocusOwner()){
				String s=t3.getText().trim();
				if(s.equals("Minutes")){
					t3.setText("");
					t3.setForeground(Color.white);
				}
			}
			
			if(t4.isFocusOwner()){
				String s=t4.getText().trim();
				if(s.equals("Seconds")){
					t4.setText("");
					t4.setForeground(Color.white);
				}
			}
		}
		public void keyTyped(KeyEvent e){
			
		}
		
}
