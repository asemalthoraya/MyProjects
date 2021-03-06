/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.thiredone;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author عاصم الثرياء
 */
public class RoyalRestaurant extends javax.swing.JFrame {

    /**
     * Creates new form ThiredProjectRoyal
     */
    public RoyalRestaurant() {
        initComponents();
    }
    int breakfast[] = {500,3000,700};
    int lunch[] = {2500,3000,2000};
    int dinner[] = {1500,2000,1300};
    final int Beans_Cost = breakfast[0],Liver_Cost = breakfast[1],Cheese_Cost = breakfast[2];
    final int Kabsah_Cost = lunch[0],Mandy_Cost = lunch[1],Grilled_Cost = lunch[2];
    final int ChknBurg_Cost = dinner[0],HamBurg_Cost = dinner[1],Shawarma_Cost = dinner[2];
    int BeansPrice,LiverPrice,CheesePrice,KabsahPrice,MandyPrice,GrilledPrice,ChknBurgPrice,HamBurgPrice,ShawarmaPrice;
    int BeansNumber,LiverNumber,CheeseNumber,KabsahNumber,MandyNumber,GrilledNumber,ChknBurgNumber,HamBurgNumber,ShawarmaNumber;
    int customerCounter;
    int total ;
    int BillCounter;
    PrintWriter output;
    
    DefaultTableModel model = new DefaultTableModel();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        BillCounterLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BreakLiverCount = new javax.swing.JSpinner();
        BreakcheeseCount = new javax.swing.JSpinner();
        BreakBeanCount = new javax.swing.JSpinner();
        beans = new javax.swing.JLabel();
        liver = new javax.swing.JLabel();
        cheese = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        LunchMdyCount = new javax.swing.JSpinner();
        LunchGirChkCount = new javax.swing.JSpinner();
        LunchKbhCount = new javax.swing.JSpinner();
        mandy = new javax.swing.JLabel();
        grilled = new javax.swing.JLabel();
        kabsah = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        DinnerHamBurCount = new javax.swing.JSpinner();
        DinnerShmaCount = new javax.swing.JSpinner();
        DinnerChkBurCount = new javax.swing.JSpinner();
        chBurger = new javax.swing.JLabel();
        hamBurger = new javax.swing.JLabel();
        shawarma = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtSum = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        Summation = new javax.swing.JButton();
        saveBill = new javax.swing.JButton();
        NewBill1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 59, 66));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 148, 4));
        jLabel1.setText("Royal Restaurant");

        jPanel6.setBackground(new java.awt.Color(221, 149, 25));

        BillCounterLabel.setBackground(new java.awt.Color(230, 157, 33));
        BillCounterLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        BillCounterLabel.setText(" Bill Number 0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(BillCounterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BillCounterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setBackground(new java.awt.Color(232, 148, 4));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("Exit");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, -1));

        jPanel2.setBackground(new java.awt.Color(53, 59, 66));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Breakfast", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 18), new java.awt.Color(232, 148, 4))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BreakLiverCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        BreakLiverCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BreakLiverCountStateChanged(evt);
            }
        });
        jPanel2.add(BreakLiverCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 77, 30));

        BreakcheeseCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        BreakcheeseCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BreakcheeseCountStateChanged(evt);
            }
        });
        jPanel2.add(BreakcheeseCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 77, 30));

        BreakBeanCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        BreakBeanCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BreakBeanCountStateChanged(evt);
            }
        });
        jPanel2.add(BreakBeanCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 77, 30));

        beans.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        beans.setForeground(new java.awt.Color(232, 148, 4));
        beans.setText("Single Beans with eggs");
        jPanel2.add(beans, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 40));

        liver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        liver.setForeground(new java.awt.Color(232, 148, 4));
        liver.setText("Single Liver Sheep           ");
        jPanel2.add(liver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 170, 40));

        cheese.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cheese.setForeground(new java.awt.Color(232, 148, 4));
        cheese.setText("Single Cheese With Kraft");
        jPanel2.add(cheese, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, -1, 284));

        jPanel4.setBackground(new java.awt.Color(53, 59, 66));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lunch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 18), new java.awt.Color(232, 148, 4))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LunchMdyCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        LunchMdyCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LunchMdyCountStateChanged(evt);
            }
        });
        jPanel4.add(LunchMdyCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 77, 30));

        LunchGirChkCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        LunchGirChkCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LunchGirChkCountStateChanged(evt);
            }
        });
        jPanel4.add(LunchGirChkCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 77, 30));

        LunchKbhCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        LunchKbhCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LunchKbhCountStateChanged(evt);
            }
        });
        jPanel4.add(LunchKbhCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 77, 30));

        mandy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mandy.setForeground(new java.awt.Color(232, 148, 4));
        mandy.setText("Single Mandy with rice");
        jPanel4.add(mandy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 40));

        grilled.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        grilled.setForeground(new java.awt.Color(232, 148, 4));
        grilled.setText("Single Grilled Chicken ");
        jPanel4.add(grilled, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 40));

        kabsah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kabsah.setForeground(new java.awt.Color(232, 148, 4));
        kabsah.setText("Single Kabasah with rice");
        jPanel4.add(kabsah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 171, -1, 284));

        jPanel3.setBackground(new java.awt.Color(53, 59, 66));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dinner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 18), new java.awt.Color(232, 148, 4))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DinnerHamBurCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        DinnerHamBurCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DinnerHamBurCountStateChanged(evt);
            }
        });
        jPanel3.add(DinnerHamBurCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 77, 30));

        DinnerShmaCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        DinnerShmaCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DinnerShmaCountStateChanged(evt);
            }
        });
        jPanel3.add(DinnerShmaCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 77, 30));

        DinnerChkBurCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        DinnerChkBurCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DinnerChkBurCountStateChanged(evt);
            }
        });
        jPanel3.add(DinnerChkBurCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 77, 30));

        chBurger.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chBurger.setForeground(new java.awt.Color(232, 148, 4));
        chBurger.setText("Single Chicken burger");
        jPanel3.add(chBurger, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 40));

        hamBurger.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hamBurger.setForeground(new java.awt.Color(232, 148, 4));
        hamBurger.setText("Single Hamburger");
        jPanel3.add(hamBurger, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 170, 40));

        shawarma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        shawarma.setForeground(new java.awt.Color(232, 148, 4));
        shawarma.setText("Single Shawarma");
        jPanel3.add(shawarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 170, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 171, -1, 284));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 462, 634, 294));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 148, 4));
        jLabel2.setText("Total");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 461, 144, 71));

        txtSum.setBackground(new java.awt.Color(153, 153, 153));
        txtSum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSum.setForeground(new java.awt.Color(232, 148, 4));
        getContentPane().add(txtSum, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 166, 76));

        jPanel5.setBackground(new java.awt.Color(219, 214, 214));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Summation.setBackground(new java.awt.Color(53, 59, 66));
        Summation.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        Summation.setForeground(new java.awt.Color(232, 148, 4));
        Summation.setText("Add");
        Summation.setBorderPainted(false);
        Summation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SummationActionPerformed(evt);
            }
        });
        jPanel5.add(Summation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 280, 55));

        saveBill.setBackground(new java.awt.Color(53, 59, 66));
        saveBill.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        saveBill.setForeground(new java.awt.Color(232, 148, 4));
        saveBill.setText("Save Bill ");
        saveBill.setBorderPainted(false);
        saveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBillActionPerformed(evt);
            }
        });
        jPanel5.add(saveBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 55));

        NewBill1.setBackground(new java.awt.Color(53, 59, 66));
        NewBill1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        NewBill1.setForeground(new java.awt.Color(232, 148, 4));
        NewBill1.setText("new Bill");
        NewBill1.setBorderPainted(false);
        NewBill1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBill1ActionPerformed(evt);
            }
        });
        jPanel5.add(NewBill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 140, 55));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 625, 321, 131));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BreakLiverCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BreakLiverCountStateChanged
        // TODO add your handling code here:
        LiverNumber = (Integer)BreakLiverCount.getValue();
        LiverPrice = Liver_Cost * LiverNumber;

    }//GEN-LAST:event_BreakLiverCountStateChanged

    private void BreakcheeseCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BreakcheeseCountStateChanged
        // TODO add your handling code here:
        CheeseNumber = (Integer)BreakcheeseCount.getValue();
        CheesePrice = Cheese_Cost * CheeseNumber;
    }//GEN-LAST:event_BreakcheeseCountStateChanged

    private void BreakBeanCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BreakBeanCountStateChanged
        // TODO add your handling code here:
        BeansNumber = (Integer)BreakBeanCount.getValue();
        BeansPrice = Beans_Cost * BeansNumber;
    }//GEN-LAST:event_BreakBeanCountStateChanged

    private void LunchMdyCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LunchMdyCountStateChanged
        // TODO add your handling code here:
        MandyNumber = (Integer)LunchMdyCount.getValue();
        MandyPrice = Mandy_Cost * MandyNumber;

    }//GEN-LAST:event_LunchMdyCountStateChanged

    private void LunchGirChkCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LunchGirChkCountStateChanged
        // TODO add your handling code here:
        GrilledNumber = (Integer)LunchGirChkCount.getValue();
        GrilledPrice = Grilled_Cost * GrilledNumber;

    }//GEN-LAST:event_LunchGirChkCountStateChanged

    private void LunchKbhCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LunchKbhCountStateChanged
        // TODO add your handling code here:
        KabsahNumber = (Integer)LunchKbhCount.getValue();
        KabsahPrice = Kabsah_Cost * KabsahNumber;

    }//GEN-LAST:event_LunchKbhCountStateChanged

    private void DinnerHamBurCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DinnerHamBurCountStateChanged
        // TODO add your handling code here:
        HamBurgNumber = (Integer)DinnerHamBurCount.getValue();
        HamBurgPrice = HamBurg_Cost * HamBurgNumber;

    }//GEN-LAST:event_DinnerHamBurCountStateChanged

    private void DinnerShmaCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DinnerShmaCountStateChanged
        // TODO add your handling code here:
        ShawarmaNumber = (Integer)DinnerShmaCount.getValue();
        ShawarmaPrice = Shawarma_Cost * ShawarmaNumber;

    }//GEN-LAST:event_DinnerShmaCountStateChanged

    private void DinnerChkBurCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DinnerChkBurCountStateChanged
        // TODO add your handling code here:
        ChknBurgNumber = (Integer)DinnerChkBurCount.getValue();
        ChknBurgPrice = ChknBurg_Cost * ChknBurgNumber;

    }//GEN-LAST:event_DinnerChkBurCountStateChanged

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void SummationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SummationActionPerformed
        // TODO add your handling code here:

        //breakrfast section
        //Beans with eggs
        model = (DefaultTableModel)jTable1.getModel();
        if (BeansNumber !=0) {
            model.addRow(new Object[]
                {
                    beans.getText(),
                    Beans_Cost,
                    BeansNumber ,
                    BeansPrice  ,
                });
            }
            //liver Sheep
            if (LiverNumber !=0) {
                model.addRow(new Object[]
                    {
                        liver.getText(),
                        Liver_Cost ,
                        LiverNumber,
                        LiverPrice ,
                    });
                }
                //cheese
                if (CheeseNumber !=0){
                    model.addRow(new Object[]
                        {
                            cheese.getText(),
                            Cheese_Cost ,
                            CheeseNumber,
                            CheesePrice ,
                        });
                    }
                    //Lunch section
                    //Kabasah
                    if (KabsahNumber !=0) {
                        model.addRow(new Object[]
                            {
                                kabsah.getText(),
                                Kabsah_Cost ,
                                KabsahNumber,
                                KabsahPrice ,
                            });
                        }
                        //Mandy
                        if (MandyNumber !=0) {
                            model.addRow(new Object[]
                                {
                                    mandy.getText(),
                                    Mandy_Cost ,
                                    MandyNumber,
                                    MandyPrice ,
                                });
                            }

                            //Girlled chicken

                            if (GrilledNumber !=0) {
                                model.addRow(new Object[]
                                    {
                                        grilled.getText(),
                                        Grilled_Cost ,
                                        GrilledNumber,
                                        GrilledPrice ,
                                    });
                                }
                                //Dinner section
                                //chicken burger
                                if (ChknBurgNumber !=0) {
                                    model.addRow(new Object[]
                                        {
                                            chBurger.getText(),
                                            ChknBurg_Cost ,
                                            ChknBurgNumber,
                                            ChknBurgPrice ,
                                        });
                                    }
                                    //Hamburger
                                    if(HamBurgNumber !=0){
                                        model.addRow(new Object[]
                                            {
                                                hamBurger.getText(),
                                                HamBurg_Cost ,
                                                HamBurgNumber,
                                                HamBurgPrice ,
                                            });
                                        }
                                        //Shawarma
                                        if (ShawarmaNumber !=0) {
                                            model.addRow(new Object[]
                                                {
                                                    shawarma.getText(),
                                                    Shawarma_Cost ,
                                                    ShawarmaNumber,
                                                    ShawarmaPrice ,
                                                });
                                            }

                                            for(int i=0; i<jTable1.getRowCount();i++){
                                                total = total + Integer.parseInt(jTable1.getValueAt(i, 3).toString());
                                            }
                                            txtSum.setText(Integer.toString(total));

    }//GEN-LAST:event_SummationActionPerformed

    private void saveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBillActionPerformed
        // TODO add your handling code here:
        try {
            if (total !=0) {
                output = new PrintWriter("BillNumber #" + (BillCounter + 1) + ".txt");
                output.println("Bill Number " + (BillCounter + 1));
                output.println("*************");
                if (BeansNumber !=0){
                    output.print(BeansNumber +" Single Beans with Eggs ");
                    output.println(BeansPrice + ".");
                }
                if (LiverNumber !=0){
                    output.print(LiverNumber +" Single Liver Sheep ");
                    output.println(LiverPrice + ".");
                }
                if (CheeseNumber !=0){
                    output.print(CheeseNumber +" Single Cheese With Kraft ");
                    output.println(CheesePrice + ".");
                }
                if (KabsahNumber !=0){
                    output.print(KabsahNumber +" Single Kabasah with rice ");
                    output.println(KabsahPrice + ".");
                }
                if (MandyNumber !=0){
                    output.print(MandyNumber +" Single Mandy with rice ");
                    output.println(MandyPrice + ".");
                }
                if (GrilledNumber !=0){
                    output.print(GrilledNumber +" Single Grilled Chicken ");
                    output.println(GrilledPrice + ".");
                }
                if (ChknBurgNumber !=0){
                    output.print(ChknBurgNumber +" Single Chicken burger ");
                    output.println(ChknBurgPrice + ".");
                }
                if (HamBurgNumber !=0){
                    output.print(HamBurgNumber +" Single Hamburger ");
                    output.println(HamBurgPrice + ".");
                }
                if (ShawarmaNumber !=0){
                    output.print(ShawarmaNumber +" Single Shawarma ");
                    output.println(ShawarmaPrice + ".");
                }
                output.println();
                output.println("**************");
                output.println("Total :" + total);
                output.println("Thank you For Your Order");
                output.close();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(RoyalRestaurant.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_saveBillActionPerformed

    private void NewBill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBill1ActionPerformed
        // TODO add your handling code here:
        if (total != 0) {
            BreakBeanCount.setValue(0);
            BreakLiverCount.setValue(0);
            BreakcheeseCount.setValue(0);
            LunchKbhCount.setValue(0);
            LunchMdyCount.setValue(0);
            LunchGirChkCount.setValue(0);
            DinnerChkBurCount.setValue(0);
            DinnerHamBurCount.setValue(0);
            DinnerShmaCount.setValue(0);
            txtSum.setText("");
            total = 0;
            BillCounter++;
            BillCounterLabel.setText("Bill Number: "+BillCounter);
            int rowsRemove = model.getRowCount();
            for (int i = rowsRemove-1; i < 30; i--) {
                model.removeRow(i);
            }
        }
    }//GEN-LAST:event_NewBill1ActionPerformed

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
            java.util.logging.Logger.getLogger(RoyalRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoyalRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoyalRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoyalRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoyalRestaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BillCounterLabel;
    private javax.swing.JSpinner BreakBeanCount;
    private javax.swing.JSpinner BreakLiverCount;
    private javax.swing.JSpinner BreakcheeseCount;
    private javax.swing.JSpinner DinnerChkBurCount;
    private javax.swing.JSpinner DinnerHamBurCount;
    private javax.swing.JSpinner DinnerShmaCount;
    private javax.swing.JSpinner LunchGirChkCount;
    private javax.swing.JSpinner LunchKbhCount;
    private javax.swing.JSpinner LunchMdyCount;
    private javax.swing.JButton NewBill1;
    private javax.swing.JButton Summation;
    private javax.swing.JLabel beans;
    private javax.swing.JLabel chBurger;
    private javax.swing.JLabel cheese;
    private javax.swing.JLabel grilled;
    private javax.swing.JLabel hamBurger;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kabsah;
    private javax.swing.JLabel liver;
    private javax.swing.JLabel mandy;
    private javax.swing.JButton saveBill;
    private javax.swing.JLabel shawarma;
    private javax.swing.JTextField txtSum;
    // End of variables declaration//GEN-END:variables
}
