package atividade02.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2.
        //Peça dois números ao usuário e realize operações de adição, subtração, multiplicação e divisão. Exiba os resultados.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        Double n1 = scanner.nextDouble();

        System.out.println("Digite outro numero");
        Double n2 = scanner.nextDouble();

        Double adicao = n1 + n2;
        Double subtracao = n1 - n2;
        Double multiplicacao = n1 * n2;
        Double divisao = n1/n2 ;
        System.out.println(n1 + " + " + n2 + " = " + adicao);
        System.out.println(n1 + " - " + n2 + " = " + subtracao);
        System.out.println(n1 + " * " + n2 + " = " + multiplicacao);
        System.out.println(n1 + " / " + n2 + " = " + divisao);


    }
}
