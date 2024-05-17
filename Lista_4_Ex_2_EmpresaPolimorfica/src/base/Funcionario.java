package base;

public class Funcionario {
	private PF dados;
	private String cargo;
	private float salario;

	public PF getDados() {
		return dados;
	}

	public void setDados(PF dados) {
		this.dados = dados;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Funcionario(PF dados, String cargo, float salario) {
		this.dados = dados;
		this.cargo = cargo;
		this.salario = salario;
	}

	public Funcionario(String nome, String endereco, String telefone, byte[] cpf, String cargo, float salario) {
		this.dados = new PF(nome, endereco, telefone, cpf);
		this.cargo = cargo;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [dados=" + dados + ", cargo=" + cargo + ", salario=" + salario + "]";
	}


	
}









