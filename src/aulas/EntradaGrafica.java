package aulas;

import javax.swing.JOptionPane;

public class EntradaGrafica {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        

        int idade = 0;
        String idadeStr = JOptionPane.showInputDialog("Digite sua idade");
        try {
            idade = Integer.parseInt(idadeStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Idade Inválida!");
            return;
        }

        String alturaStr = JOptionPane.showInputDialog("Digite sua altura (ex: 1.75): ");
        double altura = Double.parseDouble(alturaStr);

        String mensagem = "Nome: " + nome + "\n Idade; " + idade + "\nAltura: " + altura;
        JOptionPane.showConfirmDialog(null, mensagem);
    }
}
