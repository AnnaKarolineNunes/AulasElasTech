package atividade02.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //5.
        //
        //"Escreva um programa em Java que solicita ao usuário um número inteiro. Com base nesse número, o programa deve realizar as seguintes ações:
        //
        //1. Se o número for positivo, armazene-o em uma variável e exiba uma mensagem indicando que é positivo.
        //2. Se o número for negativo, armazene o valor absoluto em uma variável e exiba uma mensagem indicando que é negativo.
        //3. Utilize um bloco switch para verificar se o número é par ou ímpar. Exiba uma mensagem correspondente.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        if (numero > 0){
            int numeroPositivo = numero;
            System.out.println(numeroPositivo + " é um numero positivo");
        } else{
            int numeroNegativo = numero;
            System.out.println(numeroNegativo + " é um numero negativo");
        }

        switch (numero % 2) {
            case 0:
                System.out.println("O número é par.");
                break;
            case 1:
            case -1:
                System.out.println("O número é ímpar.");
                break;
        }

    }
}
