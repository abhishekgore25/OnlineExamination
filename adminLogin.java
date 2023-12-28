import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class adminLogin extends JPanel implements KeyListener{
		ImageIcon bg=new ImageIcon("bbg1.png");
		Image bgblue=bg.getImage();
		
		ImageIcon b11=new ImageIcon("imlogin.png");
		ImageIcon b44=new ImageIcon("imback.png");
		JTextField t1;
		JPasswordField t2;
		JButton b1,b3,b4;
	adminLogin(){
		Font f1=new Font("Algerian",30,30);
		
		setFont(f1);
		
		 setLayout(null);
		 
		 t1=new JTextField("Enter Name");
		 t1.setBackground(Color.black);
		 t1.setForeground(Color.gray);
		 t1.setBounds(670,500,400,40);
		 t1.addKeyListener(this);
		 t1.setFont(f1);
		 add(t1); 
		 
		 t2=new JPasswordField("Enter Password");
		 t2.setBackground(Color.black);
		 t2.setForeground(Color.gray);
		 t2.setBounds(670,570,400,40);
		 t2.addKeyListener(this);
		 t2.setEchoChar((char)0);
		  t2.setFont(f1);
		 add(t2);
		
		b1=new JButton(b11);//login
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		b1.setBounds(730,650,290,90);
		add(b1);
		
		// b3=new JButton("next");
		// b3.setBounds(100,100,180,80);
		// add(b3);
		
		b4=new JButton(b44);
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
		ImageIcon i2=new ImageIcon("adminperson.png");
		Image person=i2.getImage();
		g.drawImage(person,690,140,this);
		
		g.drawString("ADMIN LOGIN",650,100);
		
			
		}
		public void keyPressed(KeyEvent e){
			if(t1.isFocusOwner()){
				
				String s=t1.getText();
				if(s.equals("Enter Name")){
					t1.setText("");
					t1.setForeground(Color.white);
					
				}
			}
			if(t2.isFocusOwner()){
			
				String s=t2.getText();
				if(s.equals("Enter Password")){
					t2.setText("");
					t2.setForeground(Color.white);
					t2.setEchoChar('*');
					
				}
			}
		}
		public void keyReleased(KeyEvent e){
			if(t1.isFocusOwner()){
					
				String s=t1.getText().trim();
				if(s.equals("")){
					t1.setForeground(Color.gray);
					t1.setText("Enter Name");
				}
			}
			if(t2.isFocusOwner()){
					
				String s=t2.getText().trim();
				if(s.equals("")){
					t2.setEchoChar((char)0);
					t2.setForeground(Color.gray);
					t2.setText("Enter Password");
				}
			}
		}
		public void keyTyped(KeyEvent e){
			
		}
}