package travel.management.system;
import java.awt.*;
import javax.swing.*;


public class CheckPackage extends JFrame{
    
    
    CheckPackage(){
        setBounds(450, 200, 900, 600);
        
        String[] package1 = {"GOLD PACKAGE","7 Days & 6 Nights", "Return Airfare", "Hard Drink Free", "Free Clubbing" ,"Horse Riding","Watersports","Pickup & Greet at Airport","BOOK NOW","SUMMER SPECIAL","Rs 40000/-" ,"package2.jpg"};
        String[] package2 = {"SILVER PACKAGE", "6 Days & 5 Nights", "Toll Free Entrance ","Soft Drink Free", "Airport Assistance","Daily Buffet", "Meals","Sightseeing" ,"BOOK NOW","WINTER SPECIAL","Rs 30000/-","package1.jpg"};
        String[] package3 = {"BRONZE PACKAGE","5 Days & 4 Nights","Welcome Drink", "Airport Pickup-Drop","Daily Buffet", "Flights", "English Speaking guide","Upto 2 Stars","BOOK NOW" ,"MONSOON SPECIAL","Rs 20000/-","package3.jpg"};
                
        
        JTabbedPane tab = new JTabbedPane();
        
        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1", null, p1);
        
        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2", null, p2);
        
        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3", null, p3);
        
        add(tab);
        
        setVisible(true);
        
    }
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(30,5,300,30);
        l1.setForeground(new Color(255,215,0));
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(l1);
        
         
        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(50,60,300,30);
        l2.setForeground(new Color(0,0,0));
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l2);
        
        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(50,100,300,30);
        l3.setForeground(new Color(0,0,0));
        l3.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l3);
        
        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(50,140,300,30);
        l4.setForeground(new Color(0,0,0));
        l4.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l4);
        
        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(50,180,300,30);
        l5.setForeground(new Color(0,0,0));
        l5.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l5);
        
        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(50,220,300,30);
        l6.setForeground(new Color(0,0,0));
        l6.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l6);
        
        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(50,260,300,30);
        l7.setForeground(new Color(0,0,0));
        l7.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l7);
        
        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(50,300,300,30);
        l8.setForeground(new Color(0,0,0));
        l8.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l8);
        
        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(90,360,300,30);
        l9.setForeground(new Color(0,0,0));
        l9.setFont(new Font("Tahoma", Font.BOLD, 25));
        p1.add(l9);
        
        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(40,400,300,30);
        l10.setForeground(new Color(255,95,87));
        l10.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(l10);
        
        JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(500,380,300,30);
        l11.setForeground(new Color(139,0,0));
        l11.setFont(new Font("Tahoma", Font.BOLD, 36));
        p1.add(l11);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i12 = new JLabel(i3);
        i12.setBounds(350, 20, 500, 300);
        p1.add(i12);
        
        
        return p1;
    }
    public static void main(String[] args){
        new CheckPackage();
    }
    
}
