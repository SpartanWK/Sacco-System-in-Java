package sacco;

import com.mysql.jdbc.MysqlDataTruncation;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class MainView extends javax.swing.JFrame {

    Connection con;
    PreparedStatement statement;
    Statement st;
    String cs;
    String user;
    String password;
    String query;
    String records;
    ResultSet rs;
    boolean nxt;
    
    public MainView() {
        con = null;
        st = null;
        statement = null;
        cs = "jdbc:mysql://localhost:3306/sacco_db";
        user = "root";
        password = "";
        nxt = false;
        
        initComponents();
    }
    
    public void fetch() throws ClassNotFoundException{
    try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection(cs,user,password);
            st= con.createStatement();
            query = "SELECT regId, firstName, lastName, dateBirth, accNo, mobile FROM regClients";
             
            ResultSet rs = st.executeQuery(query);
            clientTable.setModel(DbUtils.resultSetToTableModel(rs));        
            } catch (SQLException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void fetchStaff() throws ClassNotFoundException{
    try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "SELECT staffNo, firstName, lastName, email, staff_Id, mobile FROM regStaff";
             
            ResultSet rs = st.executeQuery(query);
            staffTable.setModel(DbUtils.resultSetToTableModel(rs));          
            } 
    catch(ExceptionInInitializerError eie){
        eie.printStackTrace();
    }
    catch (SQLException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
     public void fetchStatements() throws ClassNotFoundException{
    try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection(cs,user,password);
            st= con.createStatement();
            query = "SELECT * FROM deposits";
             
            ResultSet rs = st.executeQuery(query);
            miniStatementTable.setModel(DbUtils.resultSetToTableModel(rs));
   
            } catch (SQLException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPanel = new javax.swing.JPanel();
        miniStatementsPanel = new javax.swing.JPanel();
        searchStatementBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        miniStatementTable = new javax.swing.JTable();
        closeStatementBtn = new javax.swing.JButton();
        statementPDFBtn = new javax.swing.JButton();
        delStatementBtn = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        cashTransferPanel = new javax.swing.JPanel();
        withdrawAccNoLabel1 = new javax.swing.JLabel();
        transferAccNo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        transferAmount = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        transferCombo = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        transferFName = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        transferLName = new javax.swing.JTextField();
        transferAccPIN = new javax.swing.JPasswordField();
        jLabel44 = new javax.swing.JLabel();
        cashAccNo1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        cancelTransferBtn = new javax.swing.JButton();
        makeTransferBtn = new javax.swing.JButton();
        cashWithdrawPanel = new javax.swing.JPanel();
        cashwithdrawCombo = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        cashwithdrawAccPIN = new javax.swing.JPasswordField();
        withdrawAccNoLabel = new javax.swing.JLabel();
        cashwithdrawAccNo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cashwithdrawAccType = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cashwithdrawAmount = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cashWithdrawBtn = new javax.swing.JButton();
        withdrawCancelBtn = new javax.swing.JButton();
        cashDepoPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cashRegId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cashAmount = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cashCombo = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        cashAccPIN = new javax.swing.JPasswordField();
        cashCancelBtn = new javax.swing.JButton();
        cashDepoBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cashDate = new javax.swing.JTextField();
        staffListPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        closeStaffBtn = new javax.swing.JButton();
        staffPDFBtn = new javax.swing.JButton();
        viewStaffList = new javax.swing.JButton();
        regStaffPanel = new javax.swing.JPanel();
        staffTittle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        staffID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        staffFName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        staffLName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        staffEmail = new javax.swing.JTextField();
        registerStaff = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        staffMobile = new javax.swing.JTextField();
        staffcancelBtn = new javax.swing.JButton();
        findStaff = new javax.swing.JButton();
        deleteStaff = new javax.swing.JButton();
        editStaff = new javax.swing.JButton();
        viewClientPanel = new javax.swing.JPanel();
        searchClientBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        closeClientPanel = new javax.swing.JButton();
        clientPDFBtn = new javax.swing.JButton();
        regClientPanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        clientFName = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        clientPhone = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        clientCounty = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        clientAccNo = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        clientDOB = new javax.swing.JFormattedTextField();
        jLabel35 = new javax.swing.JLabel();
        clientVilla = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        clientDistrict = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        clientLName = new javax.swing.JTextField();
        clientEmail = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        clientAccPIN = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        clientInitialDepo = new javax.swing.JTextField();
        clientRegister = new javax.swing.JButton();
        clientCancel = new javax.swing.JButton();
        editClient = new javax.swing.JButton();
        findClient = new javax.swing.JButton();
        deleteClient = new javax.swing.JButton();
        mainMenuBar = new javax.swing.JMenuBar();
        staffMenu = new javax.swing.JMenu();
        regStaff = new javax.swing.JMenu();
        staffList = new javax.swing.JMenu();
        clientMenu = new javax.swing.JMenu();
        regClient = new javax.swing.JMenu();
        viewClient = new javax.swing.JMenu();
        transacMenu = new javax.swing.JMenu();
        cashDepo = new javax.swing.JMenu();
        cashWithdraw = new javax.swing.JMenu();
        cashTransfers = new javax.swing.JMenu();
        miniStatements = new javax.swing.JMenu();
        loansMenu = new javax.swing.JMenu();
        loanApplication = new javax.swing.JMenu();
        curLoan = new javax.swing.JMenu();
        pastLoan = new javax.swing.JMenu();
        loanDefaulter = new javax.swing.JMenu();
        sharesMenu = new javax.swing.JMenu();
        shareApplication = new javax.swing.JMenu();
        shareHolders = new javax.swing.JMenu();
        shareInfo = new javax.swing.JMenu();
        assetsMenu = new javax.swing.JMenu();
        acqAssets = new javax.swing.JMenu();
        permAssets = new javax.swing.JMenu();
        soldAssets = new javax.swing.JMenu();
        reportsMenu = new javax.swing.JMenu();
        monReport = new javax.swing.JMenu();
        quartReport = new javax.swing.JMenu();
        midyearReport = new javax.swing.JMenu();
        annReport = new javax.swing.JMenu();
        genReport = new javax.swing.JMenu();
        settingsMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Kasacco System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        parentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchStatementBtn.setText("Show Mini Statements");
        searchStatementBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStatementBtnActionPerformed(evt);
            }
        });

        miniStatementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Statement ID", "Transaction Type", "Account No", "Amount", "Balance", "Date"
            }
        ));
        jScrollPane3.setViewportView(miniStatementTable);

        closeStatementBtn.setText("Close");

        statementPDFBtn.setText("Generate PDF");
        statementPDFBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statementPDFBtnActionPerformed(evt);
            }
        });

        delStatementBtn.setText("Delete Record");

        jLabel46.setText("Mini Statement");

        javax.swing.GroupLayout miniStatementsPanelLayout = new javax.swing.GroupLayout(miniStatementsPanel);
        miniStatementsPanel.setLayout(miniStatementsPanelLayout);
        miniStatementsPanelLayout.setHorizontalGroup(
            miniStatementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miniStatementsPanelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(miniStatementsPanelLayout.createSequentialGroup()
                .addGroup(miniStatementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(miniStatementsPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel46)
                        .addGap(311, 311, 311)
                        .addComponent(searchStatementBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(miniStatementsPanelLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(closeStatementBtn)
                        .addGap(99, 99, 99)
                        .addComponent(delStatementBtn)
                        .addGap(88, 88, 88)
                        .addComponent(statementPDFBtn)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        miniStatementsPanelLayout.setVerticalGroup(
            miniStatementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miniStatementsPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(miniStatementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchStatementBtn)
                    .addComponent(jLabel46))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(miniStatementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statementPDFBtn)
                    .addComponent(delStatementBtn)
                    .addComponent(closeStatementBtn))
                .addGap(53, 53, 53))
        );

        parentPanel.add(miniStatementsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 570));

        withdrawAccNoLabel1.setText("Account No:");

        jLabel25.setText("Amount:");

        jLabel26.setText("Currency:");

        transferCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Uganda Shillings", "Kenya Shillings", "Tanzanian Shillings", "Rwanda Franc", "US Dollars", "British Pound", "Euro" }));

        jLabel40.setText("Make Cash Transfer");

        jLabel41.setText("FROM:");

        jLabel42.setText("TO:");

        jLabel24.setText("Last Name:");

        jLabel43.setText("Enter your Account PIN:");

        jLabel44.setText("Account No:");

        jLabel48.setText("First Name:");

        jLabel45.setText("Confirm Transfer:");

        cancelTransferBtn.setText("Cancel Transfer");
        cancelTransferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTransferBtnActionPerformed(evt);
            }
        });

        makeTransferBtn.setText("Make Transfer");
        makeTransferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeTransferBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cashTransferPanelLayout = new javax.swing.GroupLayout(cashTransferPanel);
        cashTransferPanel.setLayout(cashTransferPanelLayout);
        cashTransferPanelLayout.setHorizontalGroup(
            cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashTransferPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelTransferBtn)
                .addGap(135, 135, 135)
                .addComponent(makeTransferBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
            .addGroup(cashTransferPanelLayout.createSequentialGroup()
                .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashTransferPanelLayout.createSequentialGroup()
                        .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cashTransferPanelLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(cashTransferPanelLayout.createSequentialGroup()
                                        .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel42)
                                            .addGroup(cashTransferPanelLayout.createSequentialGroup()
                                                .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel48)
                                                    .addComponent(withdrawAccNoLabel1)
                                                    .addComponent(jLabel44))
                                                .addGap(26, 26, 26)
                                                .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cashAccNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(transferFName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(transferAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel45))
                                        .addGap(54, 54, 54)
                                        .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel26)
                                                .addComponent(jLabel24))
                                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(cashTransferPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel43)
                                        .addGap(59, 59, 59)
                                        .addComponent(transferAccPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(cashTransferPanelLayout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jLabel40)))
                        .addGap(50, 50, 50)
                        .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(transferAmount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(transferLName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transferCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(cashTransferPanelLayout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel41)))
                .addGap(0, 160, Short.MAX_VALUE))
        );
        cashTransferPanelLayout.setVerticalGroup(
            cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashTransferPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel40)
                .addGap(27, 27, 27)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashTransferPanelLayout.createSequentialGroup()
                        .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(withdrawAccNoLabel1)
                            .addComponent(transferAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel42)
                        .addGap(35, 35, 35)
                        .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(transferFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(transferLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(transferAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)))
                .addGap(18, 18, 18)
                .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cashAccNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(transferCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26)))
                .addGap(35, 35, 35)
                .addComponent(jLabel45)
                .addGap(32, 32, 32)
                .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferAccPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(cashTransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelTransferBtn)
                    .addComponent(makeTransferBtn))
                .addGap(76, 76, 76))
        );

        parentPanel.add(cashTransferPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 570));

        cashwithdrawCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Uganda Shillings", "Kenya Shillings", "Tanzanian Shillings", "Rwanda Franc", "US Dollars", "British Pound", "Euro" }));

        jLabel18.setText("Account PIN:");

        withdrawAccNoLabel.setText("Account No:");

        jLabel20.setText("Account Type:");

        jLabel21.setText("Amount:");

        jLabel22.setText("Currency:");

        jLabel23.setText("Make Cash Withdraw");

        cashWithdrawBtn.setText("Make Withdraw");

        withdrawCancelBtn.setText("Cancel Withdraw");

        javax.swing.GroupLayout cashWithdrawPanelLayout = new javax.swing.GroupLayout(cashWithdrawPanel);
        cashWithdrawPanel.setLayout(cashWithdrawPanelLayout);
        cashWithdrawPanelLayout.setHorizontalGroup(
            cashWithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashWithdrawPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cashWithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashWithdrawPanelLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(341, 341, 341))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashWithdrawPanelLayout.createSequentialGroup()
                        .addComponent(withdrawCancelBtn)
                        .addGap(119, 119, 119)
                        .addComponent(cashWithdrawBtn)
                        .addGap(225, 225, 225))))
            .addGroup(cashWithdrawPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(cashWithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(withdrawAccNoLabel)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(cashWithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashWithdrawPanelLayout.createSequentialGroup()
                        .addGroup(cashWithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cashwithdrawAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cashwithdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(cashWithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cashWithdrawPanelLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cashwithdrawAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashWithdrawPanelLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(cashwithdrawCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cashwithdrawAccPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 164, Short.MAX_VALUE))
        );
        cashWithdrawPanelLayout.setVerticalGroup(
            cashWithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashWithdrawPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel23)
                .addGap(70, 70, 70)
                .addGroup(cashWithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawAccNoLabel)
                    .addComponent(cashwithdrawAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(cashwithdrawAccType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(cashWithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cashwithdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(cashwithdrawCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(cashWithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cashwithdrawAccPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(cashWithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashWithdrawBtn)
                    .addComponent(withdrawCancelBtn))
                .addGap(118, 118, 118))
        );

        parentPanel.add(cashWithdrawPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 550));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Make Cash Deposit");

        jLabel12.setText("Reg ID:");

        jLabel15.setText("Amount:");

        jLabel16.setText("Currency:");

        cashCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Uganda Shillings", "Kenya Shillings", "Tanzanian Shillings", "Rwanda Franc", "US Dollars", "British Pound", "Euro" }));

        jLabel17.setText("Account PIN:");

        cashCancelBtn.setText("Cancel");

        cashDepoBtn.setText("Deposit");
        cashDepoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashDepoBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Date:");

        javax.swing.GroupLayout cashDepoPanelLayout = new javax.swing.GroupLayout(cashDepoPanel);
        cashDepoPanel.setLayout(cashDepoPanelLayout);
        cashDepoPanelLayout.setHorizontalGroup(
            cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashDepoPanelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(cashCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(cashDepoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(cashDepoPanelLayout.createSequentialGroup()
                .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashDepoPanelLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cashDepoPanelLayout.createSequentialGroup()
                                .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cashDepoPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(49, 49, 49))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashDepoPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(34, 34, 34)))
                                .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cashAccPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cashCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(cashDepoPanelLayout.createSequentialGroup()
                                .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel15)))
                                .addGap(56, 56, 56)
                                .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cashAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(cashRegId, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(cashDate)))))
                    .addGroup(cashDepoPanelLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cashDepoPanelLayout.setVerticalGroup(
            cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashDepoPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(40, 40, 40)
                .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cashRegId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cashAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cashDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cashCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashDepoPanelLayout.createSequentialGroup()
                        .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(cashAccPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 179, Short.MAX_VALUE))
                    .addGroup(cashDepoPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cashDepoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cashCancelBtn)
                            .addComponent(cashDepoBtn))
                        .addGap(120, 120, 120))))
        );

        parentPanel.add(cashDepoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 540));

        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Staff ID", "First Name", "Last Name", "Email", "Staff Role", "Department"
            }
        ));
        jScrollPane1.setViewportView(staffTable);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("List of Staff Members at Kasacco");

        closeStaffBtn.setText("Close");

        staffPDFBtn.setText("Generate PDF");
        staffPDFBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffPDFBtnActionPerformed(evt);
            }
        });

        viewStaffList.setText("View List of Staff");
        viewStaffList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStaffListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout staffListPanelLayout = new javax.swing.GroupLayout(staffListPanel);
        staffListPanel.setLayout(staffListPanelLayout);
        staffListPanelLayout.setHorizontalGroup(
            staffListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffListPanelLayout.createSequentialGroup()
                .addGroup(staffListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(staffListPanelLayout.createSequentialGroup()
                        .addGroup(staffListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(staffListPanelLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel7)
                                .addGap(314, 314, 314)
                                .addComponent(viewStaffList))
                            .addGroup(staffListPanelLayout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(closeStaffBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(staffPDFBtn)
                                .addGap(133, 133, 133)))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffListPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        staffListPanelLayout.setVerticalGroup(
            staffListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffListPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(staffListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewStaffList)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(staffListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeStaffBtn)
                    .addComponent(staffPDFBtn))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        parentPanel.add(staffListPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 550));

        staffTittle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        staffTittle.setText("Register Staff Members");

        jLabel2.setText("Staff ID:");

        jLabel3.setText("First Name: ");

        jLabel4.setText("Last Name:");

        jLabel5.setText("Email:");

        registerStaff.setText("Register Staff");
        registerStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerStaffActionPerformed(evt);
            }
        });

        jLabel8.setText("Mobile:");

        staffMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffMobileActionPerformed(evt);
            }
        });

        staffcancelBtn.setText("Cancel");

        findStaff.setText("Find Staff");
        findStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findStaffActionPerformed(evt);
            }
        });

        deleteStaff.setText("Delete Staff");
        deleteStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStaffActionPerformed(evt);
            }
        });

        editStaff.setText("Edit & Update");

        javax.swing.GroupLayout regStaffPanelLayout = new javax.swing.GroupLayout(regStaffPanel);
        regStaffPanel.setLayout(regStaffPanelLayout);
        regStaffPanelLayout.setHorizontalGroup(
            regStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regStaffPanelLayout.createSequentialGroup()
                .addGroup(regStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regStaffPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(staffcancelBtn)
                        .addGap(50, 50, 50)
                        .addComponent(findStaff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(deleteStaff))
                    .addGroup(regStaffPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(regStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(58, 58, 58)
                        .addGroup(regStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(staffFName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffLName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffID, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(editStaff)
                .addGap(18, 18, 18)
                .addComponent(registerStaff)
                .addGap(37, 37, 37))
            .addGroup(regStaffPanelLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(staffTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        regStaffPanelLayout.setVerticalGroup(
            regStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regStaffPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(staffTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(regStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(staffFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(regStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(regStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(regStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(regStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(staffMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(regStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerStaff)
                    .addComponent(editStaff)
                    .addComponent(findStaff)
                    .addComponent(staffcancelBtn)
                    .addComponent(deleteStaff))
                .addGap(92, 92, 92))
        );

        parentPanel.add(regStaffPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, 520));

        searchClientBtn.setText("View List of Clients");
        searchClientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchClientBtnActionPerformed(evt);
            }
        });

        clientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Client ID", "First Name", "Last Name", "Phone", "Account No", "Balance"
            }
        ));
        jScrollPane2.setViewportView(clientTable);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("List of Clients at Kasacco");

        closeClientPanel.setText("Close");

        clientPDFBtn.setText("Generate PDF");
        clientPDFBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientPDFBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewClientPanelLayout = new javax.swing.GroupLayout(viewClientPanel);
        viewClientPanel.setLayout(viewClientPanelLayout);
        viewClientPanelLayout.setHorizontalGroup(
            viewClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewClientPanelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchClientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewClientPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewClientPanelLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(closeClientPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clientPDFBtn)
                .addGap(117, 117, 117))
        );
        viewClientPanelLayout.setVerticalGroup(
            viewClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewClientPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(viewClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(searchClientBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(viewClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientPDFBtn)
                    .addComponent(closeClientPanel))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        parentPanel.add(viewClientPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 690, 530));

        regClientPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Register New Client");
        regClientPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel28.setText("First Name:");
        regClientPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 63, -1, -1));
        regClientPanel.add(clientFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 60, 140, -1));

        jLabel29.setText("Email:");
        regClientPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 225, -1, -1));

        clientPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientPhoneActionPerformed(evt);
            }
        });
        regClientPanel.add(clientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 222, 140, -1));

        jLabel30.setText("Mobile:");
        regClientPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));
        regClientPanel.add(clientCounty, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 166, 140, -1));

        jLabel31.setText("Account No:");
        regClientPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 277, -1, -1));
        regClientPanel.add(clientAccNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 148, -1));

        jLabel34.setText("Date of Birth:");
        regClientPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 114, -1, -1));
        regClientPanel.add(clientDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 111, 140, -1));

        jLabel35.setText("Village:");
        regClientPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));
        regClientPanel.add(clientVilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 111, 140, -1));

        jLabel36.setText("Sub-County:");
        regClientPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 169, -1, -1));

        jLabel37.setText("District/City:");
        regClientPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        clientDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientDistrictActionPerformed(evt);
            }
        });
        regClientPanel.add(clientDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 166, 140, -1));

        jLabel38.setText("Last Name:");
        regClientPanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));
        regClientPanel.add(clientLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 60, 140, -1));
        regClientPanel.add(clientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 222, 140, -1));

        jLabel33.setText("Account PIN:");
        regClientPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));
        regClientPanel.add(clientAccPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 148, -1));

        jLabel39.setText("Initial Deposit:");
        regClientPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        clientInitialDepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientInitialDepoActionPerformed(evt);
            }
        });
        regClientPanel.add(clientInitialDepo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 140, -1));

        clientRegister.setText("Register");
        clientRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientRegisterActionPerformed(evt);
            }
        });
        regClientPanel.add(clientRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 121, -1));

        clientCancel.setText("Cancel");
        clientCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientCancelActionPerformed(evt);
            }
        });
        regClientPanel.add(clientCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 101, -1));

        editClient.setText("Edit & Update");
        editClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editClientActionPerformed(evt);
            }
        });
        regClientPanel.add(editClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        findClient.setText("Find Client");
        findClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findClientActionPerformed(evt);
            }
        });
        regClientPanel.add(findClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        deleteClient.setText("Delete Client");
        deleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClientActionPerformed(evt);
            }
        });
        regClientPanel.add(deleteClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, -1));

        parentPanel.add(regClientPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 780, -1));

        getContentPane().add(parentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 590));

        mainMenuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainMenuBar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mainMenuBar.setPreferredSize(new java.awt.Dimension(337, 30));

        staffMenu.setText("Staff");

        regStaff.setText("Register Staff");
        regStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regStaffMouseClicked(evt);
            }
        });
        staffMenu.add(regStaff);

        staffList.setText("Staff List");
        staffList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffListMouseClicked(evt);
            }
        });
        staffMenu.add(staffList);

        mainMenuBar.add(staffMenu);

        clientMenu.setText("Client");

        regClient.setText("Register Client");
        regClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regClientMouseClicked(evt);
            }
        });
        clientMenu.add(regClient);

        viewClient.setText("View Client");
        viewClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewClientMouseClicked(evt);
            }
        });
        clientMenu.add(viewClient);

        mainMenuBar.add(clientMenu);

        transacMenu.setText("Transactions");

        cashDepo.setText("Cash Deposit");
        cashDepo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashDepoMouseClicked(evt);
            }
        });
        transacMenu.add(cashDepo);

        cashWithdraw.setText("Cash Withdraw");
        cashWithdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashWithdrawMouseClicked(evt);
            }
        });
        transacMenu.add(cashWithdraw);

        cashTransfers.setText("Cash Transfers");
        cashTransfers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashTransfersMouseClicked(evt);
            }
        });
        transacMenu.add(cashTransfers);

        miniStatements.setText("Mini Statements");
        miniStatements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniStatementsMouseClicked(evt);
            }
        });
        transacMenu.add(miniStatements);

        mainMenuBar.add(transacMenu);

        loansMenu.setText("Loans");

        loanApplication.setText("Loan Application");
        loansMenu.add(loanApplication);

        curLoan.setText("Current Loans");
        loansMenu.add(curLoan);

        pastLoan.setText("Past Loans");
        loansMenu.add(pastLoan);

        loanDefaulter.setText("Defaulters");
        loansMenu.add(loanDefaulter);

        mainMenuBar.add(loansMenu);

        sharesMenu.setText("Shares");

        shareApplication.setText("Share Application");
        sharesMenu.add(shareApplication);

        shareHolders.setText("Shareholders");
        sharesMenu.add(shareHolders);

        shareInfo.setText("Share Info");
        sharesMenu.add(shareInfo);

        mainMenuBar.add(sharesMenu);

        assetsMenu.setText("Assets");

        acqAssets.setText("Acquired Assets");
        assetsMenu.add(acqAssets);

        permAssets.setText("Permanent Assets");
        assetsMenu.add(permAssets);

        soldAssets.setText("Sold Assets");
        assetsMenu.add(soldAssets);

        mainMenuBar.add(assetsMenu);

        reportsMenu.setText("Reports");

        monReport.setText("Monthly Report");
        monReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monReportMouseClicked(evt);
            }
        });
        reportsMenu.add(monReport);

        quartReport.setText("Quarterly Report");
        reportsMenu.add(quartReport);

        midyearReport.setText("Mid-Year Report");
        reportsMenu.add(midyearReport);

        annReport.setText("Annual Report");
        reportsMenu.add(annReport);

        genReport.setText("General Report");
        reportsMenu.add(genReport);

        mainMenuBar.add(reportsMenu);

        settingsMenu.setText("Settings");
        mainMenuBar.add(settingsMenu);

        setJMenuBar(mainMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cashDepoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashDepoMouseClicked
        cashDepoPanel.setVisible(true);
        regStaffPanel.setVisible(false);
        viewClientPanel.setVisible(false);
        parentPanel.setVisible(true);
        cashWithdrawPanel.setVisible(false);
        miniStatementsPanel.setVisible(false);
        regClientPanel.setVisible(false);
        cashTransferPanel.setVisible(false);
        staffListPanel.setVisible(false);
    }//GEN-LAST:event_cashDepoMouseClicked

    private void clientDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientDistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientDistrictActionPerformed

    private void clientInitialDepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientInitialDepoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientInitialDepoActionPerformed

    private void clientPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientPhoneActionPerformed

    private void regStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regStaffMouseClicked
        // TODO add your handling code here:
        regStaffPanel.setVisible(true);
        viewClientPanel.setVisible(false);
        parentPanel.setVisible(true);
        regClientPanel.setVisible(false);
        cashDepoPanel.setVisible(false);
        miniStatementsPanel.setVisible(false);
        cashWithdrawPanel.setVisible(false);
        cashTransferPanel.setVisible(false);
        staffListPanel.setVisible(false);
    }//GEN-LAST:event_regStaffMouseClicked

    private void registerStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerStaffActionPerformed
        String staffName = staffFName.getText();
        String lName = staffLName.getText();
        String staffId = staffID.getText();
        String email = staffEmail.getText();
        String phone = staffMobile.getText();
        
        if(staffName.isEmpty() && lName.isEmpty() && staffId.isEmpty() && email.isEmpty() && phone.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill in all fields!");
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "INSERT INTO regStaff(firstName, lastName, email, staff_Id, mobile) VALUES ('"+staffName+"','"+lName+"','"+email+"','"+staffId+"','"+phone+"')";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Staff Registered Successfully!");
            
            staffFName.setText("");
            staffLName.setText("");
            staffID.setText("");
            staffEmail.setText("");
            staffMobile.setText("");
        
            staffFName.requestFocus();
        }
        catch(MysqlDataTruncation mdt){
            mdt.printStackTrace();
        }
        catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            
        
            try {
                if (st != null)
                {
                    st.close();
                }
                if(con != null)
                {
                    con.close();
                }}
                catch (SQLException ex)
                        {
                        ex.printStackTrace();
                
                }
            }
    }//GEN-LAST:event_registerStaffActionPerformed

    private void clientRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientRegisterActionPerformed
        String fName = clientFName.getText();
        String lName = clientLName.getText();
        String dob = clientDOB.getText();
        String villa = clientVilla.getText();
        String county = clientCounty.getText();
        String dis = clientDistrict.getText();
        String email = clientEmail.getText();
        String phone = clientPhone.getText();
        String accNo = clientAccNo.getText();
        String accPIN = clientAccPIN.getText();
        String inDepo = clientInitialDepo.getText();
        
        if(fName.isEmpty() && lName.isEmpty() && dob.isEmpty() && villa.isEmpty() && county.isEmpty() && dis.isEmpty() && email.isEmpty() && phone.isEmpty() && accNo.isEmpty() && accPIN.isEmpty() && inDepo.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill in all fields!");
        }

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "INSERT INTO regClients(firstName, lastName, dateBirth, village, subCounty, district, email, mobile, accNo, accPIN, inDepo) VALUES ('"+fName+"','"+lName+"','"+dob+"','"+villa+"','"+county+"','"+dis+"','"+email+"','"+phone+"','"+accNo+"','"+accPIN+"','"+inDepo+"')";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Client Registered Successfully!");
            
        clientFName.setText("");
        clientLName.setText("");
        clientDOB.setText("");
        clientVilla.setText("");
        clientCounty.setText("");
        clientDistrict.setText("");
        clientEmail.setText("");
        clientPhone.setText("");
        clientAccNo.setText("");
        clientAccPIN.setText("");
        clientInitialDepo.setText("");
            
        clientFName.requestFocus();
            
        }
        catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            
        
            try {
                if (st != null)
                {
                    st.close();
                }
                if(con != null)
                {
                    con.close();
                }}
                catch (SQLException ex)
                        {
                        ex.printStackTrace();
                
                }
            }
    }//GEN-LAST:event_clientRegisterActionPerformed

    private void staffListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffListMouseClicked
        // TODO add your handling code here:
        staffListPanel.setVisible(true);
        viewClientPanel.setVisible(false);
        regClientPanel.setVisible(false);
        cashDepoPanel.setVisible(false);
        regStaffPanel.setVisible(false);
        miniStatementsPanel.setVisible(false);
        cashWithdrawPanel.setVisible(false);
        cashTransferPanel.setVisible(false);
        parentPanel.setVisible(true);
    }//GEN-LAST:event_staffListMouseClicked

    private void staffMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffMobileActionPerformed

    private void viewClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewClientMouseClicked
        viewClientPanel.setVisible(true);
        regClientPanel.setVisible(false);
        regStaffPanel.setVisible(false);
        staffListPanel.setVisible(false);
        cashDepoPanel.setVisible(false);
        cashWithdrawPanel.setVisible(false);
        miniStatementsPanel.setVisible(false);
        cashTransferPanel.setVisible(false);
        parentPanel.setVisible(true);
    }//GEN-LAST:event_viewClientMouseClicked

    private void regClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regClientMouseClicked
        regClientPanel.setVisible(true);
        regStaffPanel.setVisible(false);
        viewClientPanel.setVisible(false);
        staffListPanel.setVisible(false);
        cashDepoPanel.setVisible(false);
        cashWithdrawPanel.setVisible(false);
        miniStatementsPanel.setVisible(false);
        cashTransferPanel.setVisible(false);
        parentPanel.setVisible(true);
    }//GEN-LAST:event_regClientMouseClicked

    private void cashWithdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashWithdrawMouseClicked
        // TODO add your handling code here:
        cashWithdrawPanel.setVisible(true);
        regClientPanel.setVisible(false);
        regStaffPanel.setVisible(false);
        viewClientPanel.setVisible(false);
        staffListPanel.setVisible(false);
        miniStatementsPanel.setVisible(false);
        cashDepoPanel.setVisible(false);
        cashTransferPanel.setVisible(false);
        parentPanel.setVisible(true);
    }//GEN-LAST:event_cashWithdrawMouseClicked

    private void cashTransfersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashTransfersMouseClicked
        // TODO add your handling code here:
        cashTransferPanel.setVisible(true);
        cashWithdrawPanel.setVisible(false);
        regClientPanel.setVisible(false);
        regStaffPanel.setVisible(false);
        viewClientPanel.setVisible(false);
        miniStatementsPanel.setVisible(false);
        staffListPanel.setVisible(false);
        cashDepoPanel.setVisible(false);
        parentPanel.setVisible(true);
    }//GEN-LAST:event_cashTransfersMouseClicked

    private void cancelTransferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelTransferBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelTransferBtnActionPerformed

    private void makeTransferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeTransferBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_makeTransferBtnActionPerformed

    private void miniStatementsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniStatementsMouseClicked
        // TODO add your handling code here:
        miniStatementsPanel.setVisible(true);
        cashTransferPanel.setVisible(false);
        cashWithdrawPanel.setVisible(false);
        regClientPanel.setVisible(false);
        regStaffPanel.setVisible(false);
        viewClientPanel.setVisible(false);
        staffListPanel.setVisible(false);
        cashDepoPanel.setVisible(false);
        parentPanel.setVisible(true);
    }//GEN-LAST:event_miniStatementsMouseClicked

    private void staffPDFBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffPDFBtnActionPerformed
        // TODO add your handling code here:
        try{
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "SELECT * from regStaff";
            rs= st.executeQuery(query); 
            
            Document miniPdfReport = new Document(PageSize.A4);
            PdfWriter.getInstance(miniPdfReport, new FileOutputStream("staffReport.pdf"));
            miniPdfReport.open();  
            
           Paragraph p = new Paragraph("All Staff at Kasacco",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD,BaseColor.BLUE));
           p.setAlignment(Element.ALIGN_CENTER);
           p.setSpacingAfter(20);
           
                PdfPTable clientPdfTable = new PdfPTable(6);
                //create a cell object
                PdfPCell table_cell = new PdfPCell(new Phrase("Staff No"));
                clientPdfTable.addCell(table_cell);
                 PdfPCell table_cell1 = new PdfPCell(new Phrase("First Name"));
                clientPdfTable.addCell(table_cell1);
                 PdfPCell table_cell2 = new PdfPCell(new Phrase("Last Name"));
                clientPdfTable.addCell(table_cell2);
                 PdfPCell table_cell3 = new PdfPCell(new Phrase("Email"));
                clientPdfTable.addCell(table_cell3);
                 PdfPCell table_cell4 = new PdfPCell(new Phrase("Staff ID"));
                clientPdfTable.addCell(table_cell4);
                 PdfPCell table_cell6 = new PdfPCell(new Phrase("Phone Number"));
                clientPdfTable.addCell(table_cell6);
                 
                clientPdfTable.getAbsoluteWidths();
               
                while (rs.next()) {                
                                String staffNum = rs.getString("StaffNo");
                                table_cell=new PdfPCell(new Phrase(staffNum));
                                clientPdfTable.addCell(table_cell);
                                String fname =rs.getString("firstName");
                                table_cell=new PdfPCell(new Phrase(fname));
                                clientPdfTable.addCell(table_cell);
                                String lname =rs.getString("lastName");
                                table_cell=new PdfPCell(new Phrase(lname));
                                clientPdfTable.addCell(table_cell);
                                String email =rs.getString("email");
                                table_cell=new PdfPCell(new Phrase(email));
                                clientPdfTable.addCell(table_cell);
                                String staffId =rs.getString("staff_Id");
                                table_cell=new PdfPCell(new Phrase(staffId));
                                clientPdfTable.addCell(table_cell);
                                String phone =rs.getString("mobile");
                                table_cell=new PdfPCell(new Phrase(phone));
                                clientPdfTable.addCell(table_cell);
                   }

                    miniPdfReport.add(p);
               // miniPdfReport.add(date);
                    miniPdfReport.add(clientPdfTable); 
                
               if(Desktop.isDesktopSupported()){
             try{
                 File pdffile =new File("staffReport.pdf");
                 Desktop.getDesktop().open(pdffile);
             }catch(IOException et){
                 et.printStackTrace();
             }
         }
               
               
               miniPdfReport.close();
                
                /* Close all DB related objects */
                rs.close();
                st.close(); 
                con.close();               
                
            
            
        }
         
         catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(DocumentException de)
        {
            de.printStackTrace();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_staffPDFBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        miniStatementsPanel.setVisible(false);
        cashTransferPanel.setVisible(false);
        cashWithdrawPanel.setVisible(false);
        regClientPanel.setVisible(true);
        regStaffPanel.setVisible(false);
        viewClientPanel.setVisible(false);
        staffListPanel.setVisible(false);
        cashDepoPanel.setVisible(false);
        parentPanel.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void clientCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientCancelActionPerformed
        // TODO add your handling code here:
        parentPanel.setVisible(true);
    }//GEN-LAST:event_clientCancelActionPerformed

    private void clientPDFBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientPDFBtnActionPerformed
                try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "SELECT regId, firstName, lastName, dateBirth, village, district, email, mobile, accNo, inDepo FROM regClients";
            rs= st.executeQuery(query); 
            
            Document clientPdfReport = new Document(PageSize.A3);
            PdfWriter.getInstance(clientPdfReport, new FileOutputStream("clientReport.pdf"));
            clientPdfReport.open();  

           Paragraph p = new Paragraph("All Clients at Kasacco",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD,BaseColor.BLUE));
           p.setAlignment(Element.ALIGN_CENTER);
           p.setSpacingAfter(20);

                PdfPTable clientPdfTable = new PdfPTable(11);
                //create a cell object
                PdfPCell table_cell = new PdfPCell(new Phrase("Client ID"));
                clientPdfTable.addCell(table_cell);
                 PdfPCell table_cell1 = new PdfPCell(new Phrase("First Name"));
                clientPdfTable.addCell(table_cell1);
                 PdfPCell table_cell2 = new PdfPCell(new Phrase("Last Name"));
                clientPdfTable.addCell(table_cell2);
                 PdfPCell table_cell3 = new PdfPCell(new Phrase("Date of Birth"));
                clientPdfTable.addCell(table_cell3);
                 PdfPCell table_cell4 = new PdfPCell(new Phrase("Village"));
                clientPdfTable.addCell(table_cell4);
                 PdfPCell table_cell5 = new PdfPCell(new Phrase("District"));
                clientPdfTable.addCell(table_cell5);
                 PdfPCell table_cell6 = new PdfPCell(new Phrase("Email"));
                clientPdfTable.addCell(table_cell6);
                PdfPCell table_cell7 = new PdfPCell(new Phrase("Phone"));
                clientPdfTable.addCell(table_cell7);
                PdfPCell table_cell8 = new PdfPCell(new Phrase("Account Number"));
                clientPdfTable.addCell(table_cell8);
                PdfPCell table_cell10 = new PdfPCell(new Phrase("Initial Deposit"));
                clientPdfTable.addCell(table_cell10);
                 
                clientPdfTable.getAbsoluteWidths();
               
                while (rs.next()) {                
                                String clientId = rs.getString("regId");
                                table_cell=new PdfPCell(new Phrase(clientId));
                                clientPdfTable.addCell(table_cell);
                                String fname =rs.getString("firstName");
                                table_cell=new PdfPCell(new Phrase(fname));
                                clientPdfTable.addCell(table_cell);
                                String lname =rs.getString("lastName");
                                table_cell=new PdfPCell(new Phrase(lname));
                                clientPdfTable.addCell(table_cell);
                                String dob =rs.getString("dateBirth");
                                table_cell=new PdfPCell(new Phrase(dob));
                                clientPdfTable.addCell(table_cell);
                                String villa =rs.getString("village");
                                table_cell=new PdfPCell(new Phrase(villa));
                                clientPdfTable.addCell(table_cell);
                                String dis =rs.getString("district");
                                table_cell=new PdfPCell(new Phrase(dis));
                                clientPdfTable.addCell(table_cell);
                                String email =rs.getString("email");
                                table_cell=new PdfPCell(new Phrase(email));
                                clientPdfTable.addCell(table_cell);
                                String phone =rs.getString("mobile");
                                table_cell=new PdfPCell(new Phrase(phone));
                                clientPdfTable.addCell(table_cell);
                                String num =rs.getString("accNo");
                                table_cell=new PdfPCell(new Phrase(num));
                                clientPdfTable.addCell(table_cell);
                                String depo =rs.getString("inDepo");
                                table_cell=new PdfPCell(new Phrase(depo));
                                clientPdfTable.addCell(table_cell);
                   }

                    clientPdfReport.add(p);
               // miniPdfReport.add(date);
                    clientPdfReport.add(clientPdfTable); 
               //txtresult.
                
               if(Desktop.isDesktopSupported()){
             try{
                 File pdffile =new File("clientReport.pdf");
                 Desktop.getDesktop().open(pdffile);
             }catch(IOException et){
                 et.printStackTrace();
             }
         }
               
               
               clientPdfReport.close();
                
                /* Close all DB related objects */
                rs.close();
                st.close(); 
                con.close();               
                
            
            
        }
         
         catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(DocumentException de)
        {
            de.printStackTrace();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_clientPDFBtnActionPerformed

    private void monReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monReportMouseClicked
        // TODO add your handling code here:
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "SELECT regId, firstName, lastName, dateBirth, village, district, email, mobile, accNo, inDepo FROM regClients";
            rs= st.executeQuery(query); 
            
            Document clientPdfReport = new Document(PageSize.A3);
            PdfWriter.getInstance(clientPdfReport, new FileOutputStream("clientReport.pdf"));
            clientPdfReport.open();  
            
           //Image image = Image.getInstance(loadImage("E:\downloads\juice.JPg"), null);
           Paragraph p = new Paragraph("Monthly Report of Clients at Kasacco",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD,BaseColor.BLUE));
           p.setAlignment(Element.ALIGN_CENTER);
           p.setSpacingAfter(20);
           
           //Paragraph date = new Paragraph(Date().toString());
           //date.setAlignment(Element.ALIGN_LEFT);
         //   miniPdfReport.add(new Paragraph(new Date().toString));
            
               
                //we have five columns in our table
                PdfPTable clientPdfTable = new PdfPTable(11);
                //create a cell object
                PdfPCell table_cell = new PdfPCell(new Phrase("Client ID"));
                clientPdfTable.addCell(table_cell);
                 PdfPCell table_cell1 = new PdfPCell(new Phrase("First Name"));
                clientPdfTable.addCell(table_cell1);
                 PdfPCell table_cell2 = new PdfPCell(new Phrase("Last Name"));
                clientPdfTable.addCell(table_cell2);
                 PdfPCell table_cell3 = new PdfPCell(new Phrase("Date of Birth"));
                clientPdfTable.addCell(table_cell3);
                 PdfPCell table_cell4 = new PdfPCell(new Phrase("Village"));
                clientPdfTable.addCell(table_cell4);
                 PdfPCell table_cell5 = new PdfPCell(new Phrase("District"));
                clientPdfTable.addCell(table_cell5);
                 PdfPCell table_cell6 = new PdfPCell(new Phrase("Email"));
                clientPdfTable.addCell(table_cell6);
                PdfPCell table_cell7 = new PdfPCell(new Phrase("Phone"));
                clientPdfTable.addCell(table_cell7);
                PdfPCell table_cell8 = new PdfPCell(new Phrase("Account Number"));
                clientPdfTable.addCell(table_cell8);
                PdfPCell table_cell10 = new PdfPCell(new Phrase("Initial Deposit"));
                clientPdfTable.addCell(table_cell10);
                 
                clientPdfTable.getAbsoluteWidths();
               
                while (rs.next()) {                
                                String clientId = rs.getString("regId");
                                table_cell=new PdfPCell(new Phrase(clientId));
                                clientPdfTable.addCell(table_cell);
                                String fname =rs.getString("firstName");
                                table_cell=new PdfPCell(new Phrase(fname));
                                clientPdfTable.addCell(table_cell);
                                String lname =rs.getString("lastName");
                                table_cell=new PdfPCell(new Phrase(lname));
                                clientPdfTable.addCell(table_cell);
                                String dob =rs.getString("dateBirth");
                                table_cell=new PdfPCell(new Phrase(dob));
                                clientPdfTable.addCell(table_cell);
                                String villa =rs.getString("village");
                                table_cell=new PdfPCell(new Phrase(villa));
                                clientPdfTable.addCell(table_cell);
                                String dis =rs.getString("district");
                                table_cell=new PdfPCell(new Phrase(dis));
                                clientPdfTable.addCell(table_cell);
                                String email =rs.getString("email");
                                table_cell=new PdfPCell(new Phrase(email));
                                clientPdfTable.addCell(table_cell);
                                String phone =rs.getString("mobile");
                                table_cell=new PdfPCell(new Phrase(phone));
                                clientPdfTable.addCell(table_cell);
                                String num =rs.getString("accNo");
                                table_cell=new PdfPCell(new Phrase(num));
                                clientPdfTable.addCell(table_cell);
                                String depo =rs.getString("inDepo");
                                table_cell=new PdfPCell(new Phrase(depo));
                                clientPdfTable.addCell(table_cell);
                   }
                /* Attach report table to PDF */
               // miniPdfReport.addCreationDate();
                    clientPdfReport.add(p);
               // miniPdfReport.add(date);
                    clientPdfReport.add(clientPdfTable); 
               //txtresult.
                
               if(Desktop.isDesktopSupported()){
             try{
                 File pdffile =new File("clientReport.pdf");
                 Desktop.getDesktop().open(pdffile);
             }catch(IOException et){
                 et.printStackTrace();
             }
         }
               
               
               clientPdfReport.close();
                
                /* Close all DB related objects */
                rs.close();
                st.close(); 
                con.close();               
        }
         
         catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(DocumentException de)
        {
            de.printStackTrace();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_monReportMouseClicked

    private void searchClientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchClientBtnActionPerformed
        try {
            // TODO add your handling code here:
            fetch();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchClientBtnActionPerformed

    private void viewStaffListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStaffListActionPerformed
        try {
            // TODO add your handling code here:
            fetchStaff();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewStaffListActionPerformed

    private void findClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findClientActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "SELECT * FROM regClients WHERE firstName ='"+clientFName.getText()+"'";
            
            ResultSet rs = st.executeQuery(query);
            if(rs.first())
            {
                clientFName.setText(rs.getString("firstName"));
                clientLName.setText(rs.getString("lastName"));
                clientDOB.setText(rs.getString("dateBirth"));
                clientVilla.setText(rs.getString("village"));
                clientCounty.setText(rs.getString("subCounty"));
                clientDistrict.setText(rs.getString("district"));
                clientEmail.setText(rs.getString("email"));
                clientPhone.setText(rs.getString("mobile"));
                clientAccNo.setText(rs.getString("accNo"));
                clientAccPIN.setText(rs.getString("accPIN"));
                clientInitialDepo.setText(rs.getString("inDepo")); 
            }
            else{
                JOptionPane.showMessageDialog(null,"Record was not Found!");
                clientFName.setText("");
                clientFName.requestFocus();
            }   
        }
         catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            
        
            try {
                if (st != null)
                {
                    st.close();
                }
                if(con != null)
                {
                    con.close();
                }}
                catch (SQLException ex)
                        {
                        ex.printStackTrace();
                
                }
            }
    }//GEN-LAST:event_findClientActionPerformed

    private void editClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editClientActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "UPDATE regClients SET firstName='"+clientFName.getText()+"', lastName='"+clientLName.getText()+"', dateBirth='"+clientDOB.getText()+"', village='"+clientVilla.getText()+"', subCounty='"+clientCounty.getText()+"', district='"+clientDistrict.getText()+"', email='"+clientEmail.getText()+"', accNo='"+clientPhone.getText()+"', accNo='"+clientAccNo.getText()+"', accPIN='"+clientAccPIN.getText()+"', inDepo='"+clientInitialDepo.getText()+"' WHERE firstName = '"+clientFName.getText()+"'";        
            
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null,"Record has been Edited!");
            clientFName.setText("");
            clientFName.requestFocus();
             
        }
         catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            
        
            try {
                if (st != null)
                {
                    st.close();
                }
                if(con != null)
                {
                    con.close();
                }}
                catch (SQLException ex)
                        {
                        ex.printStackTrace();
                
                }
            }
    }//GEN-LAST:event_editClientActionPerformed

    private void deleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClientActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "DELETE regId, firstName, lastName, dateBirth, village, subCounty, district, accNo, accNo, accPIN, inDepo WHERE firstName = '"+clientFName.getText()+"'";        
            
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null,"Record has been Deleted!");
            clientFName.setText("");
            clientFName.requestFocus();
             
        }
         catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            
        
            try {
                if (st != null)
                {
                    st.close();
                }
                if(con != null)
                {
                    con.close();
                }}
                catch (SQLException ex)
                        {
                        ex.printStackTrace();
                
                }
            }
    }//GEN-LAST:event_deleteClientActionPerformed

    private void findStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findStaffActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "SELECT * FROM regStaff WHERE firstName ='"+staffFName.getText()+"'";
            
            ResultSet rs = st.executeQuery(query);
            if(rs.first())
            {
                staffFName.setText(rs.getString("firstName"));
                staffLName.setText(rs.getString("lastName"));
                staffID.setText(rs.getString("staff_Id"));
                staffEmail.setText(rs.getString("email"));
                staffMobile.setText(rs.getString("mobile"));
            }
            else{
                JOptionPane.showMessageDialog(null,"Record was not Found!");
                staffFName.setText("");
                staffFName.requestFocus();
            }   
        }
         catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            
        
            try {
                if (st != null)
                {
                    st.close();
                }
                if(con != null)
                {
                    con.close();
                }}
                catch (SQLException ex)
                        {
                        ex.printStackTrace();
                
                }
            }
    }//GEN-LAST:event_findStaffActionPerformed

    private void deleteStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStaffActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "DELETE staffNo, firstName, lastName, email, staff_Id, mobile WHERE firstName = '"+staffFName.getText()+"'";        
            
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null,"Staff Member has been Deleted!");
            clientFName.setText("");
            clientFName.requestFocus();
             
        }
         catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            
        
            try {
                if (st != null)
                {
                    st.close();
                }
                if(con != null)
                {
                    con.close();
                }}
                catch (SQLException ex)
                        {
                        ex.printStackTrace();
                
                }
            }
    }//GEN-LAST:event_deleteStaffActionPerformed

    private void cashDepoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashDepoBtnActionPerformed
        // TODO add your handling code here:
        String reg_Id = cashRegId.getText();
        String depoAmount = cashAmount.getText();
        String depoDate = cashDate.getText();
        String cur = cashCombo.getItemAt(WIDTH);
        String accPIN = cashAccPIN.getText();
        
        if(reg_Id.isEmpty() && depoAmount.isEmpty() && depoDate.isEmpty() && cur.isEmpty() && accPIN.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill in all fields!");
        }

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "INSERT INTO cashDeposit (depositAmount, depositDate, regId, currency, accPIN) VALUES ('"+depoAmount+"','"+depoDate+"','"+reg_Id+"','"+cur+"','"+accPIN+"')";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Cash Deposited Successfully!");
            
        cashRegId.setText("");
        cashAmount.setText("");
        cashDate.setText("");
        cashAccPIN.setText("");
            
        cashRegId.requestFocus();
            
        }
        catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally {
            
        
            try {
                if (st != null)
                {
                    st.close();
                }
                if(con != null)
                {
                    con.close();
                }}
                catch (SQLException ex)
                        {
                        ex.printStackTrace();
                
                }
            }
        
    }//GEN-LAST:event_cashDepoBtnActionPerformed

    private void searchStatementBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStatementBtnActionPerformed
        try {
            // TODO add your handling code here:
            fetchStatements();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_searchStatementBtnActionPerformed

    private void statementPDFBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statementPDFBtnActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs,user,password);
            st = con.createStatement();
            query = "SELECT * FROM deposits";
            rs= st.executeQuery(query); 
            
            Document miniPdfReport = new Document(PageSize.A3);
            PdfWriter.getInstance(miniPdfReport, new FileOutputStream("miniReport.pdf"));
            miniPdfReport.open();  
            
           //Image image = Image.getInstance(loadImage("E:\downloads\juice.JPg"), null);
           Paragraph p = new Paragraph("Mini Statements of Clients at Kasacco",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD,BaseColor.BLUE));
           p.setAlignment(Element.ALIGN_CENTER);
           p.setSpacingAfter(20);

                PdfPTable clientPdfTable = new PdfPTable(8);
                //create a cell object
                PdfPCell table_cell = new PdfPCell(new Phrase("Reg ID"));
                clientPdfTable.addCell(table_cell);
                 PdfPCell table_cell1 = new PdfPCell(new Phrase("First Name"));
                clientPdfTable.addCell(table_cell1);
                 PdfPCell table_cell2 = new PdfPCell(new Phrase("Last Name"));
                clientPdfTable.addCell(table_cell2);
                 PdfPCell table_cell3 = new PdfPCell(new Phrase("Phone Number"));
                clientPdfTable.addCell(table_cell3);
                 PdfPCell table_cell4 = new PdfPCell(new Phrase("Account Number"));
                clientPdfTable.addCell(table_cell4);
                 PdfPCell table_cell5 = new PdfPCell(new Phrase("Account PIN"));
                clientPdfTable.addCell(table_cell5);
                 PdfPCell table_cell6 = new PdfPCell(new Phrase("Deposit Amount"));
                clientPdfTable.addCell(table_cell6);
                PdfPCell table_cell7 = new PdfPCell(new Phrase("Deposit Date"));
                clientPdfTable.addCell(table_cell7);
                 
                clientPdfTable.getAbsoluteWidths();
               
                while (rs.next()) {                
                                String regId = rs.getString("regId");
                                table_cell=new PdfPCell(new Phrase(regId));
                                clientPdfTable.addCell(table_cell);
                                String fname =rs.getString("firstName");
                                table_cell=new PdfPCell(new Phrase(fname));
                                clientPdfTable.addCell(table_cell);
                                String lname =rs.getString("lastName");
                                table_cell=new PdfPCell(new Phrase(lname));
                                clientPdfTable.addCell(table_cell);
                                String phone =rs.getString("mobile");
                                table_cell=new PdfPCell(new Phrase(phone));
                                clientPdfTable.addCell(table_cell);
                                String num =rs.getString("accNo");
                                table_cell=new PdfPCell(new Phrase(num));
                                clientPdfTable.addCell(table_cell);
                                String pin =rs.getString("accPIN");
                                table_cell=new PdfPCell(new Phrase(pin));
                                clientPdfTable.addCell(table_cell);
                                String amount =rs.getString("depositAmount");
                                table_cell=new PdfPCell(new Phrase(amount));
                                clientPdfTable.addCell(table_cell);
                                String dDate =rs.getString("depositDate");
                                table_cell=new PdfPCell(new Phrase(dDate));
                                clientPdfTable.addCell(table_cell);
                   }
                /* Attach report table to PDF */
               // miniPdfReport.addCreationDate();
                    miniPdfReport.add(p);
               // miniPdfReport.add(date);
                    miniPdfReport.add(clientPdfTable); 
               //txtresult.
                
               if(Desktop.isDesktopSupported()){
             try{
                 File pdffile =new File("miniReport.pdf");
                 Desktop.getDesktop().open(pdffile);
             }catch(IOException et){
                 et.printStackTrace();
             }
         }
               
               
               miniPdfReport.close();
                
                /* Close all DB related objects */
                rs.close();
                st.close(); 
                con.close();               
        }
         
         catch(SQLException ex)
                {
                    ex.printStackTrace();
                }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(DocumentException de)
        {
            de.printStackTrace();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_statementPDFBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu acqAssets;
    private javax.swing.JMenu annReport;
    private javax.swing.JMenu assetsMenu;
    private javax.swing.JButton cancelTransferBtn;
    private javax.swing.JTextField cashAccNo1;
    private javax.swing.JPasswordField cashAccPIN;
    private javax.swing.JTextField cashAmount;
    private javax.swing.JButton cashCancelBtn;
    private javax.swing.JComboBox<String> cashCombo;
    private javax.swing.JTextField cashDate;
    private javax.swing.JMenu cashDepo;
    private javax.swing.JButton cashDepoBtn;
    private javax.swing.JPanel cashDepoPanel;
    private javax.swing.JTextField cashRegId;
    private javax.swing.JPanel cashTransferPanel;
    private javax.swing.JMenu cashTransfers;
    private javax.swing.JMenu cashWithdraw;
    private javax.swing.JButton cashWithdrawBtn;
    private javax.swing.JPanel cashWithdrawPanel;
    private javax.swing.JTextField cashwithdrawAccNo;
    private javax.swing.JPasswordField cashwithdrawAccPIN;
    private javax.swing.JTextField cashwithdrawAccType;
    private javax.swing.JTextField cashwithdrawAmount;
    private javax.swing.JComboBox<String> cashwithdrawCombo;
    private javax.swing.JTextField clientAccNo;
    private javax.swing.JTextField clientAccPIN;
    private javax.swing.JButton clientCancel;
    private javax.swing.JTextField clientCounty;
    private javax.swing.JFormattedTextField clientDOB;
    private javax.swing.JTextField clientDistrict;
    private javax.swing.JTextField clientEmail;
    private javax.swing.JTextField clientFName;
    private javax.swing.JTextField clientInitialDepo;
    private javax.swing.JTextField clientLName;
    private javax.swing.JMenu clientMenu;
    private javax.swing.JButton clientPDFBtn;
    private javax.swing.JTextField clientPhone;
    private javax.swing.JButton clientRegister;
    private javax.swing.JTable clientTable;
    private javax.swing.JTextField clientVilla;
    private javax.swing.JButton closeClientPanel;
    private javax.swing.JButton closeStaffBtn;
    private javax.swing.JButton closeStatementBtn;
    private javax.swing.JMenu curLoan;
    private javax.swing.JButton delStatementBtn;
    private javax.swing.JButton deleteClient;
    private javax.swing.JButton deleteStaff;
    private javax.swing.JButton editClient;
    private javax.swing.JButton editStaff;
    private javax.swing.JButton findClient;
    private javax.swing.JButton findStaff;
    private javax.swing.JMenu genReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenu loanApplication;
    private javax.swing.JMenu loanDefaulter;
    private javax.swing.JMenu loansMenu;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JButton makeTransferBtn;
    private javax.swing.JMenu midyearReport;
    private javax.swing.JTable miniStatementTable;
    private javax.swing.JMenu miniStatements;
    private javax.swing.JPanel miniStatementsPanel;
    private javax.swing.JMenu monReport;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JMenu pastLoan;
    private javax.swing.JMenu permAssets;
    private javax.swing.JMenu quartReport;
    private javax.swing.JMenu regClient;
    private javax.swing.JPanel regClientPanel;
    private javax.swing.JMenu regStaff;
    private javax.swing.JPanel regStaffPanel;
    private javax.swing.JButton registerStaff;
    private javax.swing.JMenu reportsMenu;
    private javax.swing.JButton searchClientBtn;
    private javax.swing.JButton searchStatementBtn;
    private javax.swing.JMenu settingsMenu;
    private javax.swing.JMenu shareApplication;
    private javax.swing.JMenu shareHolders;
    private javax.swing.JMenu shareInfo;
    private javax.swing.JMenu sharesMenu;
    private javax.swing.JMenu soldAssets;
    private javax.swing.JTextField staffEmail;
    private javax.swing.JTextField staffFName;
    private javax.swing.JTextField staffID;
    private javax.swing.JTextField staffLName;
    private javax.swing.JMenu staffList;
    private javax.swing.JPanel staffListPanel;
    private javax.swing.JMenu staffMenu;
    private javax.swing.JTextField staffMobile;
    private javax.swing.JButton staffPDFBtn;
    private javax.swing.JTable staffTable;
    private javax.swing.JLabel staffTittle;
    private javax.swing.JButton staffcancelBtn;
    private javax.swing.JButton statementPDFBtn;
    private javax.swing.JMenu transacMenu;
    private javax.swing.JTextField transferAccNo;
    private javax.swing.JPasswordField transferAccPIN;
    private javax.swing.JTextField transferAmount;
    private javax.swing.JComboBox<String> transferCombo;
    private javax.swing.JTextField transferFName;
    private javax.swing.JTextField transferLName;
    private javax.swing.JMenu viewClient;
    private javax.swing.JPanel viewClientPanel;
    private javax.swing.JButton viewStaffList;
    private javax.swing.JLabel withdrawAccNoLabel;
    private javax.swing.JLabel withdrawAccNoLabel1;
    private javax.swing.JButton withdrawCancelBtn;
    // End of variables declaration//GEN-END:variables
}

