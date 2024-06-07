
package atm.machine;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener {
    JButton login,clear,signup;
    JTextField cardtext;
    JPasswordField pinno;
    Login(){
        setSize(800,480);
        setLayout(null);
        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));//get the logo
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);//Scaling the logo
        ImageIcon i3=new ImageIcon(i2);//to convert  Image  back to ImageIcon as we cannot pass it to label
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);//add label to frame
        getContentPane().setBackground(Color.WHITE);//change the colour of frane
        
        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
         JLabel cardno=new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
         cardtext=new JTextField();
        cardtext.setBounds(300,150,230,30);
        cardtext.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(cardtext);
        
         JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway   ",Font.BOLD,28));
        pin.setBounds(120,220,400,40);
        add(pin);
        pinno=new JPasswordField();
        pinno.setBounds(300,220,230,30);
        pinno.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(pinno);
        
         login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
          signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        setVisible(true);
        setLocation(350,200);//centers the frame
    }
    public void actionPerformed(ActionEvent ae){ //overriding the abstract actionperformed method
       try{ if (ae.getSource()==clear){
            cardtext.setText("");
            pinno.setText("");
        }
        else if(ae.getSource()==login){
          Conn conn=new Conn();
          String cardnumber=cardtext.getText();
          String pinnumber=pinno.getText();
          String query="select *from login where cardnumber = '"+cardnumber+"'and pinnumber ='"+pinnumber+"'";
          try{
              ResultSet rs=conn.s.executeQuery(query);
              if(rs.next()){
                  setVisible(false);
                  new Transactions(pinnumber).setVisible(true);
                  
              }else{
               JOptionPane.showMessageDialog(null,"Incorrect cardnumber or pin");  
              }
          }catch(Exception e){
              System.out.print(e);
          }
        }
    
        else if(ae.getSource()==signup){
           setVisible(false);//close current frame
           new Signupone().setVisible(true);//open sign up frame
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }}
    public static void main(String args[]){
        new Login().setVisible(true);
    }
}
