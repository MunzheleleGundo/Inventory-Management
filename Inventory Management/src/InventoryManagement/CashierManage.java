package InventoryManagement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isyyo
 */
/*
*/

// ekse bro the database was implemented differently this time....haarh nido tea u soko pfesesa 😂😂

import java.sql.DriverManager;
import java.beans.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.plaf.FontUIResource;

public class CashierManage {
    
    // Database credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3307/inventorymanagement";
    private static final String DB_USER = "root"; 
   private static final String DB_PASSWORD = ""; 
    

    public  void CashierManageFrame() {
         // Set font for all components
      
        // Create a new JFrame
        JFrame frame = new JFrame("CASHIER MANAGE");
        frame.setBackground(Color.RED);

        // Create labels
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 40));
        JLabel surnameLabel = new JLabel("Surname:");
        surnameLabel.setFont(new Font("Arial", Font.BOLD, 40));
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Arial", Font.BOLD, 40));
        JLabel citizenLabel = new JLabel("Are You South African Citizen?");
        citizenLabel.setFont(new Font("Arial", Font.BOLD, 40));
        JLabel idLabel = new JLabel("ID No:");
        idLabel.setFont(new Font("Arial", Font.BOLD, 40));
        JLabel signatureLabel = new JLabel("Signature of Cashier:");
        signatureLabel.setFont(new Font("Arial", Font.BOLD, 40));

        // Create text fields
        JTextField nameField = new JTextField(20);
        nameField.setFont(new Font("Arial", Font.BOLD, 40));
        JTextField surnameField = new JTextField(20);
        surnameField.setFont(new Font("Arial", Font.BOLD, 40));
        JTextField idField = new JTextField(13);
        idField.setFont(new Font("Arial", Font.BOLD, 40));
        JTextField signatureField = new JTextField(20);
        signatureField.setFont(new Font("Arial", Font.BOLD, 40));

        // Create checkboxes for gender
        JCheckBox maleCheckBox = new JCheckBox("Male");
         maleCheckBox.setFont(new Font("Arial", Font.BOLD, 40));
        JCheckBox femaleCheckBox = new JCheckBox("Female");
          femaleCheckBox.setFont(new Font("Arial", Font.BOLD, 40));
        // Ensure only one checkbox for gender can be selected at a time
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleCheckBox);
        genderGroup.add(femaleCheckBox);

        // Create checkbox for South African citizen status
        JCheckBox citizenCheckBox = new JCheckBox("Yes");
        citizenCheckBox.setFont(new Font("Arial", Font.BOLD, 40));
        // Create save button
        JButton saveButton = new JButton("Save");
        saveButton.setFont(new Font("Arial", Font.BOLD, 40));
        saveButton.setForeground(Color.BLUE);
        saveButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Add action listener to the save button
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String name = nameField.getText();
                String surname = surnameField.getText();
                
                String idNo = idField.getText();
                String signature = signatureField.getText();
                String gender = maleCheckBox.isSelected() ? "Male" : (femaleCheckBox.isSelected() ? "Female" : "Not selected");
                boolean isSouthAfrican = citizenCheckBox.isSelected();
                
               
                
                
                // Validate the ID number
                if (isSouthAfrican && validateSouthAfricanID(idNo, gender)) {
                    // Save the data to the database
                    saveToDatabase(name, surname, idNo, gender, signature);
                        JOptionPane.showMessageDialog(frame, "Data saved successfully!😊");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid South African ID number!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            
        });
        
       

        // Create panel and add components in the order given
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2, 3, 5)); // 10 rows, 2 columns
        panel.setBackground(new java.awt.Color(0, 255, 255));

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(surnameLabel);
        panel.add(surnameField);
        panel.add(genderLabel);
        panel.add(maleCheckBox);
        panel.add(new JLabel());  // Blank space for grid layout alignment
        panel.add(femaleCheckBox);
        panel.add(citizenLabel);
        panel.add(citizenCheckBox);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(signatureLabel);
        panel.add(signatureField);

        // Add save button
        panel.add(new JLabel());  // Blank space for alignment
        panel.add(saveButton);

        // Add panel to frame
        frame.add(panel);

        // Frame settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400, 680);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);  // Center the frame on the screen
        frame.setVisible(true);
    }

    // Function to validate South African ID number
    public static boolean validateSouthAfricanID(String idNo, String gender) {
        // Check if the ID number is 13 digits long
        if (idNo.length() != 13 || !idNo.matches("\\d+")) {
            return false;
        }
        // Extract gender digit (7th digit in the ID)
        int genderDigit = Character.getNumericValue(idNo.charAt(6));
        // Gender validation
        if ((gender.equalsIgnoreCase("Male") && genderDigit < 5) || (gender.equalsIgnoreCase("Female") && genderDigit >= 5)) {
            return false;
        }
        // Extract citizenship status digit (11th digit in the ID)
        int citizenshipDigit = Character.getNumericValue(idNo.charAt(10));
        // Ensure the citizenship digit is 0 (South African citizen)
        if (citizenshipDigit != 0) {
            return false;
        }
        // Check Luhn algorithm for checksum validation
        return luhnCheck(idNo);
    }
    // Luhn Algorithm to validate checksum of South African ID
    public static boolean luhnCheck(String idNo) {
        int sum = 0;
        boolean alternate = false;
        for (int i = idNo.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(idNo.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    // Save cashier information to the database
    public static void saveToDatabase(String name, String surname, String idNo, String gender, String signature) {
        
        String query;

      try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            java.sql.Statement st =  con.createStatement();
            query ="INSERT INTO Cashier (Rsaid,FullNames,Surname,Gender,signature,PinCode) VALUES ('"+idNo+"','"+name+"','"+surname+"','"+gender+"', '"+signature+"','"+"0"+"' )";
            st.executeQuery(query);
            
        }
         catch(Exception e){
             System.out.println("" + e.getMessage());
           
        }
        
    }

    public void Main() {
        // Set font for all components
       
        CashierManage cm = new CashierManage();
        cm.CashierManageFrame();
    }


    public static void main(String[] args) {
        // Set font for all components
        CashierManage cm = new CashierManage();
        cm.Main();
    }
}

