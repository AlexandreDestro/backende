package org.example;

public class Musica {
    public String nome;
    public String artista;
    //construtor
    public Musica(String nome, String artista) {
        System.out.print("construtor inicializado");
        this.nome = nome;
        this.artista = artista;
    }

    //getter
    public String getNome() {
        return this.nome;
    }
    public String getArtista() {
        return this.artista;
    }

    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setArtista(String nome) {
        this.artista = artista;
    }

}
