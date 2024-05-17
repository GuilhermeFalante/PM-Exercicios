package quiz_2_PM;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class pessoaJuridicaTest {

    @Test
    public void testGetCnpj() {
        String cnpj = "12.345.678/0001-90";
        pessoaJuridica pessoa = new pessoaJuridica("Empresa A", "Rua X", "123456789", "12345", "Cidade", "UF", cnpj);
        assertEquals(cnpj, pessoa.getCnpj());
    }

    @Test
    public void testSetCnpj() {
        String cnpj = "98.765.432/0001-21";
        pessoaJuridica pessoa = new pessoaJuridica("Empresa B", "Rua Y", "987654321", "54321", "Cidade2", "UF2", "");
        pessoa.setCnpj(cnpj);
        assertEquals(cnpj, pessoa.getCnpj());
    }

}
