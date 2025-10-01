package aulas;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class JanelaOi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Janela com Botão");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);



        JButton botao = new JButton("Clique aqui");
        botao.setBounds(90, 70, 120, 30);
        frame.add(botao);

        JLabel lblNome = new JLabel("Digite seu nome:");
        lblNome.setBounds(20, 20, 150, 25);
        frame.add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(120, 20, 200, 25);
        frame.add(txtNome);

        JRadioButton rbtnMasculino = new JRadioButton("Masculino");
        rbtnMasculino.setBounds(20, 100, 100, 25);
        JRadioButton rbtnFeminino = new JRadioButton("Feminino");
        rbtnFeminino.setBounds(130, 100, 100, 25);

        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(rbtnMasculino);
        grupoSexo.add(rbtnFeminino);

        frame.add(rbtnMasculino);
        frame.add(rbtnFeminino);

        JCheckBox chkProgramador = new JCheckBox("Programador");
        chkProgramador.setBounds(20, 100, 120, 25);
        JCheckBox chkProfessor = new JCheckBox("Professor");
        chkProfessor.setBounds(200, 100, 120, 25);
        frame.add (chkProgramador);
        frame.add (chkProfessor);

        String[] cores = {"Vermelho", "Verde", "Azul"};
        JComboBox<String> combo = new JComboBox<>(cores);
        combo.setBounds(20, 140, 100, 25);
        frame.add(combo); 

        String[] frutas = {"Maça", "Banana", "Laranja"};
        JList<String> lista = new JList<>(frutas);
        lista.setBounds(200, 140, 100, 60);
        frame.add(lista);

        JSlider slider = new JSlider(0, 100, 50);

        slider.setBounds(20, 200, 200 ,50);
        frame.add(slider);

        ImageIcon icon = new ImageIcon("aula\\resources\\imagens\\tatu.png");
        JLabel lblIcone = new JLabel(icon);
        lblIcone.setBounds(20, 180, 200, 150);
        frame.add(lblIcone);


        botao.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Oi!"));

        frame.setVisible(true);
    }
}