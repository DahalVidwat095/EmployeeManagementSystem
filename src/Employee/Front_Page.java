package Employee;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class Front_Page implements ActionListener{
    JFrame f; 
    JLabel id,l1;
    JButton b;

    Front_Page(){
 
        f=new JFrame("Employee Management System");
        f.setBackground(new Color(255, 0, 0));
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front2.png"));
        Image i2 = i1.getImage().getScaledInstance(288,267,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(300,80,288,267);
        f.add(l1);


        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(new Color(4, 90, 115));
        b.setForeground(Color.WHITE);
        

        b.setBounds(350,370,200,30);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,900,450);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(90,5,800,100);
        lid.setFont(new Font("serif",Font.PLAIN,40));
        lid.setForeground(new Color(255, 0, 0));
        id.add(lid);

        id.add(b);
        f.add(id);
        
        
        f.getContentPane().setBackground(new Color(114, 204, 198));

        f.setVisible(true);
        f.setSize(900,450);
        f.setLocation(200,100);

        while(true){
            lid.setVisible(false); // lid =  j label
            try{
                Thread.sleep(500); //1000 = 1 second
            }catch(Exception e){} 
            lid.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new login();    
        }
    }

    public static void main(String[] arg){
        Front_Page f = new Front_Page();
    }
}