package quiz_2_PM;
public class cliente extends pessoa{

    private double limiteCredito;

    public cliente(String nome, String endereco, String telefone, String cep, String cidade, String uf,double limiteCredito) {
        super(nome, endereco, telefone, cep, cidade, uf);
        this.limiteCredito = limiteCredito;
    }
    public double getLimiteCredito(){
        return limiteCredito;
    }
    public void setLimiteCredito(double limiteCredito){
        this.limiteCredito = limiteCredito;
    }
    public void aumentarLimite(double valor) {
        this.limiteCredito += valor;
    }
}
