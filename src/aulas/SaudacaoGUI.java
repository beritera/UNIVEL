package aulas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SaudacaoGUI extends JFrame {
    
    private JTextField campoNome;
    private JButton botaoSaudar;
    private JLabel labelMensagem;

    public SaudacaoGUI(){
        setTitle("Programa de Saudação");

        setSize(350, 150);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());

        campoNome = new JTextField(20);

        botaoSaudar = new JButton("Saudar");

        labelMensagem = new JLabel("Digite seu nome e clique em Saudar");

        painel.add(new JLabel("Nome: "));
        painel.add(campoNome);
        painel.add(botaoSaudar);
        painel.add(labelMensagem);

        botaoSaudar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String nome = campoNome.getText().trim();

                if (nome.isEmpty()) {
                    labelMensagem.setText("Por favor, digite seu nome!");
                } else {
                    labelMensagem.setText("Olá, " + nome + "! Seja bem-vindo(a)");
                }
            }
        });

        add(painel);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SaudacaoGUI janela = new SaudacaoGUI();
            janela.setVisible(true);
        });
    }

}
