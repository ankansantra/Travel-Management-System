package travel.management.system;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.event.*;

public class ViewCustomer extends JFrame implements ActionListener{
    
    JButton back;
    
    ViewCustomer(String username){
        setBounds(400,200,850,600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(180,50,150,25);
        labelusername.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelusername);
        
        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30,110,150,25);
        add(lblid);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(180,110,150,25);
        labelid.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelid);
        
        JLabel lblnumber= new JLabel("Number");
        lblnumber.setBounds(30,170,150,25);
        add(lblnumber);
        
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(180,170,150,25);
        labelnumber.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelnumber);
        
        JLabel lblname= new JLabel("Name");
        lblname.setBounds(30,230,150,25);
        add(lblname);
        
        JLabel labelname = new JLabel();
        labelname.setBounds(180,230,150,25);
        labelname.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelname);
        
        JLabel lblgender= new JLabel("Gender");
        lblgender.setBounds(30,290,150,25);
        add(lblgender);
        
        JLabel labelgender = new JLabel();
        labelgender.setBounds(180,290,150,25);
        labelgender.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelgender);
        
        JLabel lblcountry= new JLabel("Country");
        lblcountry.setBounds(420,50,150,25);
        add(lblcountry);
        
        JLabel labelcountry = new JLabel();
        labelcountry.setBounds(570,50,150,25);
        labelcountry.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelcountry);
        
        JLabel lbladdress= new JLabel("Address");
        lbladdress.setBounds(420,110,150,25);
        add(lbladdress);
        
        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(570,110,150,25);
        labeladdress.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labeladdress);
        
        JLabel lblphone= new JLabel("Phone");
        lblphone.setBounds(420,170,150,25);
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(570,170,150,25);
        labelphone.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelphone);
        
        JLabel lblemail= new JLabel("Email");
        lblemail.setBounds(420,230,150,25);
        add(lblemail);
        
        JLabel labelemail = new JLabel();
        labelemail.setBounds(570,230,200,25);
        labelemail.setFont(new Font("Tahoma",Font.BOLD, 14));
        add(labelemail);
        
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(new Color(244,78,67));
        back.setFont(new Font("Tahoma",Font.BOLD, 14));
        back.setBounds(350,350,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icons/viewall.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(scaledImageIcon);
        imageLabel.setBounds(20, 400, 600, 200);
        add(imageLabel);
        
        ImageIcon i4 = new ImageIcon(getClass().getResource("/icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i6  = new ImageIcon(i5);
        JLabel image2 = new JLabel(scaledImageIcon);
        image2.setBounds(615, 400, 600, 200);
        add(image2);
        
        try{
            Conn conn = new Conn();
            String query = "select * from customer where username = '"+username +"'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()) {
            labelusername.setText(rs.getString("username"));
            labelid.setText(rs.getString("id"));
            labelnumber.setText(rs.getString("number"));
            labelname.setText(rs.getString("name"));
            labelgender.setText(rs.getString("gender"));
            labelcountry.setText(rs.getString("country"));
            labeladdress.setText(rs.getString("address"));
            labelphone.setText(rs.getString("phone"));
            labelemail.setText(rs.getString("email"));
        }
            
        } catch(Exception e){
            
        }

        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String[] args){
        new ViewCustomer("");
    }
}
