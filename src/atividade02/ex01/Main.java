package atividade02.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Solicite o nome e a idade do usuário. Em seguida, exiba uma mensagem com essas informações.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite sua idade:");
        //String idade = scanner.next();

        //System.out.println("Nome:" + nome + ". Idade:" + idade);

        System.out.println((scanner.nextInt() >= 18) ? "Voce é maior de idade": "Voce é menor de idade");

    }
}
