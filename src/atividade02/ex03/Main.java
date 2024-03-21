package atividade02.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //3.
        //Crie um programa que verifica se um número digitado pelo usuário é positivo, negativo ou zero.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        Double numero = scanner.nextDouble();

        if (numero > 0){
            System.out.println("O número é positivo");
        }else if (numero < 0){
            System.out.println("O número é negativo");
        }else if (numero == 0 ){
            System.out.println("O numero é zero");
        }
    }
}
