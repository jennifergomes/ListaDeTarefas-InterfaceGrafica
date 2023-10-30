package listadetarefas;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListaDeTarefasForm extends JFrame {

    // Atributos
    private JPanel painel = new JPanel();
    private JButton jButtonAdicionar = new JButton("Adicionar tarefa");
    private JButton jButtonRemover = new JButton("Remover tarefa");
    private JButton jButtonListar = new JButton("Listar tarefas");


    // Construtor
    public ListaDeTarefasForm() {
        this.setTitle("*** Aplicativo de Lista de Tarefas ***");
        this.setSize(400, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 255, 255));

        ArrayList<String> tarefas = new ArrayList<String>();

        jButtonAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tarefa = JOptionPane.showInputDialog(null, "Digite a tarefa a ser adicionada: ");
                tarefas.add(tarefa);
                JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");

            }
        });

        jButtonRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String removerTarefa = JOptionPane.showInputDialog(null, "Informe o número da tarefa que deseja remover:");
                int removerTarefaInt = Integer.parseInt(removerTarefa);

                tarefas.remove(removerTarefaInt);

                JOptionPane.showMessageDialog(null, "Tarefa removida com sucesso!");

            }
        });

        jButtonListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String tarefaLista="";
                int i = 0;
                for (String lista : tarefas) {

                    tarefaLista+= "Tarefa %d- %s \n".formatted(i, lista)+ "\n";
                    i++;
                }
                JOptionPane.showMessageDialog(null, tarefaLista);
            }
        });


        painel.add(jButtonAdicionar);
        painel.add(jButtonRemover);
        painel.add(jButtonListar);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir janela
    }

    public static void main(String[] args) {
        new ListaDeTarefasForm();
    }
}


