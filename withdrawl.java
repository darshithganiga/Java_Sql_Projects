


package atm.machine;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.sql.*;
public class withdrawl extends JFrame implements ActionListener {
    JLabel image;
    JButton withdraw,back;
    JTextField amount;
    String pinnumber;
    withdrawl(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));//get the logo
  Image i2=i1.getImage().getScaledInstance(1000,1180,Image.SCALE_DEFAULT);//Scaling the logo
  ImageIcon i3=new ImageIcon(i2);
   image=new JLabel(i3);
   image.setBounds(0,0,900,900);
   add(image);
   
   JLabel text=new JLabel("Enter the amount You want to withdraw");
   text.setForeground(Color.WHITE);
   text.setFont(new Font("System",Font.BOLD,16));
   text.setBounds(170,300,400,20);
   image.add(text);
   
   amount=new JTextField();
   amount.setBounds(170,350,320,25);
   amount.setFont(new Font("Raleway",Font.BOLD,22));
   image.add(amount);
   
   
  withdraw=new JButton("withdraw");
   withdraw.setBounds(355,485,150,30);
   withdraw.addActionListener(this);
   image.add(withdraw);
   
   back=new JButton("Back");
   back.setBounds(355,520,150,30);
   back.addActionListener(this);
   image.add(back);
   
   
   setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
   public void actionPerformed(ActionEvent ae){
      
       try{
           String number=amount.getText();
           Date date=new Date();
       
           if (ae.getSource()==withdraw){
           
           if(number.equals("")){
               JOptionPane.showMessageDialog(null,"Please Enter amount  the amount yOou want to withdraw ");
           }
           
           else{
               try{
               Conn c=new Conn();
               String query="insert into bank values('"+pinnumber+"', '"+date+"', 'withdraw', '"+number+"')";
              c.s.executeUpdate(query);
              JOptionPane.showMessageDialog(null,"Rs"+number+" was withdrawn from Youre Account");
              setVisible(false);
              new Transactions(pinnumber).setVisible(true);
              
           }
           catch(Exception e){
                   System.out.println(e);
                   }}
           }
        
       else if (ae.getSource()==back){
           setVisible(false);
           new Transactions(pinnumber).setVisible(true);
           }
   } 
   catch(Exception e){
    e.printStackTrace();
}
   }
public static void main(String[] args){
    new Deposit("").setVisible(true);
}
}


