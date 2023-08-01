package travel.management.system;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.event.*;

public class ViewBookedHotel extends JFrame implements ActionListener{
    
    JButton back;
    
    ViewBookedHotel(String username){
        setBounds(400,200,1000,600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("VIEW BOOKED HOTEL DETAILS");
        text.setBounds(60, 10, 400, 30);
        text.setFont(new Font("Tahoma",Font.BOLD, 20));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        labelusername.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelusername);
        
        JLabel lblid = new JLabel("Hotel Name");
        lblid.setBounds(30,90,150,25);
        lblid.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(lblid);
        
        JLabel labelpackage = new JLabel();
        labelpackage.setBounds(220,90,150,25);
        labelpackage.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelpackage);
        
        JLabel lblnumber= new JLabel("Total Persons");
        lblnumber.setBounds(30,130,150,25);
        lblnumber.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(lblnumber);
        
        JLabel labelpersons = new JLabel();
        labelpersons.setBounds(220,130,150,25);
        labelpersons.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelpersons);
        
        JLabel lbldays = new JLabel("Total Days");
        lbldays.setBounds(30,170,150,25);
        lbldays.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(lbldays);
        
        JLabel labeldays = new JLabel();
        labeldays.setBounds(220,170,150,25);
        labeldays.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labeldays);
        
        JLabel lblac= new JLabel("AC/Non-AC");
        lblac.setBounds(30,210,150,25);
        lblac.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(lblac);
        
        JLabel labelac = new JLabel();
        labelac.setBounds(220,210,150,25);
        labelac.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelac);
        
        JLabel lblfood = new JLabel("Food Included ?");
        lblfood.setBounds(30,250,150,25);
        lblfood.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(lblfood);
        
        JLabel labelfood = new JLabel();
        labelfood.setBounds(220,250,150,25);
        labelfood.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelfood);
        
        JLabel lblname= new JLabel("Id");
        lblname.setBounds(30,290,150,25);
        lblname.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(lblname);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220,290,150,25);
        labelid.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelid);
        
        JLabel lblgender= new JLabel("Number");
        lblgender.setBounds(30,330,150,25);
        lblgender.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(lblgender);
        
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,330,150,25);
        labelnumber.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelnumber);
        
        JLabel lblcountry= new JLabel("Phone");
        lblcountry.setBounds(30,370,150,25);
        lblcountry.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(lblcountry);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(220,370,150,25);
        labelphone.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelphone);
        
        JLabel lbladdress= new JLabel("Total Cost");
        lbladdress.setBounds(30,410,150,25);
        lbladdress.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(lbladdress);
        
        JLabel labelprice = new JLabel();
        labelprice.setBounds(220,410,150,25);
        labelprice.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelprice);
        
        
        
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(new Color(244,78,67));
        back.setFont(new Font("Tahoma",Font.BOLD, 14));
        back.setBounds(130,460,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icons/bookedDetails.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(scaledImageIcon);
        imageLabel.setBounds(450, 20, 500, 400);
        add(imageLabel);
        
       
        
        try{
            Conn conn = new Conn();
            String query = "select * from bookhotel where username = '"+username +"'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()) {
            labelusername.setText(rs.getString("username"));
            labelid.setText(rs.getString("id"));
            labelnumber.setText(rs.getString("number"));
            labelpackage.setText(rs.getString("name"));
            labelprice.setText(rs.getString("price"));
            labelphone.setText(rs.getString("phone"));
            labelpersons.setText(rs.getString("persons"));
            labelfood.setText(rs.getString("food"));
            labelac.setText(rs.getString("ac"));
            labeldays.setText(rs.getString("days"));
            
        }
            
        } catch(Exception e){
            
        }

        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String[] args){
        new ViewBookedHotel("");
    }
}
