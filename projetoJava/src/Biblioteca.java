import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Exemplar> exemplares; // Lista de exemplares disponíveis na biblioteca
    private ArrayList<Usuario> usuarios; // Lista de usuários cadastrados na biblioteca
    private ArrayList<Funcionario> funcionarios; // Lista de funcionários cadastrados na biblioteca

    // Construtor da classe Biblioteca.
    public Biblioteca() {
        this.exemplares = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    // Método para cadastrar um exemplar na biblioteca.
    public void cadastrarExemplar(Livro livro) {
        exemplares.add(new Exemplar(livro));
    }

    // Método para cadastrar um usuário na biblioteca.
    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para cadastrar um funcionário na biblioteca.
    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    // Método para realizar o empréstimo de um exemplar para um usuário.
    public void realizarEmprestimo(Usuario usuario, Exemplar exemplar, LocalDate dataInicio, LocalDate dataPrevistaDevolucao) {
        Emprestimo emprestimo = new Emprestimo(exemplar, usuario, dataInicio, dataPrevistaDevolucao);
        usuario.getHistoricoEmprestimos().add(emprestimo);
    }

    // Método para realizar a devolução de um exemplar por parte do usuário.
    public void realizarDevolucao(Usuario usuario, int idExemplar) {
        for (Emprestimo emprestimo : usuario.getHistoricoEmprestimos()) {
            if (!emprestimo.isDevolvido() && emprestimo.getExemplar().getId() == idExemplar) {
                emprestimo.setDevolvido(true); // Atualiza o status de devolução para true
                System.out.println("Devolução realizada com sucesso.");
                return; // Sai do método após encontrar o empréstimo correspondente
            }
        }
        // Se o empréstimo não for encontrado, exibe uma mensagem de erro
        System.out.println("Livro não encontrado nos empréstimos do usuário ou já foi devolvido.");
    }

    // Método para obter a lista de exemplares disponíveis na biblioteca.
    public ArrayList<Exemplar> getExemplaresDisponiveis() {
        return exemplares;
    }

    // Método para obter a lista de usuários cadastrados na biblioteca.
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    // Método para obter a lista de funcionários cadastrados na biblioteca.
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}

