package aulas;

import javax.swing.JOptionPane;

public class ifGUI {
    public static void main(String[] args) {
        String numStr = JOptionPane.showInputDialog("Digite um número: ");
        int num = Integer.parseInt(numStr);
        String msg;
        if (num > 0) {
            msg = "O número é positivo.";
        } else if (num < 0) {
            msg = "O número é negativo.";
        } else {
            msg = "O número é zero.";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
