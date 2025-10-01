package aulas;

import javax.swing.*;

public class MenuPrincipal extends JFrame { 
    public MenuPrincipal() {
        setTitle("Menu Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuProgramas = new JMenu("Programas");

        addMenuItem(menuProgramas, "Aula 1 - Hello Word", "aulas.HelloWorldGUI");
        addMenuItem(menuProgramas, "Aula 2 - Saudação", "aulas.SaudacaoGUI");
        addMenuItem(menuProgramas, "Aula 3 - While Try Calendar", "aulas.WhileTryCalendarGUI");
        addMenuItem(menuProgramas, "Aula 4 - Repetir Nome", "aulas.RepetirNome");
        addMenuItem(menuProgramas, "Aula 5 - Tratamento Excessões", "aulas.TratamentoExcessoes");
        addMenuItem(menuProgramas, "Aula 5 - Excessao Idade Invalida", "aulas.ExcessaoIdadeInvalida");
        addMenuItem(menuProgramas, "Aula 5 - Excecoes Arquivos", "aulas.ExemploArquivos");
        addMenuItem(menuProgramas, "Aula 6 - Exercicio ArrayList", "aulas.ExercicioArrayList");
        addMenuItem(menuProgramas, "Aula 6 - Exercicio HashMap", "aulas.ExerciciosHashMap");
        addMenuItem(menuProgramas, "Aula 6 - Exercicio HashSet", "aulas.HashSet");
        addMenuItem(menuProgramas, "Aula 7 - Exercicio JanelaOi", "aulas.JanelaOi");

        //teste reupload alguns arquivos

        menuBar.add(menuProgramas);
        setJMenuBar(menuBar);

    }

        private void addMenuItem(JMenu menu, String nome, String nomeClasse) {
            JMenuItem item = new JMenuItem(nome);
            item.addActionListener(e -> {
                try {
                    Class<?> clazz = Class.forName(nomeClasse);
                    Object instancia = clazz.getDeclaredConstructor().newInstance();
                
                    if (instancia instanceof JFrame) {
                        ((JFrame) instancia).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "A classe " + nomeClasse + " não é um JFrame.\n tem como fazer chamar mas ficaria um arquivo muito grande", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "O programa não foi encontrado:\n" + nomeClasse, "Erro", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao abrir o programa:\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            });
            menu.add(item);
        } 

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> new MenuPrincipal().setVisible(true));
        }
        
}