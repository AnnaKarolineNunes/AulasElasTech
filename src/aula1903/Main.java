package aula1903;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> listaTarefas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void adicionarTarefas(){
        scanner.nextLine();
        System.out.println("Entrei no adicionar");
        System.out.println("Digite uma tarefa  ");
        listaTarefas.add(scanner.nextLine());
        System.out.println("Cadastrado com sucesso");
    }
    public static void removerTarefas(){

        for(int i = 0 ; i < listaTarefas.size() ; i++){
            System.out.println(" Indice "+ (i+1) + " Tarefa : "+ listaTarefas.get(i));
        }
        System.out.println("Digite o numero da tarefa que quer apagar");
        int apagar = scanner.nextInt();
        listaTarefas.remove((apagar-1));
        System.out.println("Tarefa apagada com sucesso");

    }

    public static void listarTarefasPendentes(){

        System.out.println("Mostrando as tarefas cadastradas");
        for (String tarefasMostrar : listaTarefas){
            System.out.println(tarefasMostrar);
        }
        System.out.println("Mostrar");

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Escolha a opção desejada: \n " +
                    " 1 - Add Tarefas \n " +
                    " 2 - Remover Tarefas\n"+
                    " 3 - Listar as Tarefas ");
            int opcaoEscolhida = scanner.nextInt();
            System.out.println(opcaoEscolhida);

            switch (opcaoEscolhida){
                case 1: // add
                    adicionarTarefas();
                    break;

                case 2: // remover tarefas
                    removerTarefas();
                    break;
                case 3:// listar as pendentes
                    listarTarefasPendentes();
                    break;
                case 4:
                    System.out.println("Sair");
                    return;
                default:
                    System.out.println("Digite uma opcao valida ");

            }
        }


    }
}
