import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class userLogin extends JPanel implements KeyListener{
		ImageIcon bg=new ImageIcon("bbg1.png");
		Image bgblue=bg.getImage();
		
	
		ImageIcon b22=new ImageIcon("imblank.png");//login
	
		ImageIcon b44=new ImageIcon("imback.png");
		ImageIcon b55=new ImageIcon("imblank.png");
		JTextField t1;
		JPasswordField t2;
		JButton b1,b3,b4,b2,b5;
	userLogin(){
		Font f1=new Font("Algerian",30,30);
		Font f2=new Font("Comic Sans MS",25,25);
		
		setFont(f1);
		
		 setLayout(null);
		 SwingConstants sc=new SwingConstants(){};
		 t1=new JTextField("Enter UserName");
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
		
		b1=new JButton("Login",b22);//login
		b1.setBounds(650,650,200,70);
		b1.setForeground(Color.white);
		b1.setFont(f2);
		b1.setHorizontalTextPosition(sc.CENTER);
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		add(b1);
		
		b2=new JButton("Forget Password",b22);//forgetPassword
		b2.setBounds(900,650,200,70);
		b2.setOpaque(false);
		b2.setForeground(Color.white);
		b2.setHorizontalTextPosition(sc.CENTER);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		add(b2);
		
		
		b5=new JButton("Register",b55);//register
		b5.setBounds(780,750,200,70);
		b5.setOpaque(false);
		b5.setHorizontalTextPosition(sc.CENTER);
		b5.setForeground(Color.white);
		b5.setFont(f2);
		b5.setBorderPainted(false);
		b5.setContentAreaFilled(false);
		add(b5);
		
		
		
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
		Font f1=new Font("Algerian",50,50);
		Color c=new Color(255,255,255);
		g.setFont(f1);
		g.setColor(c);
		g.drawImage(bgblue,0,0,this);
		ImageIcon i2=new ImageIcon("usericon.png");
		Image person=i2.getImage();
		g.drawImage(person,690,140,this);
		
		g.drawString("USER LOGIN",650,100);
		
			
		}
		public void keyPressed(KeyEvent e){
			if(t1.isFocusOwner()){
				
				String s=t1.getText();
				if(s.equals("Enter UserName")){
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
					t1.setText("Enter UserName");
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