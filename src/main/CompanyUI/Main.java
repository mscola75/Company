/*
 * Created by JFormDesigner on Tue Aug 07 18:21:09 CEST 2018
 */

package main.CompanyUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

/**
 * @author Massimo Scola
 */
public class Main extends JFrame {
    public Main() {

        initComponents();
        populate();
    }

    private void populate() {


        for (int i = 1960; i < 2019; i += 1) {
            cboDOBYear.addItem(i);
            System.out.println(i);
        }



    }

    private void panel1MouseClicked(MouseEvent e) {
        populate();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Massimo Scola
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        txtFirstName = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        txtLastName = new JTextField();
        label3 = new JLabel();
        cboHireYear = new JComboBox();
        cboHireMonth = new JComboBox();
        cboHireDay = new JComboBox();
        label4 = new JLabel();
        txtPosition = new JTextField();
        txtStreet = new JTextField();
        label5 = new JLabel();
        label6 = new JLabel();
        txtPostalCode = new JTextField();
        label7 = new JLabel();
        txtCity = new JTextField();
        label8 = new JLabel();
        txtCountry = new JTextField();
        label9 = new JLabel();
        txtSalary = new JTextField();
        button1 = new JButton();
        label10 = new JLabel();
        cboDOBYear = new JComboBox<Integer>();
        cboDOBMonth = new JComboBox();
        cboDOBDay = new JComboBox();
        btnPopulate = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== tabbedPane1 ========
        {

            //======== panel1 ========
            {
                panel1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        panel1MouseClicked(e);
                    }
                });

                // JFormDesigner evaluation mark
                panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


                //---- label1 ----
                label1.setText("First Name");

                //---- label2 ----
                label2.setText("Last Name");

                //---- label3 ----
                label3.setText("Hire date:");

                //---- label4 ----
                label4.setText("Position");

                //---- label5 ----
                label5.setText("Street");

                //---- label6 ----
                label6.setText("Postal Code");

                //---- label7 ----
                label7.setText("City");

                //---- label8 ----
                label8.setText("Country");

                //---- label9 ----
                label9.setText("Salary");

                //---- button1 ----
                button1.setText("Submit");

                //---- label10 ----
                label10.setText("Date of Birth");

                //---- btnPopulate ----
                btnPopulate.setText("Populate");

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                        .addComponent(label5)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtStreet, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLastName, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                        .addComponent(label6)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPostalCode, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                        .addComponent(label7)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCity, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label8)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCountry, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(cboDOBYear, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(cboDOBMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(cboDOBDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(95, 95, 95)
                                                    .addComponent(btnPopulate)))
                                            .addGap(192, 192, 192)
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addComponent(button1)
                                                .addComponent(txtPosition)))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cboHireYear, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cboHireMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cboHireDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtSalary, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))))
                            .addGap(27, 27, 27))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label1))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label2)
                                        .addComponent(txtLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label3)
                                        .addComponent(cboHireYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboHireMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboHireDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label4)
                                        .addComponent(txtPosition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addComponent(txtStreet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label5, GroupLayout.Alignment.TRAILING)))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label9)
                                        .addComponent(txtSalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPostalCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label7))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCountry, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label8))
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addComponent(button1)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(label10))
                                        .addComponent(cboDOBYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboDOBMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboDOBDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(btnPopulate)))
                            .addContainerGap(134, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Add Employee", panel1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabbedPane1)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Massimo Scola
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField txtFirstName;
    private JLabel label1;
    private JLabel label2;
    private JTextField txtLastName;
    private JLabel label3;
    private JComboBox cboHireYear;
    private JComboBox cboHireMonth;
    private JComboBox cboHireDay;
    private JLabel label4;
    private JTextField txtPosition;
    private JTextField txtStreet;
    private JLabel label5;
    private JLabel label6;
    private JTextField txtPostalCode;
    private JLabel label7;
    private JTextField txtCity;
    private JLabel label8;
    private JTextField txtCountry;
    private JLabel label9;
    private JTextField txtSalary;
    private JButton button1;
    private JLabel label10;
    private JComboBox<Integer> cboDOBYear;
    private JComboBox cboDOBMonth;
    private JComboBox cboDOBDay;
    private JButton btnPopulate;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
