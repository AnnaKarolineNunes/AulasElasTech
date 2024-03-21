package atividade03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // 1- Crie um programa que realize uma contagem regressiva de 10 até 1, mostrando cada número na tela.
        /*
        int numero = 10 ;

        while (numero >= 0 ){
            numero--;
            System.out.println(numero + 1);
        }
         */


        //2 - Escreva um programa que solicite um número ao usuário e exiba a tabuada desse número de 1 a 10.
        /*
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            int tabuada = numero * i;
            System.out.println(numero + " x " + i + " = " + tabuada);
        }
         */


        //3 - Desenvolva um algoritmo que calcule a soma dos números pares de 1 a 100.

        /*

        int somaPares =0;
        for (int i = 1; i <= 100; i += 2) {
               somaPares += i ;

        }
        System.out.println("A soma dos numeros pares de 1 a 100 é " + somaPares);
         */


        //4 - Escreva um programa que verifique se um número digitado pelo usuário é primo ou não.

        /*
        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

         */

        //5 - Implemente um algoritmo que exiba os primeiros 20 números da sequência de Fibonacci.

        /*
        // Inicializando os dois primeiros números da sequência
        int n = 20; // Número de termos da sequência a serem exibidos
        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");
        System.out.print(primeiroTermo + " " + segundoTermo + " ");

        for (int i = 2; i < n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(proximoTermo + " ");
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

         */

        // 6 - Faça um programa que solicite ao usuário números inteiros positivos. Quando o usuário digitar um número negativo
        // , o programa deve exibir a média dos números inseridos até aquele momento.

        /*
        int soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite um número inteiro positivo (ou um número negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                if (contador == 0) {
                    System.out.println("Nenhum número positivo foi inserido.");
                } else {
                    double media = (double) soma / contador;
                    System.out.println("A média dos números inseridos é: " + media);
                }
                break;
            } else {
                soma += numero;
                contador++;
            }
        }

         */


        //7 - Crie uma calculadora simples que permita ao usuário realizar operações de soma, subtração, multiplicação e divisão
        // entre dois números, utilizando um laço de repetição para continuar operando até que o usuário decida sair.

        /*
        System.out.println("Digite um numero:");
        Double n1 = scanner.nextDouble();

        System.out.println("Digite outro numero:");
        Double n2 = scanner.nextDouble();

        while (true){
            System.out.println("Digite o número da operação que deseja iniciar: \n " +
                    "1- Soma \n" +
                    "2- Subtração \n" +
                    "3- Divisão \n"+
                    "4- multiplicação \n" +
                    "5- SAIR \n");
            int opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida){
                case 1:
                    scanner.nextLine();
                    System.out.println("Iniciando operação de soma:");
                    Double soma = n1 + n2;
                    System.out.println("Operação de soma realizada. " + " O resultado é : "+ soma);
                    break;
                case 2:
                    //scanner.nextLine();
                    System.out.println("iniciando operação de subtração. ");
                    Double subtracao = n1- n2;
                    System.out.println("Operação de subtração realizada. " + " O resultado é : "+ subtracao);
                    break;
                case 3:
                    //scanner.nextLine();
                    System.out.println("Iniciando operação de divisao:");
                    Double divisao = n1 / n2;
                    System.out.println("Operação de divisao realizada. " + " O resultado é : "+ divisao);
                    break;
                case 4:
                    //scanner.nextLine();
                    System.out.println("Iniciando operação de multiplicação:");
                    Double multiplicacao = n1 * n2;
                    System.out.println("Operação de multiplicação realizada. " + " O resultado é : "+ multiplicacao);
                    break;
                case 5:
                    //scanner.nextLine();
                    System.out.println("SAINDO....");
                    return;
                default:
                    System.out.println("Digite uma opçao válida.");
            }
        }

         */

        //8 - Implemente um jogo no qual o programa escolhe um número aleatório entre 1 e 100, e o jogador deve tentar adivinhá-lo.
        // O programa deve fornecer dicas do tipo "maior" ou "menor" conforme necessário.

        /*
        Random random = new Random();
        int randomNumero = random.nextInt(100)+1;
        int  chuteJogador = 0;
        int tentativas = 0;

        do {
            System.out.println("Tente adivinhar o numero gerado de 0 a 100: ");
            chuteJogador = scanner.nextInt();
            tentativas++;
            if (chuteJogador == randomNumero){
                System.out.println("Parabens, vc acertou o numero!");
            } else if (chuteJogador < randomNumero) {
                System.out.println("Tente um numero maior");
            }else {
                System.out.println("tente um numero menor");
            }

        }while (chuteJogador != randomNumero);

         */

        //9 -  Escreva um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa, solicitando ao
        // usuário qual conversão deseja fazer. O programa deve continuar executando até que o usuário decida sair.


        /*
        while (true){

            System.out.println("Digite o número da operação que deseja iniciar: \n " +
                    "1- Converter Celsius para Fahrenheit \n" +
                    "2- Converter Fahrenheit para Celsius  \n" +
                    "3- SAIR \n");
            int opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida){
                case 1:
                    System.out.println("Digite a temperatura em Celcius: ");
                    Double tempCelcius = scanner.nextDouble();
                    Double tempFahrenheit = (tempCelcius * 9/5) + 32;
                    System.out.println("A temperatura em Fahrenheit é : " + tempFahrenheit);
                    break;
                case 2:
                    System.out.println("Digite a temperatura em Fahrenheit: ");
                    tempFahrenheit = scanner.nextDouble();
                    tempCelcius = (tempFahrenheit - 32)/1.8;
                    System.out.println("A temperatura em graus Celcius é : " + tempCelcius);
                    break;
                case 3:
                    System.out.println("SAINDO...");
                    return;
                default:
                    System.out.println("Digite uma opção válida.");
            }

        }
         */


        //10 - Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras. O programa deve exibir a lista de compras atualizada
        // após cada inserção e perguntar se o usuário deseja adicionar mais itens. O programa deve continuar executando até que o usuário decida sair.

        ArrayList<String> listaCompras = new ArrayList<>();
        while (true) {
            System.out.println("Escolha a opção desejada: \n " +
                    " 1 - Add item \n " +
                    " 2 - SAIR \n");
            int opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Insira um item na sua lista de compras:");
                    String item = scanner.nextLine();
                    listaCompras.add(scanner.nextLine());
                    System.out.println("Item " + item + " registrado com sucesso");
                    System.out.println(" Sua lista de compras até o momento:");
                    System.out.println(listaCompras);

                    break;
                case 2:
                    System.out.println("Apagando sua lista de compras");
                    return;
                default:
                    System.out.println("Digite uma opção válida.");
            }


        }


    }
}
