import java.time.LocalDate;
import java.util.Scanner;

// Classe principal que controla o fluxo do programa.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(); // Instancia a classe Biblioteca para gerenciar a biblioteca

        Scanner scanner = new Scanner(System.in); // Cria um scanner para entrada de dados
        int opcao; // Variável para armazenar a opção escolhida pelo usuário

        // Loop principal para exibir o menu e aguardar a entrada do usuário
        do {
            // Exibe o menu de opções
            System.out.println("1. Cadastrar Exemplar");
            System.out.println("2. Cadastrar Usuario");
            System.out.println("3. Realizar Emprestimo");
            System.out.println("4. Realizar Devolucao");
            System.out.println("5. Relatorio de Emprestimos");
            System.out.println("6. Relatorio de Livros Disponiveis");
            System.out.println("0. Sair");
            System.out.println();

            opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário

            // Realiza uma ação com base na opção escolhida
            switch (opcao) {
                case 1:
                    // Código para cadastrar um novo exemplar na biblioteca
                    System.out.println("Digite o título do livro:");
                    scanner.nextLine(); // Consumir a nova linha
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o autor do livro:");
                    String autor = scanner.nextLine();
                    System.out.println("Digite a editora do livro:");
                    String editora = scanner.nextLine();
                    System.out.println("Digite o ano de publicação do livro:");
                    int anoPublicacao = scanner.nextInt();
                    Livro livro = new Livro(titulo, autor, editora, anoPublicacao);
                    biblioteca.cadastrarExemplar(livro);
                    break;
                case 2:
                    // Código para cadastrar um novo usuário na biblioteca
                    System.out.println("Digite o nome do usuário:");
                    scanner.nextLine(); // Consumir a nova linha
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade do usuário:");
                    int idade = scanner.nextInt();
                    System.out.println("Digite o CPF do usuário:");
                    scanner.nextLine(); // Consumir a nova linha
                    String cpf = scanner.nextLine();
                    System.out.println("Digite o número de matrícula do usuário:");
                    String numeroMatricula = scanner.nextLine();
                    Usuario usuario = new Usuario(nome, idade, cpf, numeroMatricula);
                    biblioteca.cadastrarUsuario(usuario);
                    break;
                case 3:
                    // Código para realizar um novo empréstimo na biblioteca
                    System.out.println("Digite o número de matrícula do usuário:");
                    scanner.nextLine(); // Consumir a nova linha
                    String matricula = scanner.nextLine();
                    System.out.println("Digite o ID do exemplar:");
                    int idExemplar = scanner.nextInt();
                    Usuario usuarioEmprestimo = null;
                    Exemplar exemplarEmprestimo = null;

                    // Encontra o usuário e o exemplar com base nas entradas do usuário
                    for (Usuario u : biblioteca.getUsuarios()) {
                        if (u.getNumeroMatricula().equals(matricula)) {
                            usuarioEmprestimo = u;
                            break;
                        }
                    }

                    for (Exemplar e : biblioteca.getExemplaresDisponiveis()) {
                        if (e.getId() == idExemplar) {
                            exemplarEmprestimo = e;
                            break;
                        }
                    }

                    // Realiza o empréstimo se o usuário e o exemplar forem encontrados
                    if (usuarioEmprestimo != null && exemplarEmprestimo != null) {
                        LocalDate dataInicio = LocalDate.now();
                        LocalDate dataPrevistaDevolucao = dataInicio.plusWeeks(2);
                        biblioteca.realizarEmprestimo(usuarioEmprestimo, exemplarEmprestimo, dataInicio, dataPrevistaDevolucao);
                        System.out.println("Empréstimo realizado com sucesso.");
                    } else {
                        System.out.println("Usuário ou exemplar não encontrado.");
                    }
                    break;
                case 4:
                    // Código para realizar uma devolução na biblioteca
                    System.out.println("Digite o número de matrícula do usuário:");
                    scanner.nextLine(); // Consumir a nova linha
                    String matriculaDevolucao = scanner.nextLine();
                    System.out.println("Digite o ID do exemplar devolvido:");
                    int idExemplarDevolucao = scanner.nextInt();

                    Usuario usuarioDevolucao = null;
                    for (Usuario u : biblioteca.getUsuarios()) {
                        if (u.getNumeroMatricula().equals(matriculaDevolucao)) {
                            usuarioDevolucao = u;
                            break;
                        }
                    }

                    if (usuarioDevolucao != null) {
                        biblioteca.realizarDevolucao(usuarioDevolucao, idExemplarDevolucao);
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 5:
                    // Código para gerar o relatório de empréstimos
                    Relatorio.gerarRelatorioEmprestimos(biblioteca.getUsuarios());
                    break;
                case 6:
                    // Código para gerar o relatório de livros disponíveis
                    Relatorio.gerarRelatorioLivrosDisponiveis(biblioteca.getExemplaresDisponiveis(), biblioteca.getUsuarios());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}









