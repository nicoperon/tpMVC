package com.bloodgang.views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoutonListener implements ActionListener {
    private JTextField prenom =new JFormattedTextField();
    private JTextField nom =new JFormattedTextField();
    private JTextField age =new JFormattedTextField();
    private JTextField salaire =new JFormattedTextField();
    private JButton envoyer = new JButton("Envoyer");
    @Override
    public void actionPerformed(ActionEvent arg0) {
       try {
            JFrame frame = new JFrame();
            frame.getContentPane().removeAll();
            frame.getContentPane().add(new EmployeeList(frame));
            frame.revalidate();
            frame.repaint();
            String prename = prenom.getText().toString();
            String name = nom.getText().toString();
            String ages = age.getText().toString();
            String slr = salaire.getText().toString();
            Object[][] donnees = new Object[10][10];
            Object[] entetes = new Object[5];
            JTable listEmp = new JTable(donnees,entetes);
            listEmp.setValueAt(donnees,0,0);
            listEmp.setValueAt(entetes, 1, 0);
        }catch (Exception e){}

    }
}
