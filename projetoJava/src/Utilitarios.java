import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Classe com métodos utilitários.
public class Utilitarios {
    // Método para validar o CPF.
    public static boolean validarCPF(String cpf) {
        // Implementação de validação de CPF
        return true; // Simplificado para este exemplo
    }

    // Método para calcular a diferença em dias entre duas datas.
    public static long calcularDiasEntreDatas(LocalDate inicio, LocalDate fim) {
        return ChronoUnit.DAYS.between(inicio, fim);
    }
}
