package aula2103.atividade01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Suprimentos suprimento1 = new Suprimentos("fone de ouvido","fone samsung sem fio" , 250.00,7);
        System.out.println(suprimento1.getIdItem());
        System.out.println(suprimento1.getDescricao());
        System.out.println("Valor por item "+ suprimento1.getValorItem());
        System.out.println("Quantidade comprada "+ suprimento1.getQtdeComprada());

        suprimento1.getInvoiceAmount();



    }
}
