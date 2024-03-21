package atividade02.ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //6 -
        //Desenvolva um programa em Java para simular um sistema de pedidos de uma loja online. O programa deve:
        //
        //1. Solicitar ao usuário que insira o valor total de sua compra.
        //2. Com base nesse valor, aplicar descontos conforme as seguintes regras:
        //Se o valor for maior que R$ 200, aplique um desconto de 10%.
        //Se o valor estiver entre R$ 100 e R$ 200, aplique um desconto de 5%.
        //Caso contrário, não aplique desconto.
        //3. Exiba o valor final a ser pago pelo usuário após o desconto.
        //Além disso, implemente um menu utilizando um switch para permitir ao usuário escolher o método de pagamento:
        //Opção 1: Cartão de crédito
        //Opção 2: Boleto bancário
        //Opção 3: Transferência bancária

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor total da sua compra");
        Double compraTotal = scanner.nextDouble();

        if (compraTotal > 200){
            Double desconto10 = compraTotal *0.1;
            System.out.println("O valor final a ser pago é " + desconto10);
        }else if ( (compraTotal >= 100) &&(compraTotal <= 200)){
            Double desconto5 = compraTotal * 0.05;
            System.out.println("O valor final a ser pago é " + desconto5);
        }else {
            System.out.println("O valor final a ser pago é " + compraTotal);
        }

        System.out.println("Opção 1 : Cartão de crédito");
        System.out.println("Opção 2 : Boleto bancário");
        System.out.println("Opção 3 : Transferência bancária");

        System.out.println("Qual o meio de pagamento");
        int pagamento = scanner.nextInt();

        switch (pagamento){
            case 1:
                System.out.println("Opção 1 escolhida: Cartão de crédito");
                break;
            case 2:
                System.out.println("Opção 2 escolhida: Boleto bancário");
                break;
            case 3:
                System.out.println("Opção 3 escolhida: Transferência bancária");
                break;

            default:
                System.out.println("numero Inválido. Digite novamente.");
        }


    }
}
