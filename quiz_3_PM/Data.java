package quiz_3_PM;

import java.util.Random;

public class Data implements Ordenavel {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) throws ExcecaoDataInvalida {
      setDia(dia);
      setMes(mes);
      setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws ExcecaoDiaInvalido{
        if (dia < 1 || dia > 31) {
            throw new ExcecaoDiaInvalido(dia);
        }
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws ExcecaoMesInvalido{
        if (mes < 1 || mes > 12) {
            throw new ExcecaoMesInvalido(mes);
        }
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) throws ExcecaoAnoInvalido {
        if (ano < 0) {
            throw new ExcecaoAnoInvalido(ano);
        }
        this.ano = ano;
    }

    @Override
    public boolean menorQue(Ordenavel o) {
        Data outraData = (Data) o;
        if (ano != outraData.ano)
            return ano < outraData.ano;
        if (mes != outraData.mes)
            return mes < outraData.mes;
        return dia < outraData.dia;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }

    // Método para gerar Data aleatoria porque nao tem lista nenhuma com datas,foi nescessario.
    public static Data gerarDataAleatoria() throws ExcecaoDataInvalida {
        Random rand = new Random();
        int dia = rand.nextInt(30) + 1;
        int mes = rand.nextInt(12) + 1;
        int ano = rand.nextInt(100) + 2000;
        return new Data(dia, mes, ano);
    }

}