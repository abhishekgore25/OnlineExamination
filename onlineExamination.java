import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
class Fdemo extends JFrame implements ActionListener,ItemListener{
		CardLayout card;
		Container con=getContentPane();
		
		static int min=0;
		static int sec=0;
		static int hour=0;
		static int t=0;
		static Timer time;
		
	static int questionR=0;
	static int questionA=0;
	static String cor="";
	static int tq=0;
	static int tm=0;
	static int ca=0;
	static int wa=0;
	static int m=0;
	static int qn=1;
	
		Firstpage fp;
		mainLogin ml;
		adminLogin al;
		adminPanel ap;
		manageCourses mc;
		coursePage cp;
		addNewCourse anc;
		usersDetail ud;
		selectedUserDetail sud;
		Result r;
		userLogin ul;
		registrationForm rf;
		userPanel up;
		editableForm ef;
		CourseResult cr;
		SelectCourse sc;
		ForAdminUserResult faur;
		Paper p;
		selectedUserDetailForAdmin sudfa;
		Rules rul;
		PaperResult pr;
		usersDetailToVerify udtv;
		detailToVerify dtv;
		
		Fdemo(){
			setTitle("Online-Examination");
			card=new CardLayout();
			setLayout(card);
			
			
			fp=new Firstpage();
			add("firstpage",fp);
			// fp.b3.addActionListener(this);//next
			fp.b2.addActionListener(this);//start
			
			ml=new mainLogin();
			add("mainLog",ml);
			ml.b1.addActionListener(this);//adminlogin
			ml.b2.addActionListener(this);//student login
			// ml.b3.addActionListener(this);//
			ml.b4.addActionListener(this);//back
			
			al=new adminLogin();
			add("adminlog",al);
			al.b1.addActionListener(this);//login
			// al.b3.addActionListener(this);
			al.b4.addActionListener(this);//back
			
			ap=new adminPanel();
			add("adminPanel",ap);
			ap.b01.addActionListener(this);
			ap.b02.addActionListener(this);
			ap.b03.addActionListener(this);
			ap.b04.addActionListener(this);
			ap.b05.addActionListener(this);//verification;
			ap.b06.addActionListener(this);//changePassword
		
			// ap.b3.addActionListener(this);
			
			
			mc=new manageCourses();
			add("manageCourse",mc);
			mc.b4.addActionListener(this);
			// mc.b3.addActionListener(this);
			mc.b03.addActionListener(this);
			mc.b1.addActionListener(this);
			mc.b2.addActionListener(this);
			
			cp=new coursePage();
			add("coursepage",cp);
			// cp.b3.addActionListener(this);
			cp.b1.addActionListener(this);
			cp.b4.addActionListener(this);
			
			anc=new addNewCourse();
			add("addnewcourse",anc);
			// anc.b3.addActionListener(this);
			anc.b4.addActionListener(this);
			anc.b01.addActionListener(this);
			
			ud=new usersDetail();
			add("userdetail",ud);
			ud.b1.addActionListener(this);//search
			// ud.b3.addActionListener(this);
			ud.b4.addActionListener(this);
			
			sud=new selectedUserDetail();
			add("selecteduserDetail",sud);
			sud.b1.addActionListener(this);
			// sud.b3.addActionListener(this);
			sud.b4.addActionListener(this);
			
			r=new Result();
			add("result",r);
			// r.b3.addActionListener(this);
			r.b4.addActionListener(this);
			
			ul=new userLogin();
			add("userlogin",ul);
			// ul.b3.addActionListener(this);
			ul.b5.addActionListener(this);//register
			ul.b4.addActionListener(this);//back
			ul.b1.addActionListener(this);//login
			
			rf=new registrationForm();
			add("registerform",rf);
			// rf.b3.addActionListener(this);
			rf.b4.addActionListener(this);//back
			rf.b1.addActionListener(this);//submit
			rf.b2.addActionListener(this);//reset
			
			up=new userPanel();
			up.b03.addActionListener(this);
			up.b01.addActionListener(this);
			up.b02.addActionListener(this);
			up.start.addActionListener(this);
			add("userpanel",up);
			
			ef=new editableForm();
			ef.b2.addActionListener(this);
			ef.b1.addActionListener(this);
			ef.b4.addActionListener(this);
			add("editableform",ef);
			
			cr=new CourseResult();
			add("courseresult",cr);
			cr.b4.addActionListener(this);
			
			
			sc=new SelectCourse();
			add("selectcourse",sc);
			sc.b4.addActionListener(this);
			sc.b1.addActionListener(this);
			
			faur=new ForAdminUserResult();
			add("foradminuserdetail",faur);
			faur.b4.addActionListener(this);
			
			
			p=new Paper();
			p.s.addActionListener(this);//submit
			p.p.addActionListener(this);//previous
			p.n.addActionListener(this);//next
			p.o1.addItemListener(this);
			p.o2.addItemListener(this);
			p.o3.addItemListener(this);
			p.o4.addItemListener(this);
			add("paper",p);
			
			sudfa=new selectedUserDetailForAdmin();
			sudfa.b4.addActionListener(this);
			sudfa.b1.addActionListener(this);
			add("selecteduserdetailforadmin",sudfa);
			
			rul=new Rules();
			rul.b4.addActionListener(this);
			rul.start.addActionListener(this);
			add("rules",rul);
			
			pr=new PaperResult();
			pr.b4.addActionListener(this);
			add("paperresult",pr);
			
			
			udtv=new usersDetailToVerify();
			udtv.b4.addActionListener(this);
			udtv.b1.addActionListener(this);
			add("userdetailtoverify",udtv);
			
			
			dtv=new detailToVerify();
			dtv.b4.addActionListener(this);
			dtv.ver.addActionListener(this);
			dtv.dis.addActionListener(this);
			add("detailtoverify",dtv);
			
		}
		
		
		
		public void itemStateChanged(ItemEvent ie){
			
			if(p.o1.isSelected()){
				cor=p.o1.getLabel();
			}
			else if(p.o2.isSelected()){
				cor=p.o2.getLabel();
			}
			else if(p.o3.isSelected()){
				cor=p.o3.getLabel();
			}
			else if(p.o4.isSelected()){
				cor=p.o4.getLabel();
			}
			
			
		}
		
		
		
		
		public void actionPerformed(ActionEvent e){
			// if(e.getSource()==)
			if(e.getSource()==fp.b3){
				card.show(con,"paperresult");
				}
				
				
			if(e.getSource()==fp.b2){
				card.next(con);
			}
			if(e.getSource()==ml.b4 || e.getSource()==rf.b4){
				card.previous(con);
			}
			if( e.getSource()==al.b4 || e.getSource()==ul.b4){
				card.show(con,"mainLog");
			}
			if(e.getSource()==ml.b1){
				card.show(con,"adminlog");
			}
			if(e.getSource()==ml.b2){
				card.show(con,"userlogin");
			}
			
			
			
			if(e.getSource()==ul.b1){		//userLogin->userpanel
				String v="";
					String s1=ul.t1.getText();
					String s2=ul.t2.getText();
				try{
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con1.createStatement();
					ResultSet rs=st.executeQuery("select * from  register where username='"+s1+"' && password='"+s2+"'");
					if(rs.next()){
						v=rs.getString(12);
					String r=rs.getString(1);
					String n=rs.getString(3);
					String em=rs.getString(6);
						if(v.equals("1")){
							card.show(con,"userpanel");
							 ResultSet rs2=st.executeQuery("select name from courses");
					userPanel.cb.removeAllItems();
					 up.l11.setText(n);
					up.l22.setText(r);
					up.l33.setText(em);
					while(rs2.next()){
						userPanel.cb.addItem(rs2.getString(1));
					}
					userPanel.show4();
							
						}else{
					JOptionPane.showMessageDialog(null,"The User Access Is Not Verified Yet..please try again later","Verify First",JOptionPane.INFORMATION_MESSAGE);
						}
					}
					else{
						
					JOptionPane.showMessageDialog(null,"Invalid Username & Password..try again","INVALID",JOptionPane.ERROR_MESSAGE);
					}
					
				
				}catch(Exception e5){
					System.out.println(e5);
				}
			
						
				// try{
					// Class.forName("com.mysql.cj.jdbc.Driver");
					// Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					// Statement st=con1.createStatement();
					// ResultSet rs=st.executeQuery("select * from  register where username='"+s1+"' && password='"+s2+"'");
					
					
				// if(rs.next()){
					// String r=rs.getString(1);
					// String n=rs.getString(3);
					// String em=rs.getString(6);
					// if(r1.next()){
						
					// up.l11.setText(n);
					// up.l22.setText(r);
					// up.l33.setText(em);
					// card.show(con,"userpanel");
					// ResultSet rs2=st.executeQuery("select name from courses");
					// userPanel.cb.removeAllItems();
					// while(rs2.next()){
						// userPanel.cb.addItem(rs2.getString(1));
					// }
					// userPanel.show4();
					// }
					
				// }else{
				// }
				// }catch(Exception e1){
					// System.out.println(e1);
				// }
			
			}
			
			
			if(e.getSource()==up.b03){
				int x=JOptionPane.showConfirmDialog(null,"Are you shure,you want to log-out?","Confirmation:",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
				if(x==0){//if we pressed yes
					card.show(con,"userlogin");
					ul.t1.setText("Enter UserName");
					ul.t1.setForeground(Color.gray);
					ul.t2.setText("Enter Password");
					ul.t2.setForeground(Color.gray);
					ul.t2.setEchoChar((char)0);
				}
			}
			
			
			
			if(e.getSource()==up.b02){
				
				card.show(con,"result");
				String s=up.l11.getText();
				String s2=up.l22.getText();
				r.l2.setText(""+s);
				r.l4.setText(""+s2);
				
				try{
				
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con1.createStatement();
					ResultSet rs=st.executeQuery("select * from result where studentname='"+s+"'");
					int i=0;
					while(rs.next()){
						Result.data[i][0]=rs.getString(2);
						Result.data[i][1]=rs.getString(3);
						Result.data[i][2]=rs.getString(4);
						Result.data[i][3]=rs.getString(5);
						Result.data[i][4]=rs.getString(6);
						Result.data[i][5]=rs.getString(7);
						Result.data[i][6]=rs.getString(8);
						Result.data[i][7]=rs.getString(9);
						i++;
					}
					Result.show4();
				
				}catch(Exception e1){
					System.out.println(e1);
				}
			}
			
			
			if(e.getSource()==up.start){ // userpanel->start button h
				String c=(String)userPanel.cb.getSelectedItem();
				
				rul.l1.setText(c);
				card.show(con,"rules");
				
				
				
			}
			
			
			if(e.getSource()==rul.start){
				
				
				//timer
				String s1=rul.l1.getText();
				
				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con1.createStatement();
					ResultSet rs=st.executeQuery("select hour,minute,seconds from  courses where name='"+s1+"'");
				if(rs.next()){
					hour=Integer.parseInt(rs.getString(1));
					min=Integer.parseInt(rs.getString(2));
					sec=Integer.parseInt(rs.getString(3));
					

						}
						t=hour*60+min+sec/6;
						hour=0;
						min=0;
						sec=0;
				}catch(Exception e1){
					System.out.println(e1);
				}
				
				
				
				time=new Timer(1000,new ActionListener(){
					public void actionPerformed(ActionEvent e){
						p.t3.setText(String.valueOf(sec));
						p.t2.setText(String.valueOf(min));
						p.t1.setText("00");
						if(sec==60){
							sec=0;
							min++;
							if(min==t){
								time.stop();
								min=0;
								sec=0;
								card.show(con,"paperresult");
							}
						}
						sec++;
					}
				});
				time.start();
					
				
				
				
				
					
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con1.createStatement();
					ResultSet rs=st.executeQuery("select * from  "+s1);
				while(rs.next()){
					questionR++;
				}
					ResultSet rs2=st.executeQuery("select  marks,totalquestion from courses where name='"+s1+"'");
				if(rs2.next()){
					tq=Integer.parseInt(rs2.getString(2));//totalquestion
					
					tm=tq*Integer.parseInt(rs2.getString(1));//total marks
					m=Integer.parseInt(rs2.getString(1));//total marks
				}
				questionA=0;
				p.qr1.setText(""+questionR);
				p.qa1.setText(""+questionA);
				
				}catch(Exception e1){
					System.out.println(e1);
				}
// System.out.println(tm);
// System.out.println(tq);
				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					ResultSet rs=st.executeQuery("select * from  "+s1);
					if(rs.absolute(qn)){
						p.l2.setText(rs.getString(2));
						p.o1.setText(rs.getString(3));
						if(p.o1.isSelected()){
								p.qr1.setText(""+ --questionR);
				p.qa1.setText(""+ ++questionA);
				
						}
						
						
						p.o2.setText(rs.getString(4));
						if(p.o2.isSelected()){
								p.qr1.setText(""+ --questionR);
				p.qa1.setText(""+ ++questionA);
				
						}
						
						p.o3.setText(rs.getString(5));
						if(p.o3.isSelected()){
								p.qr1.setText(""+ --questionR);
				p.qa1.setText(""+ ++questionA);
				
						}
						
						p.o4.setText(rs.getString(6));
						if(p.o4.isSelected()){
								p.qr1.setText(""+ --questionR);
				p.qa1.setText(""+ ++questionA);
				
						}
						
					}
					
					;
				}catch(Exception e1){
					System.out.println(e1);
				}
				
			
				
				String c=(String)userPanel.cb.getSelectedItem();
				p.cn.setText(c);
				card.show(con,"paper");
				
				
			}
			
			
			
			
			if(e.getSource()==rul.b4){//result
				card.show(con,"userpanel");
			}
			
			
			if(e.getSource()==r.b4){//result
				card.show(con,"userpanel");
			}
			
			if(e.getSource()==up.b01){
				card.show(con,"editableform");
				String s=up.l22.getText();
				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from register where registerno='"+s+"'");
				if(rs.next()){
					ef.t1.setText(rs.getString(1));
					ef.t2.setText(rs.getString(2));
					ef.t3.setText(rs.getString(3));
					ef.t4.setText(rs.getString(4));
					ef.t11.setText(rs.getString(5));
					ef.t5.setText(rs.getString(6));
					ef.t12.setText(rs.getString(7));
					ef.t6.setText(rs.getString(8));
					ef.t7.setText(rs.getString(9));
					ef.l12.setText(rs.getString(10));
				}
				}catch(Exception e2){
					System.out.println(e2);
				}
			}
			
			if(e.getSource()==ef.b2){
				
					ef.t2.setText("");
					ef.t3.setText("");
					ef.t4.setText("");
					ef.t11.setText("");
					ef.t5.setText("");
					ef.t12.setText("");
					ef.t6.setText("");
					ef.t7.setText("");
					
			}
			
			if(e.getSource()==ef.b4){
				card.show(con,"userpanel");
			}
			
			if(e.getSource()==ef.b1){
				
				String s=ef.t1.getText();
				
					String s2=	ef.t2.getText();
					String s3=ef.t3.getText();
					String s4=ef.t4.getText();
					String s5=ef.t11.getText();
					String s6=ef.t5.getText();
					String s7=ef.t12.getText();
					String s8=ef.t6.getText();
					String s9=ef.t7.getText();
					if(s2.equals("") ||s3.equals("") ||s4.equals("") ||s5.equals("") ||s6.equals("") ||s7.equals("") ||s8.equals("") ||s9.equals("") )
					{
						JOptionPane.showMessageDialog(null,"field is empty","EDIT FORM",JOptionPane.ERROR_MESSAGE);
					}
					else{
				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con2.createStatement();
					st.executeUpdate("update register set username='"+s2+"',name='"+s3+"',mobileno='"+s4+"',gender='"+s5+"',email='"+s6+"',dob='"+s7+"',collegename='"+s8+"',address='"+s9+"' where registerno='"+s+"'");
					
					JOptionPane.showMessageDialog(null,"Profile Updated..","PROFILE",JOptionPane.INFORMATION_MESSAGE);
					card.show(con,"userpanel");
				}catch(Exception e3){
					System.out.println(e3);
				}
					}
			}
			
			
			if(e.getSource()==ul.b5){
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con2.createStatement();
					ResultSet rs=st.executeQuery("select * from register");
					String s="";
					while(rs.next()){
						s=rs.getString(1);
					}
					int i=Integer.parseInt(s);
					i++;
					rf.t1.setText(""+i);
				}catch(Exception e3){
					System.out.println(e3);
				}
				card.show(con,"registerform");
			}
			if(e.getSource()==rf.b2){
			
				rf.t2.setText("");
				rf.t3.setText("");
				rf.t4.setText("");
				rf.t5.setText("");
				rf.t6.setText("");
				rf.t7.setText("");
				rf.t9.setText("");
			}
			
			
			if(e.getSource()==rf.b1){
				String registerno=rf.t1.getText();
				String username=rf.t2.getText();
				String name=rf.t3.getText();
				String mobileno=rf.t4.getText();
				String email=rf.t5.getText();
				String collegename=rf.t6.getText();
				String address=rf.t7.getText();
				String password=rf.t9.getText();
				String gender="";
				String dob=(String)rf.cb1.getSelectedItem()+"-"+rf.cb2.getSelectedItem()+"-"+rf.cb3.getSelectedItem();
			
				String registerdate=(String)rf.cb4.getSelectedItem()+"-"+rf.cb5.getSelectedItem()+"-"+rf.cb6.getSelectedItem();

				if(rf.r1.isSelected()){
					gender="Male";
				}else if(rf.r2.isSelected()){
					gender="Female";
				}else if(rf.r3.isSelected()){
					gender="Other";
				}

			if(username.equals("") || name.equals("") || mobileno.equals("") || email.equals("") || collegename.equals("") || address.equals("") || password.equals("") || gender.equals("") || registerdate.equals("") ||dob.equals("") ){
				JOptionPane.showMessageDialog(null,"fill complete form..","fill complete",JOptionPane.WARNING_MESSAGE);
			}else{
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
				Statement st=con1.createStatement();
				ResultSet rs=st.executeQuery("select * from register where email='"+email+"'");	
if(rs.next()){
	JOptionPane.showMessageDialog(null,"this E-mail is already exist..","INVALID",JOptionPane.ERROR_MESSAGE);
}else{
	st.executeUpdate("insert into register values('"+registerno+"','"+username+"','"+name+"','"+mobileno+"','"+gender+"','"+email+"','"+dob+"','"+collegename+"','"+address+"','"+registerdate+"','"+password+"','0')");
	card.show(con,"userlogin");
}				
con1.close();
				rf.t2.setText("");
				rf.t3.setText("");
				rf.t4.setText("");
				rf.t5.setText("");
				rf.t6.setText("");
				rf.t7.setText("");
			
				rf.t9.setText("");
					
				}catch(Exception e1){
					System.out.println(e1);
				}
			}
			
			}
			
			
			if(e.getSource()==p.s){//paper->submit
				sec=0;
				min=0;
				hour=0;
				
				time.stop();
			String s=p.cn.getText();
				
				// static int questionR=0;
	// static int questionA=0;
	// static String cor="";
	// static int tq=0;
	// static int tm=0;
	// static int ca=0;
	// static int wa=0;
	// static int m=0;
	// static int qn=1;
	int mo=ca*m;
	float p=(mo*100)/tm;
				
				String na=up.l11.getText();
				pr.l11.setText(s);
				pr.l33.setText(""+tq);//totalQuestion
				pr.l44.setText(""+tq);//attemptedQuestion
				pr.l55.setText(""+ca);//correctAnswer
				pr.l66.setText(""+wa);//wrongAnswer
				pr.l77.setText(""+mo);//marksobtained
				pr.l88.setText(""+tm);//total marks
				pr.l99.setText(""+p);//percentage
				
				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con1.createStatement();
					st.executeUpdate("insert into result values('"+na+"','"+s+"','"+tq+"','"+tq+"','"+ca+"','"+wa+"','"+mo+"','"+tm+"','"+p+"')");
					
				}catch(Exception e1){
					System.out.println(e1);
				}
				
				
				card.show(con,"paperresult");
				
			}
			
			
			if(e.getSource()==pr.b4){//paper
				JOptionPane.showMessageDialog(null,"Your Result Is Saved...","Saved Successful",JOptionPane.INFORMATION_MESSAGE);
				card.show(con,"userpanel");
			}
			
			
			
			
			if(e.getSource()==p.n){
				++qn;
					String s1=rul.l1.getText();
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					ResultSet rs=st.executeQuery("select * from  "+s1);
					

					if(rs.absolute(qn)){
						p.l2.setText(rs.getString(2));
						
						p.o1.setText(rs.getString(3));
						if(p.o1.isSelected()){
								p.qr1.setText(""+ --questionR);
				p.qa1.setText(""+ ++questionA);
				
						}
						
						
						p.o2.setText(rs.getString(4));
						if(p.o2.isSelected()){
								p.qr1.setText(""+ --questionR);
				p.qa1.setText(""+ ++questionA);
				
						}
						
						p.o3.setText(rs.getString(5));
						if(p.o3.isSelected()){
								p.qr1.setText(""+ --questionR);
				p.qa1.setText(""+ ++questionA);
				
						}
						
						p.o4.setText(rs.getString(6));
						if(p.o4.isSelected()){
								p.qr1.setText(""+ --questionR);
				p.qa1.setText(""+ ++questionA);
				
						}
					}
					else{
						
						p.l2.setText("");
						p.o1.setText("");
						
						p.o2.setText("");
						p.o3.setText("");
						p.o4.setText("");
						JOptionPane.showMessageDialog(null,"NO Next Question To Show..","ERROR",JOptionPane.ERROR_MESSAGE);
					qn--;
					}
					
				}catch(Exception e1){
					System.out.println(e1);
				}
				
				
				
				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					ResultSet rs=st.executeQuery("select correct from  "+s1+" where correct='"+cor+"'");
					if(rs.next()){
						ca++;
					}else{
						wa++;
					}
				
					}catch(Exception e4){
						System.out.println(e4);
					}
					
					
			}		
			
			if(e.getSource()==p.p){
				--qn;
					String s1=rul.l1.getText();
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					ResultSet rs=st.executeQuery("select * from  "+s1);
					if(rs.absolute(qn)){
						p.l2.setText(rs.getString(2));
						
						
						p.o1.setText(rs.getString(3));
						if(p.o1.isSelected()){
								
						}
						
						
						p.o2.setText(rs.getString(4));
						if(p.o2.isSelected()){
								
						}
						
						p.o3.setText(rs.getString(5));
						if(p.o3.isSelected()){
								
						}
						
						p.o4.setText(rs.getString(6));
						if(p.o4.isSelected()){
							
					}
					
					
					}else{
						p.l2.setText("");
						p.o1.setText("");
						p.o2.setText("");
						p.o3.setText("");
						p.o4.setText("");
						JOptionPane.showMessageDialog(null,"NO previous Question To Show","ERROR",JOptionPane.ERROR_MESSAGE);
					}
					
					
				
				}catch(Exception e1){
					System.out.println(e1);
				}
				
			
			}
			
			
			
			
//--------------------------------------------------  admin---------------------------------------------------------------------------------------------------------------------
			
			
			
			if(e.getSource()==al.b1){
				String s1=al.t1.getText();
				String s2=al.t2.getText();
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
				Statement st=con2.createStatement();
				ResultSet rs=st.executeQuery("select * from admin where name='"+s1+"' &&  password='"+s2+"'");
				if(rs.next()){
					card.show(con,"adminPanel");
				}else{
					JOptionPane.showMessageDialog(null,"Invalid Username & Password..","INVALID",JOptionPane.ERROR_MESSAGE);
				}
				}catch(Exception e1){
					System.out.println(e1);
				}
			}
			
			if(e.getSource()==ap.b03){
				int x=JOptionPane.showConfirmDialog(null,"Are you shure,you want to Log-Out?","LOGOUT",JOptionPane.YES_NO_CANCEL_OPTION);
				if(x==0){
					card.show(con,"adminlog");
					al.t1.setText("Enter Name");
					al.t1.setForeground(Color.gray);
					al.t2.setForeground(Color.gray);
					al.t2.setText("Enter Password");
					al.t2.setEchoChar((char)0);
				}
			}
			
			if(e.getSource()==ap.b01){
			card.show(con,"manageCourse");
				
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
				Statement st=con2.createStatement();
				ResultSet rs=st.executeQuery("select * from courses");
				mc.cj.removeAllItems();
				while(rs.next()){
					
					mc.cj.addItem(rs.getString(1));
				}
					mc.show1();
			}catch(Exception e1){
				System.out.println(e1);
			}
		 
		

			
			}
			if(e.getSource()==mc.b4){
				card.show(con,"adminPanel");
			}
			if(e.getSource()==mc.b1){		//managecourse->deletecourse
				String s=(String)mc.cj.getSelectedItem();
				
				
				int x=JOptionPane.showConfirmDialog(null,"Are You Really Wanted To Delete Selected Course?");
				
				if(x==0){
				try{
				Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
						Statement st=con1.createStatement();
						st.executeUpdate("delete from courses where name='"+s+"'");
						st.executeUpdate("drop table "+s);
						con1.close();
						JOptionPane.showMessageDialog(null,"Successfully Deleted course"+s,"Deletion",JOptionPane.INFORMATION_MESSAGE);
					card.show(con,"adminPanel");
				
			}catch(Exception e2){
				System.out.println(e2);
			}
				
			}else{}
			}
			
			if(e.getSource()==mc.b03){
				
				
				card.show(con,"addnewcourse");
				
				
			}
			if(e.getSource()==anc.b4){
				card.show(con,"adminPanel");
			}
			
			if(e.getSource()==ap.b05){
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con2.createStatement();
					ResultSet rs=st.executeQuery("select username from register where verify='0'");
							udtv.jl.removeAllItems();			
					while(rs.next()){
						udtv.jl.addItem(rs.getString(1));
						
					}
					udtv.show2();
					
					con2.close();
					
				}catch(Exception e2){
					System.out.println(e2);
				}
				
				
				
				card.show(con,"userdetailtoverify");
				
				
			}
			
			if(e.getSource()==ap.b06){
				
				String p1=JOptionPane.showInputDialog(null," Enter new Password..");
				if(!p1.equals("")){
				String p2=JOptionPane.showInputDialog(null,"Confirm Password..");
				if(p1.equals(p2)){
					try{
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
						Statement st=con1.createStatement();
						st.executeUpdate("update admin set password='"+p1+"' where name='abhi'");
						con1.close();
						JOptionPane.showMessageDialog(null,"PasswordChanged..","Information",JOptionPane.INFORMATION_MESSAGE);
					}catch(Exception e1){
						System.out.println(e1);
					}
				}
				}else{
					
				}
				
			}
			
			if(e.getSource()==anc.b01){//add new course ->addnewcourse
				String s1=anc.t1.getText();
				String s2=anc.t2.getText();
				String s3=anc.t3.getText();
				String s4=anc.t4.getText();
				
				
			if(s1.equals("Course Name") || s2.equals("Hour")|| s3.equals("Minutes") || s4.equals("seconds")){
				JOptionPane.showMessageDialog(null,"Enter CourseName to addCourse..","ADDCOURSE",JOptionPane.ERROR_MESSAGE);
			}else{
				String c1=anc.t1.getText();
				String c2=anc.t2.getText();
				String c3=anc.t3.getText();
				String c4=anc.t4.getText();
				String c5=(String)anc.cb.getSelectedItem();
				
				int x=JOptionPane.showConfirmDialog(null,"Are you shure you want to add course?","SHURE",JOptionPane.YES_NO_CANCEL_OPTION);
				if(x==0){
				try{
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
						Statement st=con1.createStatement();
						st.executeUpdate("insert into courses values('"+c1+"','"+c2+"','"+c3+"','"+c4+"','"+c5+"','0')");
					
						String q="create table "+c1+"(questionid varchar(100),question varchar(1000),o1 varchar(500),o2 varchar(500),o3 varchar(500),o4 varchar(500),correct varchar(500))";
			st.executeUpdate(q);
						
						con1.close();
						
						
					}catch(Exception e1){
						System.out.println(e1);
					}
		
				
				
				int y=JOptionPane.showConfirmDialog(null,"you want to edit course?","EditCourse",JOptionPane.YES_NO_CANCEL_OPTION);
				if(y==0){
					card.show(con,"coursepage");
				}
				}
			}
			}
			if(e.getSource()==cp.b4){  //
				card.show(con,"adminPanel");
			}
			
			if(e.getSource()==cp.b1){
							String s1=cp.coursen.getText();//1
							String s2=cp.t1.getText();
							String s3=cp.t2.getText();
							String s4=cp.t3.getText();
							String s5=cp.t4.getText();
							String s6=cp.tq1.getText();
							try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con2.createStatement();
					st.executeUpdate("update courses set hour='"+s2+"',minute='"+s3+"',seconds='"+s4+"',marks='"+s5+"',totalquestion='"+s6+"' where name='"+s1+"'");
						JOptionPane.showMessageDialog(null,"Changes is Saved Successfully..","Saved",JOptionPane.INFORMATION_MESSAGE);
						
					
					con2.close();
					
				}catch(Exception e2){
					System.out.println(e2);
				}
						
						String  s11=(String)mc.cj.getSelectedItem();
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
						Statement st=con1.createStatement();
						ResultSet rs=st.executeQuery("select * from courses where name='"+s11+"'");
						if(rs.next()){
							cp.coursen.setText(rs.getString(1));
							cp.t1.setText(rs.getString(2));
							cp.t2.setText(rs.getString(3));
							cp.t3.setText(rs.getString(4));
							cp.t4.setText(rs.getString(5));
							cp.tq1.setText(rs.getString(6));
						}	
						
								ResultSet rsv=st.executeQuery("select questionid from "+s11+"");
						View.id.removeAllItems();
						Update.id.removeAllItems();
						Remove.id.removeAllItems();
						while(rsv.next()){
							View.id.addItem(rsv.getString(1));
							Update.id.addItem(rsv.getString(1));
							Remove.id.addItem(rsv.getString(1));
						}
					View.show3();
					Update.show3();
					Remove.show3();
						con1.close();
					
				
			}catch(Exception e2){
				System.out.println(e2);
			}

					
			
			}
			
			
			if(e.getSource()==mc.b2){				// managecourses-> update course
			String  s1=(String)mc.cj.getSelectedItem();
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
						Statement st=con1.createStatement();
						ResultSet rs=st.executeQuery("select * from courses where name='"+s1+"'");
						if(rs.next()){
							cp.coursen.setText(rs.getString(1));
							cp.t1.setText(rs.getString(2));
							cp.t2.setText(rs.getString(3));
							cp.t3.setText(rs.getString(4));
							cp.t4.setText(rs.getString(5));
							cp.tq1.setText(rs.getString(6));
						}	
						
								ResultSet rsv=st.executeQuery("select questionid from "+s1+"");
						View.id.removeAllItems();
						Update.id.removeAllItems();
						Remove.id.removeAllItems();
						while(rsv.next()){
							View.id.addItem(rsv.getString(1));
							Update.id.addItem(rsv.getString(1));
							Remove.id.addItem(rsv.getString(1));
						}
					View.show3();
					Update.show3();
					Remove.show3();
						con1.close();
					
				
			}catch(Exception e2){
				System.out.println(e2);
			}
			card.show(con,"coursepage");
			
			
			}
			
			if(e.getSource()==ap.b04){				// userdetail-> availabel users
				card.show(con,"userdetail");
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con2.createStatement();
					ResultSet rs=st.executeQuery("select username from register");
							ud.jl.removeAllItems();			
					while(rs.next()){
						ud.jl.addItem(rs.getString(1));
						
					}
					ud.show2();
					
					con2.close();
					
				}catch(Exception e2){
					System.out.println(e2);
				}
				
			}
			if(e.getSource()==sudfa.b4){
				card.show(con,"userdetail");
			}
			
			if(e.getSource()==ud.b1){				//search->selecteduserDetail
				card.show(con,"selecteduserdetailforadmin"); 
				String search=(String)ud.jl.getSelectedItem();
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con2.createStatement();
					ResultSet rs=st.executeQuery("select * from register where username='"+search+"'");
					
					while(rs.next()){
						sudfa.t1.setText(rs.getString(1));
						sudfa.t2.setText(rs.getString(2));
						sudfa.t3.setText(rs.getString(3));
						sudfa.t4.setText(rs.getString(4));
						sudfa.t5.setText(rs.getString(5));
						sudfa.t6.setText(rs.getString(6));
						sudfa.t7.setText(rs.getString(7));
						sudfa.t8.setText(rs.getString(8));
						sudfa.t9.setText(rs.getString(9));
						sudfa.t10.setText(rs.getString(10));
						sudfa.t11.setText(rs.getString(11));
					}
				}catch(Exception e2){
					System.out.println(e2);
				}
			}
			if(e.getSource()==ud.b4){
				card.show(con,"adminPanel");
			}
			if(e.getSource()==sud.b4){
				card.show(con,"userdetail");
			}
			if(e.getSource()==ap.b02){
				
				try{
				Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
				Statement st=con2.createStatement();
				ResultSet rs=st.executeQuery("select * from courses");
				sc.cb.removeAllItems();
				while(rs.next()){
					
					sc.cb.addItem(rs.getString(1));
				}
					sc.show4();
			}catch(Exception e1){
				System.out.println(e1);
			}
				card.show(con,"selectcourse");
			}
			
			if(e.getSource()==sc.b1){
				String s=(String)sc.show4().getSelectedItem();
				cr.l2.setText(s);
				try{
				
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con1.createStatement();
					ResultSet rs22=st.executeQuery("select * from result where coursename='"+s+"'");
					int i=0;
					
					while(rs22.next()){
						CourseResult.data[i][0]=rs22.getString(1);
						CourseResult.data[i][1]=rs22.getString(3);
						CourseResult.data[i][2]=rs22.getString(4);
						CourseResult.data[i][3]=rs22.getString(5);
						CourseResult.data[i][4]=rs22.getString(6);
						CourseResult.data[i][5]=rs22.getString(7);
						CourseResult.data[i][6]=rs22.getString(8);
						CourseResult.data[i][7]=rs22.getString(9);
						i++;
					}
					CourseResult.show4();
				
				}catch(Exception e1){
					System.out.println(e1);
				}
				
				card.show(con,"courseresult");
			}
			
			
			if(e.getSource()==sc.b4){
				card.show(con,"adminPanel");
			}
			if(e.getSource()==cr.b4){
				
				card.show(con,"selectcourse");
			}
			if(e.getSource()==sudfa.b1){
				String s1=sudfa.t3.getText();
				String s2=sudfa.t1.getText();
				faur.l2.setText(s1);
				faur.l4.setText(s2);
				card.show(con,"foradminuserdetail");
				
				try{
				
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con1.createStatement();
					ResultSet rs22=st.executeQuery("select * from result where studentname='"+s1+"'");
					int i=0;
					System.out.println(s1);
					while(rs22.next()){
						ForAdminUserResult.data[i][0]=rs22.getString(2);
						ForAdminUserResult.data[i][1]=rs22.getString(3);
						ForAdminUserResult.data[i][2]=rs22.getString(4);
						ForAdminUserResult.data[i][3]=rs22.getString(5);
						ForAdminUserResult.data[i][4]=rs22.getString(6);
						ForAdminUserResult.data[i][5]=rs22.getString(7);
						ForAdminUserResult.data[i][6]=rs22.getString(8);
						ForAdminUserResult.data[i][7]=rs22.getString(9);
						i++;
						System.out.println(rs22.getString(2));
						System.out.println(rs22.getString(3));
						System.out.println(rs22.getString(4));
					}
					ForAdminUserResult.show4();
				
				}catch(Exception e1){
					System.out.println(e1);
				}
			}
				
				
				
				
			
			if(e.getSource()==faur.b4){
				card.show(con,"selecteduserdetailforadmin");
			}
				
			
			if(e.getSource()==udtv.b4){
				card.show(con,"adminPanel");
			}
			
			if(e.getSource()==udtv.b1){
				String search=(String)udtv.jl.getSelectedItem();
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con2.createStatement();
					ResultSet rs=st.executeQuery("select * from register where username='"+search+"'");
					
					while(rs.next()){
						dtv.t1.setText(rs.getString(1));
						dtv.t2.setText(rs.getString(2));
						dtv.t3.setText(rs.getString(3));
						dtv.t4.setText(rs.getString(4));
						dtv.t5.setText(rs.getString(5));
						dtv.t6.setText(rs.getString(6));
						dtv.t7.setText(rs.getString(7));
						dtv.t8.setText(rs.getString(8));
						dtv.t9.setText(rs.getString(9));
						dtv.t10.setText(rs.getString(10));
						dtv.t11.setText(rs.getString(11));
					}
				}catch(Exception e2){
					System.out.println(e2);
				}
				card.show(con,"detailtoverify");
				
				
			}
			
			if(e.getSource()==dtv.b4){
				card.show(con,"userdetailtoverify");
			}
			
			
			if(e.getSource()==dtv.ver){
				String search=(String)udtv.jl.getSelectedItem();
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con2.createStatement();
					st.executeUpdate("update register set verify='1' where username='"+search+"'");
					con2.close();
					
				}catch(Exception e2){
					System.out.println(e2);
				}
				
				JOptionPane.showMessageDialog(null,"The User Verification Is Done.","Verification",JOptionPane.INFORMATION_MESSAGE);
				card.show(con,"adminPanel");
			}
			
			
			if(e.getSource()==dtv.dis){
				String search=(String)udtv.jl.getSelectedItem();
				int x=JOptionPane.showConfirmDialog(null,"ARE YOU REALLY WANT TO DISCARD STUDENT.");
			if(x==0){
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?useSSL=false","root","root");
					Statement st=con2.createStatement();
					st.executeUpdate("delete from register where username='"+search+"'");
					con2.close();
					
				}catch(Exception e2){
					System.out.println(e2);
				}
				
				JOptionPane.showMessageDialog(null,"The User Has been removed Successfully","Verification",JOptionPane.INFORMATION_MESSAGE);
				card.show(con,"adminPanel");
			}else if(x==1){
				
			}else{
				
			}
			}
			
		}
}
class onlineExamination{
	public static void main(String[]abd){
		int x,y,w=200,h=200;
		Fdemo f=new Fdemo();
		f.setVisible(true);
		f.setSize(1700,900);
		f.setLocation(100,100);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setResizable(false);
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d=t.getScreenSize();
		x=(d.width-w)/2;
		y=(d.height-h)/2;
		Image i=t.getImage("icon.png");
		f.setIconImage(i);
		
		
	}
	 
	
}