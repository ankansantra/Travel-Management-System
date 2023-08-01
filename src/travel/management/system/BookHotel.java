package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;


public class BookHotel extends JFrame implements ActionListener{
    
    Choice chotel,cac, cfood;
    JTextField tfpersons,tfdays;
    String username;
    JLabel labelusername, labelid,labelnumber, labelphone, labelprice;
    JButton checkprice, bookpackage, back;
    
    
    BookHotel(String username){
        this.username = username;
        setBounds(350,200,1100,600);
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text = new JLabel("BOOK HOTEL");
        text.setBounds(100,10,200,30);
        text.setFont(new Font("Tahoma",Font.BOLD, 24));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblusername.setBounds(40,70,100,20);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setBounds(210,70,100,20);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN, 16));
        add(labelusername);
        
        JLabel lblpackage = new JLabel("Select Hotel");
        lblpackage.setBounds(40,110,150,20);
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN, 16));
        add(lblpackage);
        
        chotel = new  Choice();
        chotel.setBounds(200,110,200,20);
        add(chotel);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel");
            while(rs.next()){
                chotel.add(rs.getString("name"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        JLabel lblpersons= new JLabel("Total Persons");
        lblpersons.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblpersons.setBounds(40,150,150,25);
        add(lblpersons);
        
        tfpersons = new JTextField("1");
        tfpersons.setBounds(200,150,200,25);
        tfpersons.setBackground(new Color(245,241,241));
        add(tfpersons);
        
        JLabel lbldays= new JLabel("No of Days");
        lbldays.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lbldays.setBounds(40,190,150,25);
        add(lbldays);
        
        tfdays = new JTextField("1");
        tfdays.setBounds(200,190,200,25);
        tfdays.setBackground(new Color(245,241,241));
        add(tfdays);
        
        JLabel lblac= new JLabel("AC/ Non-AC");
        lblac.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblac.setBounds(40,230,150,25);
        add(lblac);
        
        cac = new  Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(200,230,200,20);
        add(cac);
        
        JLabel lblfood = new JLabel("Food Included");
        lblfood.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblfood.setBounds(40,270,150,25);
        add(lblfood);
        
        cfood = new  Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(200,270,200,20);
        add(cfood);
        
        JLabel lblid = new JLabel("Id");
        lblid.setBounds(40,310,150,20);
        lblid.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblid.setBackground(new Color(245,241,241));
        add(lblid);
        
        labelid = new JLabel();
        labelid.setBounds(210,310,200,25);
        labelid.setFont(new Font("Tahoma",Font.PLAIN, 16));
        add(labelid);
        
        JLabel lblnumber= new JLabel("Number");
        lblnumber.setBounds(40,350,150,25);
        lblnumber .setFont(new Font("Tahoma",Font.PLAIN, 16));
        add(lblnumber);
        
        labelnumber = new JLabel();
        labelnumber.setBounds(210,350,150,25);
        labelnumber.setFont(new Font("Tahoma",Font.PLAIN, 16));
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(40,390,150,20);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN, 16));
        lblid.setBackground(new Color(245,241,241));
        add(lblphone);
        
        labelphone = new JLabel();
        labelphone.setBounds(210,390,200,25);
        labelphone.setFont(new Font("Tahoma",Font.PLAIN, 16));
        add(labelphone);
        
        JLabel lbltotal= new JLabel("Total Price");
        lbltotal.setBounds(40,440,150,25);
        lbltotal .setFont(new Font("Tahoma",Font.BOLD, 20));
        add(lbltotal);
        
        labelprice = new JLabel();
        labelprice.setBounds(210,440,150,25);
        labelprice.setFont(new Font("Tahoma",Font.BOLD, 20));
        add(labelprice);
        
        try{
            Conn conn = new Conn();
            String query = "select * from customer where username = '"+username +"'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()) {
            labelusername.setText(rs.getString("username"));
            labelid.setText(rs.getString("id"));
            labelnumber.setText(rs.getString("number"));
            labelphone.setText(rs.getString("phone"));
            
            
        }
            
        } catch(Exception e){
            e.printStackTrace();
            
        }
        
        checkprice = new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(new Color(244,78,67));
        checkprice.setBounds(60,500,120,25);
        checkprice.setFont(new Font("Tahoma",Font.BOLD, 14));
        checkprice.addActionListener(this);
        add(checkprice);
        
        bookpackage = new JButton("Book Hotel");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(new Color(244,78,67));
        bookpackage.setBounds(200,500,130,25);
        bookpackage.setFont(new Font("Tahoma",Font.BOLD, 14));
        bookpackage.addActionListener(this);
        add(bookpackage);
        
        back = new JButton("Back");
        back.setForeground(new Color(244,78,67));
        back.setBackground(Color.BLACK);
        back.setBounds(340,500,120,25);
        back.setFont(new Font("Tahoma",Font.BOLD, 14));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i12 = new JLabel(i3);
        i12.setBounds(500, 50, 600, 300);
        add(i12);
        
                
        
        setVisible(true);
        
    }
    
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()== checkprice) {
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from hotel where name='"+chotel.getSelectedItem()+"'");
                while(rs.next()) {
                    int cost = Integer.parseInt(rs.getString("costperperson"));
                    int food = Integer.parseInt(rs.getString("foodincluded"));
                    int ac = Integer.parseInt(rs.getString("acroom"));
                    
                    int person = Integer.parseInt(tfpersons.getText());
                    int days = Integer.parseInt(tfdays.getText());
                    
                    String acselected = cac.getSelectedItem();
                    String foodselected = cfood.getSelectedItem();
                    
                    if(person * days > 0){
                        int total = 0;
                        total += acselected.equals("AC") ? ac : 0;
                        total += foodselected.equals("Yes")? food :0;
                        total += cost;
                        total = total * person + days;
                        labelprice.setText(" RS " + total);
                    } else {
                        JOptionPane.showMessageDialog(null,"Please Enter A Valid Number");
                    }
                    
                }
                
            } catch (Exception e){
                e.printStackTrace();
            }
            
                    
        }else if (ae.getSource() == bookpackage){
            try{
                Conn c = new Conn();
                c.s.executeUpdate("INSERT INTO bookhotel values('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
                
                JOptionPane.showMessageDialog(null, "Hotel Booked Succesfully");
                setVisible(false);
            } catch (Exception e){
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new BookHotel("");
        
    } 
    
}
