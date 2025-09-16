package com.example;

import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Finestra extends JFrame {

    JButton b;

    public Finestra() throws HeadlessException {
        this.setSize(500, 500);
        this.add(b = new JButton("Cliccami"));

        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        this.setLayout(new FlowLayout());

        b.setSize(100, 100);
        b.setFocusable(false);
    }
    
}
