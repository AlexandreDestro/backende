@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String apelido;
    private int habilidade = 100;  // valor padrão

    // getters e setters
}
