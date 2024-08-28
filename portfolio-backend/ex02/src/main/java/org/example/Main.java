package org.example;

public class Main {
    Musica musica = new Musica("Musica", "joao");

    RepositorioMusical alo = new RepositorioMusical();

    //cadastrando musicas
    alo.adicionarMusica("nome1", "artista1");
    alo.adicionarMusica("nome2", "artista2");
    alo.adicionarMusica("nome3", "artista3");

    //pedir nome da musica


    //buscar musica
try{
    Musica musicaPesquisada = alo.buscarMusica(termo);
    //imprime a musica
        System.out.print(musicaPesquisada.getNome() + " " + musicaPesquisada.getArtista());
    }   catch (RuntimeException exception) {
            System.out.print(exception.getMessage());
    }
    //

}
