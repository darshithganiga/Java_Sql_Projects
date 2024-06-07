package atm.machine;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Transactions extends JFrame implements ActionListener{
    JButton deposit,Withdrawl,ministatement,pinchange,balanceenq,exit,fastcash;
     String pinnumber;
     JLabel image;
    Transactions(String pinnumber){
        this.pinnumber=pinnumber;
        setSize(900,900);
        setLayout(null);   
  
  ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));//get the logo
  Image i2=i1.getImage().getScaledInstance(1000,1180,Image.SCALE_DEFAULT);//Scaling the logo
  ImageIcon i3=new ImageIcon(i2);
   image=new JLabel(i3);
   image.setBounds(0,0,900,900);
   add(image);
   
   
      JLabel text=new JLabel("Please select youre Transactions");
      text.setBounds(210,300,700,35);
      text.setForeground(Color.WHITE);
      text.setFont(new Font("System",Font.BOLD,16));
      image.add(text);
      
       deposit=new JButton("Deposit");
      deposit.setBounds(170,415,150,30);
      deposit.addActionListener(this);
      image.add(deposit);
      
       Withdrawl=new JButton("Cash Withdrawl");
      Withdrawl.setBounds(355,415,150,30);
      Withdrawl.addActionListener(this);
      image.add(Withdrawl);
      
      fastcash=new JButton("Fast Cash");
      fastcash.setBounds(170,450,150,30);
      fastcash.addActionListener(this);
      image.add(fastcash);
      
       ministatement=new JButton("Mini Statement");
     ministatement.setBounds(355,450,150,30);
     ministatement.addActionListener(this);
     image.add(ministatement);
      
      pinchange=new JButton("Pin change");
     pinchange.setBounds(170,485,150,30);
     pinchange.addActionListener(this);
     image.add(pinchange);
      
      balanceenq=new JButton("Balance Enquiry");
    balanceenq.setBounds(355,485,150,30);
    balanceenq.addActionListener(this); 
    image.add(balanceenq);
      
    exit=new JButton("Exit");
      exit.setBounds(355,520,150,30);
    exit.addActionListener(this);
      image.add(exit);
      

setLocation(300, 0);
setUndecorated(true);
setVisible(true);

}
public void actionPerformed(ActionEvent ae){
    if (ae.getSource()==exit){
        System.exit(0);
    }
    else if(ae.getSource()==deposit){
        setVisible(false);
        new Deposit(pinnumber).setVisible(true);
    }
    else if(ae.getSource()==Withdrawl){
        setVisible(false);
        new withdrawl(pinnumber).setVisible(true);
    }
    else if(ae.getSource()==fastcash){
        setVisible(false);
        new FastCash(pinnumber).setVisible(true);
    }
    else if(ae.getSource()==pinchange){
        setVisible(false);
        new PinChange(pinnumber).setVisible(true);
    }
    else if(ae.getSource()==balanceenq){
        setVisible(false);
        new Balanceenquiry(pinnumber).setVisible(true);
    }else if(ae.getSource()==ministatement){
        
        new Ministatement(pinnumber).setVisible(true);
    }
}

public static void main(String args[]){
    
new Transactions("");
}}
