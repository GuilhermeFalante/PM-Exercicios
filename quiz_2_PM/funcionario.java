package quiz_2_PM;
public class funcionario extends pessoaFisica {
    private String cargo;
    private double salario;
    private String presidente;

    public funcionario(String nome, String endereco, String telefone, String cep, String cidade, String uf, String cpf, String cargo, double salario) {
        super(nome, endereco, telefone, cep, cidade, uf, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * percentual / 100.0;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setSalario(String presidente) {
        this.presidente = presidente;
    }
    
}