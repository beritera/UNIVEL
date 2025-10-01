package aulas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bernardo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Cálculo da Média do Aluno");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel lblNome = new JLabel("Nome do Aluno:");
        JTextField txtNome = new JTextField();

        JLabel lblNota1 = new JLabel("Nota 1:");
        JTextField txtNota1 = new JTextField();

        JLabel lblNota2 = new JLabel("Nota 2:");
        JTextField txtNota2 = new JTextField();

        JButton btnCalcular = new JButton("Calcular Média");
        JButton btnSair = new JButton("Sair");

        frame.add(lblNome);
        frame.add(txtNome);
        frame.add(lblNota1);
        frame.add(txtNota1);
        frame.add(lblNota2);
        frame.add(txtNota2);
        frame.add(btnCalcular);
        frame.add(btnSair);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = txtNome.getText();
                    double n1 = Double.parseDouble(txtNota1.getText());
                    double n2 = Double.parseDouble(txtNota2.getText());
                    double media = (n1 + n2) / 2;

                    JOptionPane.showMessageDialog(frame, 
                        "Aluno: " + nome + "\nMédia: " + media);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, 
                        "Por favor, insira notas válidas (números).", 
                        "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
