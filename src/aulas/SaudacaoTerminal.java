package aulas;
import java.util.Scanner;
public class SaudacaoTerminal {  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Olá, " + nome + "! Seja bem-vindo(a) ao programa em java.");
        entrada.close();
    }
}
