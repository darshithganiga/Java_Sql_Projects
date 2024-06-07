
 
package atm.machine;
import java.sql.*;


public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            
             c=DriverManager.getConnection("jdbc:mysql:///Bankingdata","root","Dars@2711");//create connection
            s=c.createStatement();
            
                }   
        catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());}
    catch (Exception e){
        System.out.println(e);
    }
    }
}
