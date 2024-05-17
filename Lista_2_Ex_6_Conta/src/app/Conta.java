package app;

public class Conta {
	private double saldo;
	private int num;
	private static int cont = 0;
	
	public int getNum() {
		return num;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo){
		this.saldo = saldo;
	}
	
	public void sacar(double valor)
	{
		if (saldo >= valor && valor > 0)
			this.saldo -= valor;
	}
	
	public void depositar(double valor)
	{
		if (valor >= 0)
			this.saldo += valor;
	}
	public Conta(double saldo,int num) {
		this.saldo = saldo;
		this.num=num;
		num = ++cont;
	}

}













