package aulas;

//Lembrar da PORRA do sout

import java.util.Scanner;

public class EntradaConsole {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = 0;

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.print("Digite sua altura (ex: 1.75): ");
        double altura = entrada.nextDouble();

        System.out.println("\n--- Resultado ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        entrada.close();
    }
}
