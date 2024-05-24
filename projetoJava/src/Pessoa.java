// Classe que representa uma pessoa genérica com atributos como nome, idade e CPF.
public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    // Construtor da classe Pessoa.
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Métodos para acessar e modificar o atributo nome.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos para acessar e modificar o atributo idade.
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos para acessar e modificar o atributo cpf.
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
