package aula1903.exercicioSemMetodo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //System.out.println("Crie uma lista de tarefas:");
        //listaTarefas.add(scanner.next());


        ArrayList<String> listaTarefas = new ArrayList<>();

        while (true){
            System.out.println("Escolha a opção desejada: \n " +
                    " 1 - Add Tarefas \n " +
                    " 2 - Remover Tarefas\n"+
                    " 3 - Listar as Tarefas ");
            int opcaoEscolhida = scanner.nextInt();
            System.out.println(opcaoEscolhida);

            switch (opcaoEscolhida){
                case 1: // add
                    scanner.nextLine();
                    System.out.println("Digite uma tarefa  ");
                    String tarefa = scanner.nextLine();
                    listaTarefas.add(scanner.nextLine());
                    System.out.println("Cadastrado com sucesso");
                    break;

                case 2: // remover tarefas

                    System.out.println("Excluir tarefa");

                    for(int i = 0 ; i < listaTarefas.size() ; i++){
                        System.out.println(" Indice "+ (i+1) + " Tarefa : "+ listaTarefas.get(i));
                    }
                    System.out.println("Digite o numero da tarefa que quer apagar");
                    int apagar = scanner.nextInt();
                    listaTarefas.remove((apagar-1));
                    System.out.println("Tarefa apagada com sucesso");
                    break;
                case 3:// listar as pendentes

                    System.out.println("Mostrando as tarefas cadastradas");
                    for (String tarefasMostrar : listaTarefas){
                        System.out.println(tarefasMostrar);
                    }
                    System.out.println("Mostrar");
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
