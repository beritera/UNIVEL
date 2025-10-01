package aulas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;

public class ExercicioHashSet extends JFrame {
    private JTextField txtNome;
    private JTextArea areaResultado;
    private HashSet<String> nomes;
    private JButton btnVerificar;

    public ExercicioHashSet() {
        setTitle("Exercício Hash com Border Layout");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout(10, 10));
        setLocationRelativeTo(null);

        nomes = new HashSet<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");

        JPanel painelSuperior = new JPanel();
        painelSuperior.add(new JLabel("Digite um nome:"));
        txtNome = new JTextField(15);
        painelSuperior.add(txtNome);

        btnVerificar = new JButton("Verificar Nome");

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);

        add(painelSuperior, BorderLayout.NORTH);
        add(new JScrollPane(areaResultado), BorderLayout.CENTER);
        add(btnVerificar, BorderLayout.SOUTH);

        btnVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Conjunto inicial: ").append(nomes).append("\n");

                String nome = txtNome.getText();
                if (nomes.contains(nome)) {
                    sb.append("Resultado: ").append(nome).append(" está na lista!\n");
                } else {
                    sb.append("Resultado: ").append(nome).append(" NÃO está na lista!\n");
                }

                areaResultado.setText(sb.toString());
            }
        });

        add(painelSuperior, BorderLayout.NORTH);
        add(new JScrollPane(areaResultado), BorderLayout.CENTER);
        add(btnVerificar, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ExercicioHashSet().setVisible(true);
        });
    }
}
