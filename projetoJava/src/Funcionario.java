import java.time.LocalDate;

// Classe que representa um funcionário da biblioteca.
public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private LocalDate dataAdmissao;

    // Construtor da classe Funcionario.
    public Funcionario(String nome, int idade, String cpf, String cargo, double salario, LocalDate dataAdmissao) {
        super(nome, idade, cpf); // Chama o construtor da superclasse Pessoa
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    // Métodos getters e setters para acessar e modificar os atributos cargo, salario e dataAdmissao.
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
