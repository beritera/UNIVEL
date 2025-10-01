package aulas;

import javax.swing.*;
public class HelloWordGUI{
    public static void main(String[] args){
        JFrame frame = new JFrame("Hello, Word!");
        JButton button = new JButton("Clique-me!");
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}