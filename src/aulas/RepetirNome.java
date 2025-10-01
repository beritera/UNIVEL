package aulas;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;


public class RepetirNome extends JFrame  {

    private JTextField txtNome, txtQuantidade;
    private JTextArea txtResultado;
    private JButton btnExecutar;

    public RepetirNome() {
        setTitle("Repetir Nome com FOR");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel lblNome = new JLabel("Digite seu nome:");
        txtNome = new JTextField(20);

        JLabel lblQuantidade = new JLabel("Quantas vezes repetir?");
        txtQuantidade = new JTextField(5);

        btnExecutar = new JButton("Repetir nome");
        txtResultado = new JTextArea(10, 35);
        txtResultado.setEditable(false);

        JScrollPane scroll = new JScrollPane(txtResultado);

        add(lblNome);
        add(txtNome);
        add(lblQuantidade);
        add(txtQuantidade);
        add(btnExecutar);
        add(scroll);

        btnExecutar.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                txtResultado.setText("");
                String nome = txtNome.getText();
                String qtdStr = txtQuantidade.getText();

                if (nome.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Digite um nome!", "Aviso", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                int qtd = 0;
                try {
                    qtd = Integer.parseInt(qtdStr);
                    if (qtd <= 0) throw new NumberFormatException();
                }   catch(NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Digte um número inteiro positivo!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }

                for (int i = 1; i <= qtd; i++) {
                    txtResultado.append(i + " - " + nome + "\n");
                }

            }
        });

    }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> new RepetirNome().setVisible(true));
        }
}