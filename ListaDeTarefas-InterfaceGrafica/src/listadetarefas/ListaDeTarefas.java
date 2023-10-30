package listadetarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<String>();
        Scanner ler = new Scanner(System.in);
        int opcao = -1;
        do {
            String msg = """
                    \n*** Aplicativo de Lista de Tarefas ***
                    \n1. Adicionar tarefa
                    2. Remover tarefa
                    3. Listar tarefas
                    4. Sair
                    """;
            System.out.println(msg);
            System.out.println("Escolha uma opção:");
            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite a tarefa a ser adicionada: ");
                    String tarefa = ler.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("\nTarefa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.printf("\nInforme o número da tarefa que deseja remover: ");
                    int removerTarefa = ler.nextInt();
                    tarefas.remove(removerTarefa);
                    System.out.println("\nTarefa removida com sucesso!");
                    break;
                case 3:
                    System.out.println("Lista: ");
                    int i = 0;
                    for (String lista : tarefas) {
                        System.out.printf("Tarefa %d- %s \n", i, lista);
                        i++;
                    }
                    break;

                case 4:
                    System.out.println("Saindo do aplicativo!");

                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }
}