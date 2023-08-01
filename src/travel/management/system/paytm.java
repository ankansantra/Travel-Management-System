package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;


public class paytm extends JFrame implements ActionListener{
    
    paytm(){
        
        setBounds(500, 200, 800, 600);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        
        try{
            pane.setPage("https://paytm.com/rent-payment");
        } catch(Exception e){
           pane.setContentType("text/html");
           pane.setText("<html>Could not load , Error 404</html>");
        }
        
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        
        JButton back = new JButton("Back");
        back.setBounds(610,20,80,40);
        back.setBackground(Color.BLACK);
        back.setForeground(new Color(244,78,67));
        back.setFont(new Font("Tahoma",Font.BOLD, 14));
        back.addActionListener(this);
        pane.add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Payment();
    }
    public static void main(String[] args) {
        new paytm();
    }
    
}
