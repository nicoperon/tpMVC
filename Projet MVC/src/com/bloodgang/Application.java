package com.bloodgang;

import com.bloodgang.views.ContainerManager;
import com.bloodgang.views.Container;
import com.bloodgang.views.EmployeeList;
import com.bloodgang.views.Form;

import javax.swing.*;

import java.awt.*;

import static javax.swing.SwingUtilities.invokeLater;

public class Application {
    public static void main(String []args){
        invokeLater(Application::window);
    }
    private static void window(){
        JFrame frame = new JFrame("Fiche Employés");
        frame.setSize(400,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ContainerManager cm = new ContainerManager();
        Container c1 = new Container(frame);
        Container EmployeeList = new Container(frame);
        Container Form =new Container(frame);
        frame.getContentPane().add(c1);
        frame.getContentPane().add(EmployeeList);
        frame.getContentPane().add(Form);
        frame.pack();
        frame.setVisible(true);

    }
}
