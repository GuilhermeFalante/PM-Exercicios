package quiz_2_PM;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class clienteTest {
    @Test
    public void testLimiteCredito() {
        cliente cliente = new cliente("João", "Rua das Flores", "12345678", "30000-000", "Belo Horizonte", "MG", 1000.0);
        assertEquals(1000.0, cliente.getLimiteCredito());
    }
}


