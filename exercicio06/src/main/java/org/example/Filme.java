
package org.example;

public class Filme {

    private String nome;
    private int preco;
    private int idadeMinima;

    public Filme(String nome, int preco, int idadeMinima) {
        this.nome = nome;
        this.preco = preco;
        this.idadeMinima = idadeMinima;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }
}
