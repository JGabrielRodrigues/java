import java.util.ArrayList;

// Classe que representa um usuário da biblioteca.
public class Usuario extends Pessoa {
    private String numeroMatricula;
    private ArrayList<Emprestimo> historicoEmprestimos;

    // Construtor da classe Usuario.
    public Usuario(String nome, int idade, String cpf, String numeroMatricula) {
        super(nome, idade, cpf); // Chama o construtor da superclasse Pessoa
        this.numeroMatricula = numeroMatricula;
        this.historicoEmprestimos = new ArrayList<>();
    }

    // Método para acessar o número de matrícula do usuário.
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    // Método para acessar o histórico de empréstimos do usuário.
    public ArrayList<Emprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }
}
