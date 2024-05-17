package quiz_2_PM;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class pessoaTest {

    @Test
    public void testGettersAndSetters() {
        pessoa pessoa = new pessoa("Fulano", "Rua Teste, 123", "123456789", "12345-678", "Cidade Teste", "UF");

        assertEquals("Fulano", pessoa.getNome());
        assertEquals("Rua Teste, 123", pessoa.getEndereco());
        assertEquals("123456789", pessoa.getTelefone());
        assertEquals("12345-678", pessoa.getCep());
        assertEquals("Cidade Teste", pessoa.getCidade());
        assertEquals("UF", pessoa.getUf());

        pessoa.setNome("Ciclano");
        pessoa.setEndereco("Outra Rua, 456");
        pessoa.setTelefone("987654321");
        pessoa.setCep("98765-432");
        pessoa.setCidade("Outra Cidade");
        pessoa.setUf("OU");

        assertEquals("Ciclano", pessoa.getNome());
        assertEquals("Outra Rua, 456", pessoa.getEndereco());
        assertEquals("987654321", pessoa.getTelefone());
        assertEquals("98765-432", pessoa.getCep());
        assertEquals("Outra Cidade", pessoa.getCidade());
        assertEquals("OU", pessoa.getUf());
    }
}