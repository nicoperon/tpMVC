package com.bloodgang.views;
import com.bloodgang.views.Container;

import javax.swing.*;
import java.awt.*;

public class ContainerManager extends JPanel {


    public JPanel c1 =new JPanel();
    public JPanel c2 =new JPanel();

    public ContainerManager() {
        setLayout(new BorderLayout());
        add(c1);
        //bouton1.addActionListener(paint());
    }
}
