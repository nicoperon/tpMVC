package com.bloodgang.views;

import com.bloodgang.views.ContainerManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Container extends JPanel {
    private final JFrame frame;
    public JButton ajouter = new JButton("Ajout");
    public JButton afficher = new JButton("Afficher");
    private JLabel titre = new JLabel("Dashboard");
    public JPanel c2 = new JPanel();

    public Container(JFrame frame) {
        setLayout(new FlowLayout());
        add(ajouter);
        add(afficher);
        add(titre);
        this.frame = frame;

        afficher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new EmployeeList(frame));
                frame.revalidate();
                frame.repaint();
            }
        });
        ajouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new Form(frame));
                frame.revalidate();
                frame.repaint();
            }
        });
    }
}
