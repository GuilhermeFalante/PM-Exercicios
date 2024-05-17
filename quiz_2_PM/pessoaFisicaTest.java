package quiz_2_PM;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class pessoaFisicaTest {

    @Test
    public void testGetCpf() {
        String cpf = "123.456.789-10";
        pessoaFisica pessoa = new pessoaFisica("Fulano", "Rua A", "123456789", "12345", "Cidade", "UF", cpf);
        assertEquals(cpf, pessoa.getCpf());
    }

    @Test
    public void testSetCpf() {
        String cpf = "987.654.321-00";
        pessoaFisica pessoa = new pessoaFisica("Ciclano", "Rua B", "987654321", "54321", "Cidade2", "UF2", "");
        pessoa.setCpf(cpf);
        assertEquals(cpf, pessoa.getCpf());
    }

}
