package aulas;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class WhileTryCalendarGUI {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        
        int idade = -1;

        // Repetir até idade válida
        while (idade < 0) {
            try {   
                String idadeStr = JOptionPane.showInputDialog("Digite sua idade: ");
                idade = Integer.parseInt(idadeStr); //sc.nextInt() 

                if (idade < 0) {
                    JOptionPane.showMessageDialog(null, "Idade não pode ser nula");
                }

            }   catch (NumberFormatException ck) {
                JOptionPane.showMessageDialog(null, "Valor inválido! Digite um número inteiro ");
            }

        }

        // Obter ano atual com Calendar
        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);
        int anoNascimento = anoAtual - idade;

        // Exibir mensagem final
        String mensagem = "Olá, " + nome + "!\nVocê nasceu em " + anoNascimento + ".";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}