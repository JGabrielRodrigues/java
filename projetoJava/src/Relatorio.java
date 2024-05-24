import java.util.ArrayList;

public class Relatorio {

    public static void gerarRelatorioEmprestimos(ArrayList<Usuario> usuarios) {
        System.out.println("Relatório de Empréstimos:");
        for (Usuario usuario : usuarios) {
            boolean temEmprestimoAtivo = false; // Inicializa a variável para cada usuário
            for (Emprestimo emprestimo : usuario.getHistoricoEmprestimos()) {
                System.out.println("---------------");
                System.out.println("Usuário: " + usuario.getNome());
                System.out.println("ID do Exemplar: " + emprestimo.getExemplar().getId());
                System.out.println("Título: " + emprestimo.getExemplar().getLivro().getTitulo());
                System.out.println("Data de Início: " + emprestimo.getDataInicio());
                System.out.println("Data Prevista de Devolução: " + emprestimo.getDataPrevistaDevolucao());
                System.out.println("Devolvido: " + (emprestimo.isDevolvido() ? "Sim" : "Não"));
                System.out.println("---------------");
                
                if (!emprestimo.isDevolvido()) {
                    temEmprestimoAtivo = true; // Se encontrar um empréstimo não devolvido, marca como ativo
                }
            }
            
            // Se o usuário não tiver empréstimos ativos, inclui a mensagem no relatório
            if (!temEmprestimoAtivo) {
                System.out.println("Usuário " + usuario.getNome() + " não possui empréstimos ativos.");
                System.out.println("---------------");
            }
        }
    }

    public static void gerarRelatorioLivrosDisponiveis(ArrayList<Exemplar> exemplares, ArrayList<Usuario> usuarios) {
        System.out.println("Relatório de Livros Disponíveis:");
        for (Exemplar exemplar : exemplares) {
            if (!foiEmprestado(exemplar, usuarios)) { // Verifica se o exemplar não foi emprestado
                Livro livro = exemplar.getLivro();
                System.out.println("ID do Exemplar: " + exemplar.getId());
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Editora: " + livro.getEditora());
                System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
                System.out.println("---------------");
            }
        }
    }

    private static boolean foiEmprestado(Exemplar exemplar, ArrayList<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            for (Emprestimo emprestimo : usuario.getHistoricoEmprestimos()) {
                if (emprestimo.getExemplar().getId() == exemplar.getId() && !emprestimo.isDevolvido()) {
                    return true; // O exemplar foi emprestado e não foi devolvido
                }
            }
        }
        return false; // O exemplar não foi emprestado
    }
}
