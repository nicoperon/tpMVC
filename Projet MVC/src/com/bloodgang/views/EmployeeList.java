package com.bloodgang.views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeList extends JPanel {
    private JTextField prenom =new JFormattedTextField();
    private JTextField nom =new JFormattedTextField();
    private JTextField age =new JFormattedTextField();
    private JTextField salaire =new JFormattedTextField();
    private JButton envoyer = new JButton("Envoyer");
    private JButton backToDashboard = new JButton("Back to dashboard");
    //private final ThreadLocal<JTable> listEmp = ThreadLocal.withInitial(this::get);
    private Object[][] donnees = {
            {nom, prenom,age, salaire, 45000},
            {nom, "Van de Kampf", 45, "Homme", 70000},
            {"Damien", "Cuthbert",23, "Homme", 40000},
            {"Corinne", "Valance", 26, "Femme", 45000},
            {"Emilie", "Schrödinger", 29, "Femme", 59000},
            {"Delphine", "Duke", 27, "Femme", 55000},
            {"Eric", "Trump", 26, "Homme", 45000},
    };
     private String[] entetes = {"Prénom", "Nom", "age", "Sexe", "Salaire"};
     public  JTable listEmp = new JTable(donnees,entetes);

    public EmployeeList(JFrame jFrame) {
        add(backToDashboard);
        add(listEmp);

        backToDashboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jFrame.getContentPane().removeAll();
                jFrame.getContentPane().add(new Container(jFrame));
                jFrame.revalidate();
                jFrame.repaint();
            }
        });
    }

    private JTable get() {
        return new JTable(donnees, entetes);
    }
}
