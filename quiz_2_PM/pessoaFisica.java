package quiz_2_PM;
public class pessoaFisica extends pessoa{
    private String cpf;

    public pessoaFisica(String nome, String endereco, String telefone, String cep, String cidade, String uf, String cpf){
        super(nome, endereco, telefone, cep, cidade, uf);
        this.cpf = cpf;
}
public String getCpf() {
    return cpf;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}
}