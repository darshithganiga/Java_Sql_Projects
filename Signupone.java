
package atm.machine;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class Signupone extends JFrame implements ActionListener{
    long random;
    JTextField namefield,fnamefield,emailfield,addressfield,cityfield,statefield,pinfield;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser datechooser;
    JLabel name,personaldetails,formno; 
    Signupone(){
        setLayout(null);
        Random ran=new Random();
         random=Math.abs((ran.nextLong()%9000L)+1000L);
       
         formno= new JLabel("Application Form No:"+random);
        formno.setBounds(140,20,600,40);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        add(formno);
        
         personaldetails= new JLabel("Page 1:Personal Details");
       personaldetails.setBounds(290,80,400,30);
        personaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        add(personaldetails);
        
       name= new JLabel("name:");
       name.setBounds(100,140,100,30);
       name.setFont(new Font("Raleway",Font.BOLD,22));
        add(name);
        
         namefield=new JTextField();
        namefield.setFont(new Font("Raleway",Font.BOLD,14));
        namefield.setBounds(300,140,400,30);
        add(namefield);
        
        JLabel fname= new JLabel("Father's name:");
       fname.setBounds(100,190,200,30);
       fname.setFont(new Font("Raleway",Font.BOLD,22));
        add(fname);
        
         fnamefield=new JTextField();
        fnamefield.setFont(new Font("Raleway",Font.BOLD,14));
        fnamefield.setBounds(300,190,400,30);
        add(fnamefield);
        
        JLabel dob= new JLabel("Date of Birth:");
       dob.setBounds(100,240,200,30);
       dob.setFont(new Font("Raleway",Font.BOLD,20));
        add(dob);
        
         datechooser=new JDateChooser();
        datechooser.setBounds(300,240,400,30);
        datechooser.setForeground(Color.RED);
        add(datechooser);
        
        JLabel gender= new JLabel("Gender:");
      gender.setBounds(100,290,200,30);
       gender.setFont(new Font("Raleway",Font.BOLD,20));
        add(gender);
        
         male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
          female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup=new ButtonGroup();//to avoid double  selection of gender
        gendergroup.add(male);
         gendergroup.add(female);
         
         
          JLabel email= new JLabel("Email Address:");
      email.setBounds(100,340,200,30);
       email.setFont(new Font("Raleway",Font.BOLD,20));
        add(email);
        
        
        
         emailfield=new JTextField();
     emailfield.setFont(new Font("Raleway",Font.BOLD,14));
         emailfield.setBounds(300,340,400,30);
        add( emailfield);
        
        JLabel marital= new JLabel("Marital Status:");
     marital.setBounds(100,390,200,30);
      marital.setFont(new Font("Raleway",Font.BOLD,20));
        add(marital);
        
         married = new JRadioButton("Married");
      married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
          unmarried = new JRadioButton("unmarried");
     unmarried.setBounds(450,390,120,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
           other = new JRadioButton("other ");
     other.setBounds(630,390,100,30);
       other.setBackground(Color.WHITE);
        add(other );
        
        ButtonGroup sother=new ButtonGroup();//to avoid double  selection of gender
        sother.add(married);
         sother.add(unmarried);
       sother.add(other);
       
      JLabel address= new JLabel("Address:");
     address.setBounds(100,440,200,30);
     address.setFont(new Font("Raleway",Font.BOLD,20));
        add(address); 
        
       addressfield=new JTextField();
     addressfield.setFont(new Font("Raleway",Font.BOLD,14));
         addressfield.setBounds(300,440,400,30);
        add( addressfield);
         
      JLabel city= new JLabel("City:");
   city.setBounds(100,490,200,30);
    city.setFont(new Font("Raleway",Font.BOLD,20));
        add(city);  
        
        cityfield=new JTextField();
     cityfield.setFont(new Font("Raleway",Font.BOLD,14));
         cityfield.setBounds(300,490,400,30);
        add( cityfield);
       
         JLabel state= new JLabel("state:");
    state.setBounds(100,540,200,30);
    state.setFont(new Font("Raleway",Font.BOLD,20));
        add( state); 
        
           statefield=new JTextField();
    statefield.setFont(new Font("Raleway",Font.BOLD,14));
      statefield.setBounds(300,540,400,30);
        add( statefield);
        
        
    JLabel pincode= new JLabel("PIN Code:");
 pincode.setBounds(100,540,200,30);
  pincode.setBounds(100,590,200,30);
    pincode.setFont(new Font("Raleway",Font.BOLD,20));
    add( pincode);
    
       pinfield=new JTextField();
     pinfield.setFont(new Font("Raleway",Font.BOLD,14));
       pinfield.setBounds(300,590,400,30);
        add(  pinfield);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        add(next);
        next.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(300,10);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        String formno="" + random;//converts long value to string
        String name=namefield.getText();
        String fname=fnamefield.getText();  
        String dob=((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }else if(female.isSelected()){
            gender="Female";
        }
        String email=emailfield.getText();
        String marital=null;
        if(married.isSelected()){
            marital="Married";
        }
        else if(unmarried.isSelected()){
            marital="Unmarried";
        }
        else if(other.isSelected()){
            marital="Other";
        }
        
        String address= addressfield.getText();
        String city=cityfield.getText();
        String state=statefield.getText();
        String pin=pinfield.getText();
  
        try   
        {
            if(ae.getSource() == next){
         if(name.equals(""))  {
                JOptionPane.showMessageDialog(null,"Name is required" );  
            }
            else{
                Conn c=new Conn();
                 String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                 c.s.executeUpdate(query);
                 new SignupTwo(formno).setVisible(true);
                 setVisible(false);
               
            }
            
        }}
        catch(Exception e){
           e.printStackTrace();
        }
    }
    public static void main(String args[]){
       new Signupone().setVisible(true);
    }
}
