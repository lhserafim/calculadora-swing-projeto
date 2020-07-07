package br.com.alvoradatec.calculadora.visao;

import javax.swing.*;

public class Calculadora extends JFrame {
    public Calculadora() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // poderia ser DISPOSE_ON_CLOSE
        setSize(232,322);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
