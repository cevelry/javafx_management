
package com.mycompany.hotelmanagementsystem;



import javax.swing.*;

public class HotelManagementSystem extends JFrame{
    HotelManagementSystem(){
        //setSize(400,400);
        
        //setLocation(300,300);
        setBounds(300,300,1366,565);
        
        ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("com/mycompany/hotelmanagementsystem/icons/first.jpg"));
        JLabel l1=new JLabel(il);
        l1.setBounds(0,0,1366,565);
        add(l1);
        
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new HotelManagementSystem();
    }
    
}
