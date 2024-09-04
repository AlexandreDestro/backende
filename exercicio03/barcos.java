// Classe Barco
class Barco {
    private String nome;
    private int tamanho;

    public Barco(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }
}

// Classe BasePorto
class BasePorto {
    private String nome;
    private ArrayList<Barco> barcosAtracados;

    public BasePorto(String nome) {
        this.nome = nome;
        this.barcosAtracados = new ArrayList<>();
    }

    public void atracarBarco(Barco barco) {
        barcosAtracados.add(barco);
        System.out.println(barco.getNome() + " atracado no " + nome);
    }

    public void desatracarBarco(Barco barco) {
        if (barcosAtracados.remove(barco)) {
            System.out.println(barco.getNome() + " desatracado do " + nome);
        }
    }
}

// Classe PortoPequeno que herda de BasePorto
class PortoPequeno extends BasePorto {
    public PortoPequeno(String nome) {
        super(nome);
    }

    @Override
    public void atracarBarco(Barco barco) {
        if (barco.getTamanho() <= 10) {
            super.atracarBarco(barco);
        } else {
            System.out.println(barco.getNome() + " não pode atracar no " + this.getNome() + " (tamanho excede o permitido)");
        }
    }
}

// Classe PortoGrande que herda de BasePorto
class PortoGrande extends BasePorto {
    public PortoGrande(String nome) {
        super(nome);
    }

    @Override
    public void atracarBarco(Barco barco) {
        if (barco.getTamanho() >= 10) {
            super.atracarBarco(barco);
        } else {
            System.out.println(barco.getNome() + " não pode atracar no " + this.getNome() + " (tamanho menor que o permitido)");
        }
    }
}

// Classe principal para execução
public class Main {
    public static void main(String[] args) {
        // Criação dos barcos
        ArrayList<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("Barco 1", 2));
        barcos.add(new Barco("Barco 2", 5));
        barcos.add(new Barco("Barco 3", 7));
        barcos.add(new Barco("Barco 4", 12));
        barcos.add(new Barco("Barco 5", 20));

        // Criação dos portos
        PortoPequeno portoPequeno = new PortoPequeno("Porto Pequeno");
        PortoGrande portoGrande = new PortoGrande("Porto Grande");

        // Tentativa de atracagem dos barcos
        for (Barco barco : barcos) {
            // Tenta atracar primeiro no porto pequeno
            if (barco.getTamanho() <= 10) {
                portoPequeno.atracarBarco(barco);
            } else {
                // Caso contrário, tenta atracar no porto grande
                portoGrande.atracarBarco(barco);
            }
        }
    }
}
