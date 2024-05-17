package quiz_2_PM;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class empresaTest {
    @Test
    public void testAddCliente() {
        empresa empresa = new empresa();
        cliente cliente = new cliente("João", "Rua A", "12345678", "11111", "Belo Horizonte", "MG", 1000.0);
        empresa.addCliente(cliente);
        assertEquals(1, empresa.getClientes().size());
    }

    @Test
    public void testAddFuncionario() {
        empresa empresa = new empresa();
        funcionario funcionario = new funcionario("Maria", "Rua B", "87654321", "22222", "Belo Horizonte", "MG", "123.456.789-00", "Gerente", 5000.0);
        empresa.addFuncionario(funcionario);
        assertEquals(1, empresa.getFuncionarios().size());
    }

    @Test
    public void testSetPresidente() {
        empresa empresa = new empresa();
        funcionario presidente = new funcionario("Carlos", "Rua C", "11223344", "33333", "Belo Horizonte", "MG", "987.654.321-00", "Presidente", 10000.0);
        empresa.setPresidente(presidente);
        assertEquals(presidente, empresa.getPresidente());
    }
}
