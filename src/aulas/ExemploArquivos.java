package aulas;
import java.awt.image.ImagingOpException;
import java.io.*;

import javax.swing.JOptionPane;

public class ExemploArquivos {
    public static void main(String[] args) {
        try {
            String valor = JOptionPane.showInputDialog("Digite um número: ");
            int numero = Integer.parseInt(valor);

            int resultado = 10 / numero;

            JOptionPane.showMessageDialog(null, "Resultado: " +  resultado);

            FileReader fr = new FileReader("arquivo.txt");
            fr.close();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite apenas números!");

        } catch (ArithmeticException e ) {
            JOptionPane.showMessageDialog(null, "Erro: não é possivel dividir por zero!");

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Erro: Arquivo não encontrado!");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro de leitura no arquivo!");

        } catch (ImagingOpException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado: " + e.getMessage());
        }

    }
}
