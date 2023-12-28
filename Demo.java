import java.sql.*;
class Demo{
    public static void main(String[] args) {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/abhi?useSSL=false","root","root");
            Statement st=con.createStatement();
            st.executeQuery("insert into data values('abhisehk','aaa')");
            con.close();
       }catch(Exception e){
            System.out.println(e);
       }
    }
}