package Employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class details  implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;

    details(){
        f=new JFrame("Employee Detail");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,800,599);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/details.jpg"));
        l1.setIcon(i1);
        f.add(l1);

        l2 = new JLabel("Employee Details");
        l2.setBounds(299,40,200,40);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.black);
        l1.add(l2);

        b1=new JButton("Add");
        b1.setBounds(280,150,80,30);
        b1.setFont(new Font("serif",Font.BOLD,12));
        b1.addActionListener(this);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(63, 165, 238));
        l1.add(b1);


        b2=new JButton("View");
        b2.setBounds(373,150,80,30);
        b2.setFont(new Font("serif",Font.BOLD,12));
        b2.addActionListener(this);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(54, 160, 236));
        l1.add(b2);

        b3=new JButton("Remove");
        b3.setBounds(280,210,80,30);
        b3.setFont(new Font("serif",Font.BOLD,12));
        b3.addActionListener(this);
        b3.setForeground(Color.white);
        b3.setBackground(new Color(56, 163, 239));
        l1.add(b3);

        b4=new JButton("Update");
        b4.setBounds(373,210,80,30);
        b4.setFont(new Font("serif",Font.BOLD,12));
        b4.addActionListener(this);
        b4.setForeground(Color.white);
        b4.setBackground(new Color(54, 154, 229));
        l1.add(b4);

        f.setVisible(true);
        f.setSize(800,599);
        f.setLocation(450,200);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new View_Employee();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new Remove_Employee();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new Search_Employee();
        }
    }

    public static void main(String[ ] arg){
        details d = new details();
    }
}
