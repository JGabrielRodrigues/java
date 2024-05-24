// Classe que representa um livro na biblioteca.
public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;

    // Construtor da classe Livro.
    public Livro(String titulo, String autor, String editora, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    // Métodos para acessar e modificar o atributo titulo.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos para acessar e modificar o atributo autor.
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Métodos para acessar e modificar o atributo editora.
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    // Métodos para acessar e modificar o atributo anoPublicacao.
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
