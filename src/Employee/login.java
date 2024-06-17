package Employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class login  implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    login(){

        f=new JFrame("Login");

        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(600,250,180,30);
        l1.setFont(new Font("serif",Font.BOLD,30));
        f.add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(600,350,180,30);
        l2.setFont(new Font("serif",Font.BOLD,30));
        f.add(l2);
 
        t1=new JTextField();
        t1.setBounds(750,253,150,30);
        f.add(t1);

        t2=new JPasswordField();
        t2.setBounds(750,353,150,30);
        f.add(t2);

        //buttons
        b1 = new JButton("Login");
        b1.setBounds(620,450,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(new Color(7, 75, 94));
        b1.setForeground(Color.WHITE);
        f.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(760,450,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(new Color(7, 75, 94));
        b2.setForeground(Color.WHITE);
        f.add(b2);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(1014,614,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1014,614);
        f.add(l3);


        b2.addActionListener(this);




        f.getContentPane().setBackground(new Color(6, 226, 214));

        f.setVisible(true);
        f.setSize(1025,650);
        f.setLocation(200,150);

    }

    public void actionPerformed(ActionEvent ae){

        try{
            Conn c1 = new Conn();
            String u = t1.getText();
            String v = t2.getText();
            
            String q = "select * from login where username='"+u+"' and password='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(q); 
            if(rs.next()){
                new details().f.setVisible(true);
                f.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                f.setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] arg){
        login l=new login();
    }
}