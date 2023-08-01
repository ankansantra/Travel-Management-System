package travel.management.system;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class About extends JFrame implements ActionListener{
    
    
    
    About(){
        
        setBounds(600,200,800,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("About");
        l1.setBounds(350,10,100,40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN,20));
        add(l1);
        
        String s = "Developed by Ankan Santra"+
                   "\n"+
                   "\n"+
                   "The main objective of the ExpolreX Travel & Tourism Management System is to develope a system that"+
                   "\n"+
                   "automates the process and activities of a travel and the purpose is to design a system using which can "+
                   "\n"+
                   "perform all operation realeted to travelling."+
                   "\n"+
                   "This application will help in accessing the information related to the travel to the particular destination with "+
                   "\n"+
                   "great ease. The users can track the information related to their tours with great ease through this application."+
                   "\n"+
                   "The travel agency information can also be obtained through this application."+
                   "\n"+
                   "\n"+
                   "Advantages of Projects:\n"+
                   "\n"+
                   "Give acuurate information\n"+
                   "Simplifies the Manual Work\n"+
                   "It minimize the document realeted work\n"+
                   "Provided up to date information\n"+
                   "Friendly Enviourment by Providing warning messages.\n"+
                   "Travelers details can be provided\n"+
                   "Booking confirmation notification\n";
        
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(50,100,700,300);
        add(area);
        
        JButton back = new JButton("Back");
        back.setBounds(350,420,100,25);
        back.setBackground(Color.BLACK);
        back.setForeground(new Color(244,78,67));
        back.setFont(new Font("Tahoma",Font.BOLD, 16));
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
                
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String[] args){
        new About();
    }
    
}
