package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.Conta;



public class ContaTest {
	Conta c1;
	double saldo;

	
	@BeforeEach
	public void setUp() throws Exception {
		c1 = new Conta(1000.00,1);
		saldo = c1.getSaldo();
	}

	@Test
	public void testSacarComSaldo() {
		
		double valor = 200.00;
		c1.sacar(valor);
		assertEquals(800.00, c1.getSaldo(), 0.0001);
	}

	@Test
    public void testSacarSemSaldo() {
        double valor = 1200.00;
        c1.sacar(valor);
        assertEquals(1000.00, c1.getSaldo(), 0.001);
    }
	
	@Test
	public void testSacarNegativo() {
		c1.sacar(-1);
		assertEquals(saldo, c1.getSaldo(), 0.00001);
	}
	
}














