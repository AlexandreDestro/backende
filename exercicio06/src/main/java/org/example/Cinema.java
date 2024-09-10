
package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    //Listas
    List<Filme> filmesDisponiveis = new ArrayList<>(); //filmes
    List<String> assentosDisponiveis; //assentos
    List<Ingresso> ingressosVendidos = new ArrayList<>(); //ingressos

    public Cinema() {
        this.assentosDisponiveis = gerarAssentos();
    }

    //Gerar os assentos
    private List<String> gerarAssentos() {
        List<String> assentos = new ArrayList<>();
        for (char fila = 'A'; fila <= 'F'; fila++) {
            for (int numero = 1; numero <= 5; numero++) {
                assentos.add(fila + Integer.toString(numero));
            }
        }
        return assentos;
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public Filme buscarFilmePorNome(String nome) {
        for (Filme filme : filmesDisponiveis) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null;
    }

    public void venderIngresso(Ingresso ingresso) throws Exception {

        //caso esteja ocp o assento escolhido
        if (!assentosDisponiveis.contains(ingresso.getAssento())) {
            throw new Exception("Assento indisponível!");
        }

        //caso a idade n permita
        if (ingresso.getCliente().getIdade() < ingresso.getFilme().getIdadeMinima()) {
            throw new Exception("Idade não permitida para este filme!");
        }

        ingressosVendidos.add(ingresso);
        assentosDisponiveis.remove(ingresso.getAssento());
        System.out.println("Ingresso para o filme " + ingresso.getFilme().getNome() + " vendido para " + ingresso.getCliente().getNome() + " no assento " + ingresso.getAssento());

    }

    public List<String> getAssentosDisponiveis() {
        return assentosDisponiveis;
    }
}

