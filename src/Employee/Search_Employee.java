package Employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Search_Employee implements ActionListener{
    JFrame f;
    JTextField t;
    JLabel l,l5;
    JButton b,b2;

    Search_Employee(){
        f=new JFrame("Search Employee");
        f.setBackground(Color.green);
        f.setLayout(null);
//labels
        l5=new JLabel();
        l5.setBounds(0,0,624,382);
        l5.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/view.png"));
        l5.setIcon(img);


        l=new JLabel("Employee Id");
        l.setVisible(true);
        l.setBounds(100,150,500,30);
        l.setForeground(new Color(255, 255, 255));
        Font F1=new Font("serif",Font.BOLD,25);
        l.setFont(F1); 
        l5.add(l);
        f.add(l5);

        t=new JTextField();
        t.setBounds(240,150,220,30);
        l5.add(t);

        b=new JButton("Search");
        b.setBounds(240,200,100,30);
        b.setBackground(new Color(114, 204, 198));
        b.addActionListener(this);
        l5.add(b);


        b2=new JButton("Cancel");
        b2.setBounds(360,200,100,30);
        b2.setBackground(new Color(114, 204, 198));
        b2.addActionListener(this);
        l5.add(b2);

        f.setSize(624,380);
        f.setLocation(250,250);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            f.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b){
            new Update_Employee(t.getText());
            f.setVisible(false);
        }

    }
    
    public static void main(String[]ar){
        new Search_Employee();
    } 	
}