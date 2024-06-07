
package atm.machine;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;
    SignupThree(String formno){
      this.formno=formno;
      setLayout(null);
      
      
       l1=new JLabel("Page 3:Account Details");
      l1.setBounds(280,40,400,40);
      l1.setFont(new Font("Raleway",Font.BOLD,22));
      add(l1);
      
       l2=new JLabel("Account Type:");
      l2.setBounds(100,140,200,30);
      l2.setFont(new Font("Raleway",Font.BOLD,22));
      add(l2);
      
        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100,300,200,30);
        add(l3);
        
        l4 = new JLabel("XXXX-XXXX-XXXX-4184");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(330,300,250,30);
        add(l4);
        
        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        l5.setBounds(100,330,300,20);
        add(l5);
        
        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setFont(new Font("Raleway", Font.BOLD, 12));
         l6.setBounds(330,330,500,20);
        add(l6);
        
        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100,370,200,30);
        add(l7);
        
        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
          l8.setBounds(330,370,200,30);
        add(l8);
        
        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("Raleway", Font.BOLD, 12));
        l9.setBounds(100,400,200,20);
        add(l9);
        
        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100,450,200,30);
        add(l10);
        
        l11 = new JLabel("Form No:");
        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        l11.setBounds(700,10,70,30);
        add(l11);
        
        l12 = new JLabel(formno);
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(770,10,40,30);
        add(l12);
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(250,720,100,30);
         b1.addActionListener(this);
         add(b1);
         
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(420,720,100,30);
        b2.addActionListener(this);
        add(b2);
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
         c4.setBounds(350,550,200,30);
        add(c4);
      
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declare that the above entered details correct to the best of my knowledge.",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100,680,600,20);
        add(c7);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);
        
        r4 = new JRadioButton("Recurring  Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        ButtonGroup groupaccount =new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
    
       getContentPane().setBackground(Color.WHITE);
       setSize(850,820);
      setLocation(350,0);
      setVisible(true);   
    } 
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String accounttype=null;
            if(r1.isSelected()){
                accounttype="Saving account";
            }
            else if(r2.isSelected()){
                accounttype="Fixed Deposit account";
            }
            else if(r3.isSelected()){
                accounttype="Current account";
            }
            else if(r4.isSelected()){
                accounttype="Recurring  account";
            }
        Random random=new Random();
        String cardnumber=""+Math.abs((random.nextLong()% 90000000L )+ 5040936000000000L);
        String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
      
        String facility="";
         if(c1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(c2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(c4.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        try{
            if(ae.getSource()==b1){
            if(accounttype.equals("")){
                JOptionPane.showMessageDialog(null,"Account type required");
            }
            else{
                Conn conn=new Conn();
                String q1 = "insert into signupthree values('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";  
                String q2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    
                conn.s.executeUpdate(q1);
                conn.s.executeUpdate(q2);
            
                JOptionPane.showMessageDialog(null,"Card Number:"+cardnumber+"\n"+"Pin Number:"+pinnumber);
                new Deposit(pinnumber).setVisible(true);
                
          //signupthree object
                setVisible (false);
                new Deposit(pinnumber).setVisible(true);
        }}
            else if(ae.getSource()==b2){
               setVisible(false);
               new Login().setVisible(true);
            }}
        catch(Exception e){
            e.printStackTrace();
        }
        
        }}
    public static void main(String args[]){
       new SignupThree("");
    }
    
}
