/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Assignment_Two;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author T470s
 */
public class TicketSummaryPage extends javax.swing.JFrame
{

    /**
     * Creates new form TicketSummaryPage
     */
    private int totalPassengers;

    // TicketSummaryPage Constructor
    public TicketSummaryPage(int totalPassengers)
    {
        this.totalPassengers = totalPassengers;
        initComponents();
        this.setLocationRelativeTo(null);
        displayPassengersInfo();
    }

    // Retrieving passenger information from database and display
    private void displayPassengersInfo()
    {
        DBOperations dbOps = new DBOperations();
        ResultSet rs = dbOps.getLastPassengerInfo(totalPassengers);
        StringBuilder sb = new StringBuilder();
        double totalPrice = 0.0;
        try
        {
            while (rs.next())
            {
                // Fetch the passenger data from the ResultSet
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String passportNumber = rs.getString("passportNumber");
                String dobStr = rs.getString("dob");
                String address = rs.getString("address");
                String phoneNumber = rs.getString("phoneNumber");
                String email = rs.getString("email");
                String clientNumber = rs.getString("clientNumber");
                LocalDate dob = LocalDate.parse(dobStr);
                int age = Period.between(dob, LocalDate.now()).getYears();

                // Determine the type of the passenger and create the corresponding object
                PassengerInfo passenger;
                if (age < 2)
                {
                    passenger = new InfantPassengerInfo(firstName, lastName, passportNumber, dobStr, address, phoneNumber, email, clientNumber);
                }
                else if (age <= 12)
                {
                    passenger = new ChildPassengerInfo(firstName, lastName, passportNumber, dobStr, address, phoneNumber, email, clientNumber);
                }
                else
                {
                    passenger = new AdultPassengerInfo(firstName, lastName, passportNumber, dobStr, address, phoneNumber, email, clientNumber);
                }

                // Append the passenger and discount information to sb
                String passengerInfo = String.format("First Name: %s\nLast Name: %s\nPassport Number: %s\nDOB: %s\nAddress: %s\nPhone Number: %s\nEmail: %s\nClient Number: %s\nDiscount Info: %s",
                        firstName, lastName, passportNumber, dobStr, address, phoneNumber, email, clientNumber, passenger.checkDiscount());
                sb.append(passengerInfo);
                sb.append("\n--------------------------------\n");

                // Fetch the values from the BookedTicket table
                String ticketID = rs.getString("TicketID");
                String flightDate = rs.getString("flightDate");
                String departureCity = rs.getString("DepartCity");
                String arrivalCity = rs.getString("ArrivalCity");
                String flightTime = rs.getString("flightTime");
                String serviceClass = rs.getString("FLIGHTCLASS");
                String price = rs.getString("Price");
                totalPrice += Double.parseDouble(price);

                // Append the ticket information to sb
                String ticketInfo = String.format("Ticket ID: %s\nFlight Date: %s\nDeparture City: %s\nArrival City: %s\nFlight Time: %s\nService Class: %s\nPrice: %s",
                        ticketID, flightDate, departureCity, arrivalCity, flightTime, serviceClass, price);
                sb.append(ticketInfo);
                sb.append("\n***********************************************************\n");
            }
            sb.append("***********************************************************\n");
            sb.append("                       Payment details:                    \n");
            sb.append("***********************************************************\n");
            sb.append(String.format("Total price: $%.2f\n", totalPrice));

            sb.append("***********************************************************\n");
            sb.append("              Bank account details for payment:            \n");
            sb.append("***********************************************************\n");
            sb.append("Bank: Aotearoa Bank\n");
            sb.append("Account number: 12345678\n");
            sb.append("Account name: Aotearoa Airline\n");
            sb.append("Please use your passport number as reference\n");

            jTextArea1.setText(sb.toString());
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ticketInformationLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(575, 40));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Welsome to Airline Booking System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(575, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        ticketInformationLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ticketInformationLabel.setText("Ticket Information");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                confirmButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ticketInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 36, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ticketInformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_confirmButtonActionPerformed
    {//GEN-HEADEREND:event_confirmButtonActionPerformed

        {

            EndPage endPage = new EndPage();

            endPage.setLocationRelativeTo(null);

            endPage.setVisible(true);

            this.dispose();
        }

    }//GEN-LAST:event_confirmButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        LoginPage loginPage = new LoginPage();
        loginPage.setLocationRelativeTo(null);
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    // For testing only
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
            java.util.logging.Logger.getLogger(TicketSummaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TicketSummaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TicketSummaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TicketSummaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TicketSummaryPage(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel ticketInformationLabel;
    // End of variables declaration//GEN-END:variables
}
