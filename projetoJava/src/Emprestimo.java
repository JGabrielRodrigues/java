import java.time.LocalDate;

// Classe que representa um empréstimo de um exemplar para um usuário.
public class Emprestimo {
    private Exemplar exemplar;
    private Usuario usuario;
    private LocalDate dataInicio;
    private LocalDate dataPrevistaDevolucao;
    private boolean devolvido;

    // Construtor da classe Emprestimo.
    public Emprestimo(Exemplar exemplar, Usuario usuario, LocalDate dataInicio, LocalDate dataPrevistaDevolucao) {
        this.exemplar = exemplar;
        this.usuario = usuario;
        this.dataInicio = dataInicio;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
        this.devolvido = false; // Define o status de devolução como falso por padrão
    }

    // Métodos getters para acessar os atributos exemplar, usuario, dataInicio, dataPrevistaDevolucao e devolvido.
    public Exemplar getExemplar() {
        return exemplar;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    // Método setter para atualizar o status de devolução do empréstimo.
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
}
