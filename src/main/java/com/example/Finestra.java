package com.example;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Finestra extends JFrame {

    JTextField text;
    JButton aggiungi;
    ArrayList<JTextArea> lista;

    public Finestra() {
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(500, 500);
        this.add(text = new JTextField());
        this.add(aggiungi = new JButton("Aggiungi alla lista"));

        this.setLayout(new GridLayout());


        aggiungi.setSize(100, 100);
        aggiungi.setFocusable(false);
    }
    
    private void inizializzaArray(){
        lista = new ArrayList<>();
    } 
}
