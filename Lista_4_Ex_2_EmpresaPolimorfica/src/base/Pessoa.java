package base;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}

	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
	}

	@Override
	public boolean equals(Object pessoa) {
		if (pessoa instanceof Pessoa)
			return ((Pessoa) pessoa).nome.equalsIgnoreCase(this.nome);
		else return false;
	}

	
}










