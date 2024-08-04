import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Currency{
    JFrame f;
    JComboBox<String> toContry ;
    JComboBox<String> fromContry ;
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    JLabel toC=new JLabel("Enter Indian Currency ");
      JLabel toF=new JLabel("Value Of your Currency");
    
    JButton btn=new JButton("Convert");
    String Contry[]={"Select Contry","Afghanistan","Argentina","Armenia","Australia","Brazil","Canada","China","France","Germany","Hong Kong","India","Indonesia","Iran","Iraq","Japan","Korea","Kuwait","Mexico","Nepal","New Zealand","Netherlands","Pakistan","Russia","Singapore","South Africa","Sri Lanka","Switzerland","Taiwan","Thailand","Turkey","Uganda","Zimbabwe"};
    
    
  public Currency()
  {
     
      f=new JFrame();
      f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
      f.setLayout(null);
      f.setSize(450, 270);
      f.setLocationRelativeTo(null);
      f.setTitle("Currency Control");
      Container c=f.getContentPane();
      
     JLabel l=new JLabel("Select Your Contry");
     l.setFont(new Font("Serif", Font.BOLD, 22));
         JLabel l1=new JLabel(" To ");
     l1.setFont(new Font("Serif", Font.PLAIN, 15));
 
      toContry=new JComboBox<>(Contry);
      toContry.setBounds(30, 70, 390, 25);
    
      
       toC.setBounds(20, 120, 200, 25);
       toF.setBounds(240, 120, 200, 25);
       t1.setBounds(20, 155, 180, 25);
       t2.setBounds(240, 155, 180, 25);
       btn.setBounds(20, 200, 400, 25);
       btn.setForeground(Color.black);
       btn.setBackground(Color.green);
       t2.setEditable(false);
       f.setResizable(false);
       l.setBounds(130, 20, 200, 30);
      c.add(toContry);
      c.add(t1);
      c.add(t2);
      c.add(l);
      c.add(toC);
      c.add(toF);
      c.add(btn);
      Event ev=new Event(this);
      btn.addActionListener(ev);

      
      
      f.setVisible(true);
      
  }
  public static void main(String ar[])
  {
      try {
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
          new Currency();
      } catch (Exception e) {
      }
 
  }
}