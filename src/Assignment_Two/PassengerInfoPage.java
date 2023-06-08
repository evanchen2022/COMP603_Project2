/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Assignment_Two;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

public class PassengerInfoPage extends javax.swing.JFrame
{

    private Flight flight;
    private SeatType classService;
    private int totalPassengers;
    private int processedPassengers;
    private PassengerInfoPageController passengerInfoController;
    private HomePageController homePageController;

    /**
     * Creates new form PassengerInfoPage
     */
    public PassengerInfoPage(Flight flight, int totalPassengers, SeatType classService)
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.totalPassengers = totalPassengers;
        this.processedPassengers = 0;
        this.passengerInfoController = new PassengerInfoPageController(new PassengerInfoPageModel());
        passengerInfoController.createPassengerInfoTable();
        this.flight = flight;
        this.homePageController = new HomePageController(new HomePageModel());
    }

    public PassengerInfoPage(int totalPassengers, int processedPassengers)
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.totalPassengers = totalPassengers;
        this.processedPassengers = processedPassengers;
        this.passengerInfoController = new PassengerInfoPageController(new PassengerInfoPageModel());
        passengerInfoController.createPassengerInfoTable();
        this.homePageController = new HomePageController(new HomePageModel());
    }

    public void setPassengerNumber(int passengerNumber)
    {
        jLabel1.setText("Passenger " + passengerNumber + " Information");
    }

    public double calculatePriceByAge(LocalDate birthdate)
    {
        double price;

        // Calculate age based on the dateOfBirth
        int age = Period.between(birthdate, LocalDate.now()).getYears();

        // Pricing policy
        if (age < 2)
        { // infant
            price = 150;
        }
        else if (age < 16)
        { // child
            price = 300;
        }
        else
        { // adult
            price = 1000;
        }

        return price;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passportNumberField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dobField = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        clientNumberField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(555, 40));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel10.setText("Welsome to Airline Booking System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(555, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel1.setPreferredSize(new java.awt.Dimension(595, 467));

        jLabel2.setText("First Name*");

        jLabel3.setText("Last  Name*");

        jLabel4.setText("Passport Number*");

        passportNumberField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                passportNumberFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Date of Birth(yyyy-mm-dd)*");

        dobField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        dobField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                dobFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Address");

        addressField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addressFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Phone Number*");

        jLabel8.setText("Email*");

        jLabel9.setText("Client Number");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("  Passenger Information");

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passportNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addContainerGap(237, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(195, 195, 195))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(151, 151, 151)
                                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(clientNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passportNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_confirmButtonActionPerformed
    {//GEN-HEADEREND:event_confirmButtonActionPerformed
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String passportNumber = passportNumberField.getText();
        String dob = dobField.getText();
        String address = addressField.getText();
        String phoneNumber = phoneNumberField.getText();
        String email = emailField.getText();
        String clientNumber = clientNumberField.getText();
        String departCT = flight.getDeparture();
        String arrivalCT = flight.getDestination();
        String flightDate = flight.getDate();
        String flightTime = flight.getTime();

        // validation for firstName
        if (!firstName.matches("[a-zA-Z]+"))
        {
            JOptionPane.showMessageDialog(null, "Invalid first name. Only letters are allowed.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // validation for lastName
        if (!lastName.matches("[a-zA-Z]+"))
        {
            JOptionPane.showMessageDialog(null, "Invalid last name. Only letters are allowed.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // validation for passportNumber
        if (!passportNumber.matches("^[a-zA-Z0-9]+"))
        {
            JOptionPane.showMessageDialog(null, "Invalid passport number. Only letters and numbers are allowed.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // validation for dob
        LocalDate dateOfBirth;
        try
        {
            dateOfBirth = LocalDate.parse(dob, DateTimeFormatter.ISO_LOCAL_DATE);
            LocalDate now = LocalDate.now();
            if (!dateOfBirth.isBefore(now))
            {
                JOptionPane.showMessageDialog(null, "Invalid date of birth. It cannot be in the future.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            long years = ChronoUnit.YEARS.between(dateOfBirth, now);
            if (years < 0 || years > 150)
            { // adjust the range as needed
                JOptionPane.showMessageDialog(null, "Invalid date of birth. The age must be between 0 and 150.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (DateTimeParseException e)
        {
            JOptionPane.showMessageDialog(null, "Invalid date format. Please enter date of birth in yyyy-MM-dd format.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // validation for phoneNumber
        if (phoneNumber.trim().isEmpty() || !phoneNumber.matches("\\d+"))
        {
            JOptionPane.showMessageDialog(null, "Invalid phone number. Only numbers are allowed.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // validation for email
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
        {
            JOptionPane.showMessageDialog(null, "Invalid email format.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //LocalDate dateOfBirth = LocalDate.parse(dob, formatter);
        LocalDate now = LocalDate.now();
        long years = ChronoUnit.YEARS.between(dateOfBirth, now);

        PassengerInfo passenger;
        if (years < 2)
        {
            passenger = new InfantPassengerInfo(firstName, lastName, passportNumber, dob, address, phoneNumber, email, clientNumber);
        }
        else if (years <= 12)
        {
            passenger = new ChildPassengerInfo(firstName, lastName, passportNumber, dob, address, phoneNumber, email, clientNumber);
        }
        else
        {
            passenger = new AdultPassengerInfo(firstName, lastName, passportNumber, dob, address, phoneNumber, email, clientNumber);
        }

        System.out.println("New passenger created: " + passenger.getFirstName() + " " + passenger.getLastName() + ", Type: " + passenger.getClass().getSimpleName());

        passengerInfoController.insertPassengerInfo(passenger);
        double price = calculatePriceByAge(dateOfBirth);

        try
        {
            homePageController.writeBookedTicket(firstName, lastName, flightDate, departCT, arrivalCT, flightTime, classService.name(), String.valueOf(price));
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        processedPassengers++;

        if (processedPassengers < totalPassengers)
        {
            PassengerInfoPage detailPage = new PassengerInfoPage(totalPassengers, processedPassengers);
            detailPage.setPassengerNumber(processedPassengers + 1);
            detailPage.show();
            this.dispose();
        }
        else if (processedPassengers == totalPassengers)
        {
            // If all passengers have been processed, show the TicketSummaryPage
            TicketSummaryPage summaryPage = new TicketSummaryPage(totalPassengers);
            summaryPage.show();
            this.dispose();
        }


    }//GEN-LAST:event_confirmButtonActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addressFieldActionPerformed
    {//GEN-HEADEREND:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void dobFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dobFieldActionPerformed
    {//GEN-HEADEREND:event_dobFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobFieldActionPerformed

    private void passportNumberFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_passportNumberFieldActionPerformed
    {//GEN-HEADEREND:event_passportNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passportNumberFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(PassengerInfoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(PassengerInfoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(PassengerInfoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(PassengerInfoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                //testing only
                Flight flight = new Flight("New York", "San Francisco", "2023-06-06", "13:00");
                SeatType classService = SeatType.ECONOMY;
                new PassengerInfoPage(flight, 1, classService).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField clientNumberField;
    private javax.swing.JButton confirmButton;
    private javax.swing.JFormattedTextField dobField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField passportNumberField;
    private javax.swing.JTextField phoneNumberField;
    // End of variables declaration//GEN-END:variables
}
