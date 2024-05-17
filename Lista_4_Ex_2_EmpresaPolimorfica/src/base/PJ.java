package base;

import java.util.Arrays;

public class PJ extends Pessoa {
	private byte[] cnpj;

	public byte[] getCnpj() {
		return cnpj;
	}

	public void setCnpj(byte[] cpf) {
		this.cnpj = cpf;
	}

	public PJ(String nome, String endereco, String telefone, byte[] cnpj) {
		super(nome, endereco, telefone);
		this.setCnpj(cnpj);
	}
	
	@Override
	public boolean equals(Object pessoa) {
		if (pessoa instanceof PJ)
			return ((PJ) pessoa).getCnpj().equals(this.cnpj);
		else return false;
	}

	@Override
	public String toString() {
		return "PJ [cnpj=" + Arrays.toString(cnpj) + ", " + super.toString() + "]";
	}


}














