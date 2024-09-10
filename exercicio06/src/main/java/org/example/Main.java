package org.example;

public class Main {
    public static void main(String[] args) {

        Cinema cinema = new Cinema();

        // Add filmes
        cinema.adicionarFilme(new Filme("A", 20, 10));
        cinema.adicionarFilme(new Filme("B", 25, 12));
        cinema.adicionarFilme(new Filme("C", 30, 14));
        cinema.adicionarFilme(new Filme("D", 35, 18));

        java.util.Scanner scanner = new java.util.Scanner(System.in);


        while (true) {

            System.out.print("Que filme você deseja assistir? ");
            System.out.print("[ A, B, C, D ] ");
            String filmeNome = scanner.nextLine();

            Filme filmeEscolhido = cinema.buscarFilmePorNome(filmeNome);
            if (filmeEscolhido == null) {
                System.out.println("Filme indisponível, tente escolher outro.");
                continue;
            }

            System.out.print("Qual assento você deseja? ");
            System.out.print("[ A1, A2, ... F5 ] ");
            String assentoEscolhido = scanner.nextLine();

            if (!cinema.getAssentosDisponiveis().contains(assentoEscolhido)) {
                System.out.println("Assento indisponível, tente escolher outro.");
                continue;
            }


            System.out.print("Qual o seu nome? ");
            String nome = scanner.nextLine();

            System.out.print("Qual sua idade? ");
            int idade = scanner.nextInt();
            scanner.nextLine();



            Cliente cliente = new Cliente(nome, idade);
            Ingresso ingresso = new Ingresso(cliente, filmeEscolhido, assentoEscolhido);

            //assento já vendido
            try {
                cinema.venderIngresso(ingresso);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.print("Deseja escolher outro filme? (s/n) ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }
        scanner.close();
    }
}
