import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Paper extends JPanel{
	
	ImageIcon bg=new ImageIcon("bbb.png");
	ImageIcon r=new ImageIcon("right.png");
	
	ImageIcon p1=new ImageIcon("imp.png");
	ImageIcon n1=new ImageIcon("imn.png");
	ImageIcon sub=new ImageIcon("imsub.png");
	Image bgblue=bg.getImage();
	Font fn=new Font("Segoe UI Black",20,20);
	Font fn1=new Font("Segoe UI Black",24,24);
	Font f=new Font("Segoe UI Black",44,44);
	ImageIcon b11=new ImageIcon("imadd.png");
	
	JLabel l1,l3,l4;
	JTextArea l2;
	JLabel cn;
	ButtonGroup BG;
	JButton p,n,s;
	JRadioButton o1,o2,o3,o4;
	
	JLabel qa,qa1,qr,qr1;
	JTextField t1,t2,t3;
	
	
	Paper(){
		
		
		Color c2=new Color(51,0,0);
	
		setLayout(null);
	cn=new JLabel("Course name");
	cn.setBounds(670,100,300,50);
	cn.setForeground(Color.red);
	cn.setBackground(Color.black);
	cn.setFont(f);
	add(cn);
	
	
	t1=new JTextField();
		t1.setBounds(1350,300,50,50);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		t1.setFont(f);
		add(t1);
		
		t2=new JTextField();
		t2.setBounds(1450,300,50,50);
		t2.setBackground(Color.black);
		t2.setForeground(Color.white);
		t2.setFont(f);
		add(t2);
		
		t3=new JTextField();
		t3.setBounds(1550,300,50,50);
		t3.setBackground(Color.black);
		t3.setForeground(Color.white);
		t3.setFont(f);
		add(t3);
	
	
	
	
	l1=new JLabel("Question:-");
	l1.setBounds(115,200,250,50);
	l1.setForeground(Color.red);
	l1.setBackground(Color.black);
	l1.setFont(fn1);
	add(l1);
	
	
	l2=new JTextArea();
	l2.setBounds(300,200,900,180);
	l2.setForeground(Color.blue);
	l2.setBackground(Color.black);
	l2.setFont(fn1);
	add(l2);
	
	
	qa=new JLabel("Question Attempted:");
	qa.setBounds(300,600,290,300);
	qa.setForeground(Color.cyan);
	qa.setFont(fn1);
	add(qa);
	
	qa1=new JLabel("N");
	qa1.setBounds(550,600,290,300);
	qa1.setForeground(Color.cyan);
	qa1.setFont(fn1);
	add(qa1);
	
	qr=new JLabel("Question Remaining:");
	qr.setBounds(700,600,290,300);
	qr.setForeground(Color.cyan);
	qr.setFont(fn1);
	add(qr);
	
	qr1=new JLabel("N");
	qr1.setBounds(950,600,290,300);
	qr1.setForeground(Color.cyan);
	qr1.setFont(fn1);
	add(qr1);
	
	
	
	
	BG=new ButtonGroup();
	
	o1=new JRadioButton();
	o1.setBounds(120,410,800,50);
	o1.setFont(fn);
	o1.setBackground(c2);
	o1.setForeground(Color.cyan);
	BG.add(o1);	
		add(o1);
		
		
	o2=new JRadioButton();
	o2.setBounds(120,470,800,50);
	o2.setBackground(c2);
	o2.setForeground(Color.cyan);
	o2.setFont(fn);
	BG.add(o2);	
		add(o2);
		
		
	o3=new JRadioButton();
	o3.setBounds(120,530,800,50);
	o3.setForeground(Color.cyan);
	o3.setBackground(c2);
	o3.setFont(fn);
	BG.add(o3);	
		add(o3);
		
	o4=new JRadioButton();
	o4.setBounds(120,590,800,50);
	o4.setFont(fn);
	o4.setForeground(Color.cyan);
	o4.setBackground(c2);
	BG.add(o4);	
		add(o4);
		
		
		
		p=new JButton(p1);
		p.setBounds(70,700,200,70);
	p.setOpaque(false);
	p.setBorderPainted(false);
	p.setContentAreaFilled(false);
		p.setFont(fn1);
		add(p);
		
		
		n=new JButton(n1);
		n.setBounds(1100,700,200,70);
	n.setOpaque(false);
	n.setBorderPainted(false);
	n.setContentAreaFilled(false);
		n.setFont(fn1);
		add(n);
		
		
		s=new JButton(sub);//submit
		s.setBounds(1350,600,200,70);
	s.setOpaque(false);
	s.setBorderPainted(false);
	s.setContentAreaFilled(false);
		s.setFont(fn1);
		add(s);
		
		
	}
	public void paintComponent(Graphics g){
		Font f1=new Font("Algerian",50,50);
		Color c=new Color(255,255,255);
		g.setFont(f1);
		g.setColor(c);
		g.drawImage(bgblue,0,0,this);
		g.drawString("TEST:",650,100);
		g.drawString("TIME",1400,200);
		Color c1=new Color(205,205,205);
		g.setColor(c1);
		g.fillRect(100,150,1220,550);
		Color c2=new Color(51,0,0);
		g.setColor(c2);
		g.fillRect(110,400,1200,250);
		g.drawRect(110,180,1200,500);
		
		
		
		
		}
}

