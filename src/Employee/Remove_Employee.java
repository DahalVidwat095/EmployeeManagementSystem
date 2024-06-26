package Employee;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Remove_Employee implements ActionListener{
    JFrame f;
    JTextField t;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b,b1,b2,b3;

    Remove_Employee(){
        f=new JFrame("Remove Employee");
        f.setBackground(Color.green);   
        f.setLayout(null);

        l5=new JLabel();
        l5.setBounds(0,0,600,400);
        l5.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/remove.jpg"));
        l5.setIcon(img);
        f.add(l5);

        
        l1=new JLabel("Employee Id");
        l1.setBounds(50,50,250,30);
        l1.setForeground(Color.white);
        Font f2 = new Font("serif",Font.BOLD,25); 
        l1.setFont(f2);
        l1.setForeground(Color.white);
        l5.add(l1);

        t=new JTextField();
        t.setBounds(250,50,150,30);
        l5.add(t);


        b=new JButton("Search");
        b.setBounds(200,300,100,30);
        b.setBackground(new Color(20, 164, 164));
        b.addActionListener(this);
        l5.add(b);

        b3=new JButton("Back");
        b3.setBounds(360,300,100,30);
        b3.setBackground(new Color(20, 164, 164));
        b3.addActionListener(this);
        l5.add(b3);


        l2=new JLabel("Name:"); 
        l2.setBounds(10,150,250,30);
        l2.setForeground(Color.black);
        Font f3 = new Font("serif",Font.BOLD,20); 
        l2.setFont(f3);

        l5.add(l2);

        l6=new JLabel();    
        l6.setBounds(125,150,350,30);
        l6.setForeground(Color.white);
        Font F6=new Font("serif",Font.BOLD,20); 
        l6.setFont(F6);
        l5.add(l6);

        l3=new JLabel("Mobile No:");
        l3.setBounds(10,200,250,30);
        l3.setForeground(Color.black);
        Font f4 = new Font("serif",Font.BOLD,20); 
        l3.setFont(f4);
        l5.add(l3);


        l7=new JLabel();
        l7.setBounds(125,200,350,30);
        l7.setForeground(Color.white);
        Font F7=new Font("serif",Font.BOLD,20); 
        l7.setFont(F7);
        l5.add(l7);



        l4=new JLabel("Email Id:");
        l4.setBounds(10,250,250,30);
        l4.setForeground(Color.black);
        Font F5=new Font("serif",Font.BOLD,20); 
        l4.setFont(F5);
        l5.add(l4);

        l8=new JLabel();
        l8.setBounds(125,250,350,30);
        l8.setForeground(Color.white);
        Font f8=new Font("serif",Font.BOLD,20); 
        l8.setFont(f8);
        l5.add(l8);

        b1=new JButton("Remove");
        b1.setBounds(120,300,100,30);
        b1.addActionListener(this);
        l5.add(b1);


        b2=new JButton("Cancel");
        b2.setBounds(300,300,100,30);
        b2.addActionListener(this);
        l5.add(b2);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);

        f.setSize(600,400);
        f.setLocation(500,250);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            try{
                Conn con = new Conn();
                String str = "select name,phone,email from employee where emp_id ='"+t.getText()+"' ";
                ResultSet rs = con.s.executeQuery(str);

                int i=0;
                if(rs.next()){
                    String name = rs.getString(1);
                    String mob = rs.getString(2);
                    String email=rs.getString(3);

                    l2.setVisible(true);
                    l3.setVisible(true);
                    l4.setVisible(true);
                    b1.setVisible(true);
                    b2.setVisible(true);    
                    i=1;
                    l6.setText(name);
                    l7.setText(mob);
                    l8.setText(email);
                }
                if(i==0)
                    JOptionPane.showMessageDialog(null,"Id not found");
            }catch(Exception ex){}
        }
        if(ae.getSource()==b1){
            try{
                Conn con = new Conn();
                String str = "delete from employee where emp_id = '"+t.getText()+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"deleted successfully");
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                l6.setVisible(false);
                l7.setVisible(false);
                l8.setVisible(false);
                b1.setVisible(false);
                b2.setVisible(false);

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Exception occurred while deleting record "+ex);
            }
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            details d=new details();
        }
    }

    public static void main(String[]ar){
        new Remove_Employee();
    }
}