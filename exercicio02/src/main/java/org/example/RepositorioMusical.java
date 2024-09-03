package org.example;
import java.util.ArrayList;

public class RepositorioMusical {
    private ArrayList<Musica> listaMusica = new ArrayList<Musica>();

    public void adicionarMusica(String nome, String artista) {
        Musica musica = new Musica(nome, artista);
        listaMusica.add(musica);
    }

    public Musica buscarMusica(String termo) throws RuntimeException{
        for (Musica item : listaMusica) {
            if (item.getNome().equals(termo)) return item;
        }
        throw new RuntimeException("música não encontrada");
    }
}
