package app;
import java.time.LocalDate;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private static final int[] numDias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] diasDaSemana = { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira",
			"Sexta-feira", "Sábado", "Domingo" };
	private static final int[] numMesSemana = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
	private static final String[] nomeMeses = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho",
			"agosto", "setembro", "outubro", "novembro", "dezembro" };
	public static int cont = 0;

	public Data() {
		dia = LocalDate.now().getDayOfMonth();
		mes = LocalDate.now().getMonthValue();
		ano = LocalDate.now().getYear();
		cont++;
	}

	public Data(int dia, int mes, int ano) {
		this.setAno(ano);
		this.setMes(mes);
		this.setDia(dia);
		cont++;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if ((dia > 0) && (dia <= numDias[mes - 1] || (this.anoBisexto() && dia == 29)))
			this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if ((mes > 0) && (mes <= 12))
			this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano > 1900)
			this.ano = ano;
	}

	public boolean anoBisexto() {
		return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
	}

	public int diasNoMes() {
		return numDias[mes - 1];
	}

	public String diaDaSemana() {
		int a = (this.ano - 1900);
		int b = a / 4;
		b = ((this.anoBisexto() && this.mes <= 2) ? b - 1 : b);
		int c = numMesSemana[this.mes - 1];
		int d = (a + b + c + this.dia - 1) % 7;
		return Data.diasDaSemana[d];
	}
	
	public String porExtenso() {
		return this.dia + " de " + Data.nomeMeses[this.mes-1] + " de " + this.ano;
	}

	public void adicionaDias(int n) {
		this.dia += n;

		while (dia > ((anoBisexto() && mes == 2) ? 29 : numDias[mes - 1])) {
			dia -= ((anoBisexto() && mes == 2) ? 29 : numDias[mes - 1]);
			mes++;
			if (mes > 12) {
				mes -= 12;
				ano++;
			}
		}
	}

	public void finalize() throws Throwable {
		cont--;
	}
}
