package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] listafilmes = {"f1", "f2", "f3", "f4"};
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual ambientação você prefere? ");
        System.out.print("1 - Sci-Fi");
        System.out.print("2 - Medieval");
        Integer optambientacao = leitor.nextInt();

        System.out.print("Qual gênero você prefere? ");
        System.out.print("1 - comedia");
        System.out.print("2 - ação");
        Integer optgenero = leitor.nextInt();

        String filmerecomendado = listafilmes[optambientacao + optgenero - 2];


        /*
        if (optambientacao == 1 && optgenero == 1) System.out.print("f1");
        if (optambientacao == 1 && optgenero == 2) System.out.print("f2");
        if (optambientacao == 2 && optgenero == 1) System.out.print("f3");
        if (optambientacao == 2 && optgenero == 2) System.out.print("f4");
        */
    }
}