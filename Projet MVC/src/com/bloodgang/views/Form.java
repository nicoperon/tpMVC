package com.bloodgang.views;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Form extends JPanel{
    public JButton backToDashboard = new JButton("Back to dashboard");
    private JRadioButton sexe1 = new JRadioButton("Homme");
    private JRadioButton sexe2 = new JRadioButton("Femme");
    private JTextField prenom =new JFormattedTextField();
    private JTextField nom =new JFormattedTextField();
    private JTextField age =new JFormattedTextField();
    private JTextField salaire =new JFormattedTextField();
    private JButton envoyer = new JButton("Envoyer");
    //private [][] donnees;
   // public JTable result=new JTable(donnees,entetes);
    public Form(JFrame frame){
        add(backToDashboard);
        add(sexe1);
        add(sexe2);
        add(prenom);
        prenom.setPreferredSize(new Dimension(300,50));
        add(nom);
        nom.setPreferredSize(new Dimension(300,50));
        add(age);
        age.setPreferredSize(new Dimension(300,50));
        add(salaire);
        salaire.setPreferredSize(new Dimension(300,50));
        add(envoyer);
        envoyer.addActionListener(new BoutonListener());

        backToDashboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new Container(frame));
                frame.revalidate();
                frame.repaint();
            }

        });
    }

}

