// Classe que representa uma cópia específica de um livro na biblioteca.
public class Exemplar {
    private static int contador = 0; // Variável estática para atribuir IDs únicos aos exemplares
    private int id; // ID único do exemplar
    private Livro livro; // Livro associado ao exemplar

    // Construtor da classe Exemplar.
    public Exemplar(Livro livro) {
        this.id = ++contador; // Aumenta o contador de IDs e atribui ao ID do exemplar atual
        this.livro = livro;
    }

    // Métodos getters para acessar os atributos id e livro.
    public int getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }
}
