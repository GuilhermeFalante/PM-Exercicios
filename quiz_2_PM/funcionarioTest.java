package quiz_2_PM;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class funcionarioTest {
    @Test
    public void testSalario() {
        funcionario funcionario = new funcionario("João", "Rua das Flores", "12345678", "30000-000", "Belo Horizonte", "MG", "123.456.789-00", "Gerente", 5000.0);
        assertEquals(5000.0, funcionario.getSalario());

        funcionario.aumentarSalario(10.0);
        assertEquals(6600.0, funcionario.getSalario(), "O salário após o aumento está incorreto");
    }
}
