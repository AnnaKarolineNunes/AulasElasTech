package atividade02.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //4.
        //Solicite ao usuário um dia da semana (em formato numérico de 1 a 7) e exiba o nome correspondente usando um bloco switch.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        switch (numero){
            case 1:
                System.out.println("O dia da semana é : domingo ");
                break;
            case 2:
                System.out.println("O dia da semana é : segunda ");
                break;
            case 3:
                System.out.println("O dia da semana é : terça");
                break;
            case 4:
                System.out.println("O dia da semana é : quarta");
                break;
            case 5:
                System.out.println("O dia da semana é : quinta");
                break;
            case 6:
                System.out.println("O dia da semana é : sexta");
                break;
            case 7:
                System.out.println("O dia da semana é : sábado");
                break;
            default:
                System.out.println("O numero digitado é inválido. Tente outro.");
        }
    }
}
