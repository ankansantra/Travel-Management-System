package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkPackages, bookPackages, viewPackage,viewHotel,destination,bookHotel,viewBookedHotel,payments,about,deletePersonlDetails,logoutButton;;
    
    JLabel slideshow;
     JLabel usernameLabel;
    String[] imagePaths = { "icons/home.jpg", "icons/home1.jpg", "icons/home2.jpg","icons/home3.jpg","icons/home4.jpg","icons/home5.jpg","icons/home6.jpg","icons/home7.jpg" };
    int currentIndex = 0;
    
    Dashboard(String username){
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 =new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,166,255));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon  i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setBackground(Color.WHITE);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
        
        usernameLabel = new JLabel("Welcome ");
        usernameLabel.setBounds(750, 20, 300, 20);
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        p1.add(usernameLabel);
        
        JLabel usernameText = new JLabel(username);
        usernameText.setBounds(830, 20, 300, 20);
        usernameText.setForeground(Color.BLACK);
        usernameText.setFont(new Font("Tahoma", Font.BOLD, 16));
        p1.add(usernameText);
        
        
        JPanel p2 =new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,166,255));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,10,300,50);
        addPersonalDetails.setFont(new Font("Tahoma",Font.BOLD,20));
        addPersonalDetails.setBackground(Color.BLACK);
        addPersonalDetails.setForeground(new Color(244,78,67)); 
        addPersonalDetails.setMargin(new Insets(0,0,0,80));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,70,300,50);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.BOLD,20));
        updatePersonalDetails.setBackground(Color.BLACK);
        updatePersonalDetails.setForeground(new Color(244,78,67)); 
        updatePersonalDetails.setMargin(new Insets(0,0,0,60));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0,130,300,50);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.BOLD,20));
        viewPersonalDetails.setBackground(Color.BLACK);
        viewPersonalDetails.setForeground(new Color(244,78,67)); 
        viewPersonalDetails.setMargin(new Insets(0,0,0,80));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonlDetails = new JButton("Delete Personal Details");
        deletePersonlDetails.setBounds(0,190,300,50);
        deletePersonlDetails.setFont(new Font("Tahoma",Font.BOLD,20));
        deletePersonlDetails.setBackground(Color.BLACK);
        deletePersonlDetails.setForeground(new Color(244,78,67)); 
        deletePersonlDetails.setMargin(new Insets(0,0,0,60));
        deletePersonlDetails.addActionListener(this);
        p2.add(deletePersonlDetails);
        
        checkPackages = new JButton("Check Packages");
        checkPackages.setBounds(0,250,300,50);
        checkPackages.setFont(new Font("Tahoma",Font.BOLD,20));
        checkPackages.setBackground(Color.BLACK);
        checkPackages.setForeground(new Color(244,78,67)); 
        checkPackages.setMargin(new Insets(0,0,0,20));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);
        
        bookPackages = new JButton("Book Packages");
        bookPackages.setBounds(0,310,300,50);
        bookPackages.setFont(new Font("Tahoma",Font.BOLD,20));
        bookPackages.setBackground(Color.BLACK);
        bookPackages.setForeground(new Color(244,78,67)); 
        bookPackages.setMargin(new Insets(0,0,0,20));
        bookPackages.addActionListener(this);
        p2.add(bookPackages);
        
        
        viewPackage = new JButton("View Booked Package");
        viewPackage.setBounds(0,370,300,50);
        viewPackage.setFont(new Font("Tahoma",Font.BOLD,20));
        viewPackage.setBackground(Color.BLACK);
        viewPackage.setForeground(new Color(244,78,67)); 
        viewPackage.setMargin(new Insets(0,0,0,40));
        viewPackage.addActionListener(this);
        p2.add(viewPackage);
        
        viewHotel = new JButton("View Hotel");
        viewHotel.setBounds(0,430,300,50);
        viewHotel.setFont(new Font("Tahoma",Font.BOLD,20));
        viewHotel.setBackground(Color.BLACK);
        viewHotel.setForeground(new Color(244,78,67)); 
        viewHotel.setMargin(new Insets(0,0,0,20));
        viewHotel.addActionListener(this);
        p2.add(viewHotel);
        
        bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(0,490,300,50);
        bookHotel.setFont(new Font("Tahoma",Font.BOLD,20));
        bookHotel.setBackground(Color.BLACK);
        bookHotel.setForeground(new Color(244,78,67));          
        bookHotel.setMargin(new Insets(0,0,0,20));
        bookHotel.addActionListener(this);
        p2.add(bookHotel);
        
        viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0,550,300,50);
        viewBookedHotel.setFont(new Font("Tahoma",Font.BOLD,20));
        viewBookedHotel.setBackground(Color.BLACK);
        viewBookedHotel.setForeground(new Color(244,78,67));          
        viewBookedHotel.setMargin(new Insets(0,0,0,160));
        viewBookedHotel.addActionListener(this);
        p2.add(viewBookedHotel);
        
        destination = new JButton("Destination");
        destination.setBounds(0,610,300,50);
        destination.setFont(new Font("Tahoma",Font.BOLD,20));
        destination.setBackground(Color.BLACK);
        destination.setForeground(new Color(244,78,67));        
        destination.setMargin(new Insets(0,0,0,20));
        destination.addActionListener(this);
        p2.add(destination);
        
        payments = new JButton("Payments");
        payments.setBounds(0,670,300,50);
        payments.setFont(new Font("Tahoma",Font.BOLD,20));
        payments.setBackground(Color.BLACK);
        payments.setForeground(new Color(244,78,67));
        payments.addActionListener(this);
        payments.setMargin(new Insets(0,0,0,20));
        p2.add(payments);
        
        
        
        
        about = new JButton("About");
        about.setBounds(0,730,300,50);
        about.setFont(new Font("Tahoma",Font.BOLD, 20));
        about.setBackground(Color.BLACK);
        about.setForeground(new Color(244,78,67));
        about.addActionListener(this);
        about.setMargin(new Insets(0,0,0,15));
        p2.add(about);
        
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(1340, 10, 80, 40);
        logoutButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        logoutButton.setBackground(Color.WHITE);
        logoutButton.setForeground(Color.BLACK);
        logoutButton.addActionListener(this);
        p1.add(logoutButton);
        
        slideshow = new JLabel();
        slideshow.setBounds(0, 0, 1650, 1000);
        add(slideshow);

        
//        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home1.jpg"));
//        Image i5 = i4.getImage().getScaledInstance(1650,1000, Image.SCALE_DEFAULT);
//        ImageIcon i6 = new ImageIcon(i5);
//        JLabel image = new JLabel(i6);
//        image.setBounds(0,0,1650,1000);
//        add(image);
        
        JLabel text = new JLabel("ExploreX");
        text.setBounds(700,70,1000,70);
        text.setForeground(new Color(255, 165,0));
        text.setFont(new Font("Oswald", Font.PLAIN, 70));
        slideshow.add(text);
        
        
        
        Timer timer = new Timer(3000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon currentImage = new ImageIcon(
                        ClassLoader.getSystemResource(imagePaths[currentIndex]));
                Image scaledImage = currentImage.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
                ImageIcon displayedImage = new ImageIcon(scaledImage);
                slideshow.setIcon(displayedImage);

                currentIndex = (currentIndex + 1) % imagePaths.length;
            }
        });
        timer.setInitialDelay(0);
        timer.setDelay(3000);
        timer.start();
        setVisible(true);
    
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails){
            new ViewCustomer(username);
        } else if (ae.getSource() == updatePersonalDetails){
            new UpdateCustomer(username);
        } else if (ae.getSource() == deletePersonlDetails){
            new DeleteDetails(username);
        } else if (ae.getSource() == checkPackages){
            new CheckPackage();
        } else if (ae.getSource() == bookPackages ){
            new BookPackage(username);
        } else if (ae.getSource() == viewPackage){
            new ViewPackage(username);
        } else if (ae.getSource() == viewHotel){
            new CheckHotels();
        } else if (ae.getSource() == destination){
            new Destinations();
        } else if (ae.getSource()== bookHotel){
            new BookHotel(username);
        } else if (ae.getSource() == viewBookedHotel){
            new ViewBookedHotel(username);
        } else if (ae.getSource() == payments){
            new Payment();
        } else if (ae.getSource() == about){
            new About();
        } else if (ae.getSource() == logoutButton) {
            dispose();
            new Login();
           
    }
    }
    public static void main(String[] args){
        new Dashboard("");
    }
    
}
