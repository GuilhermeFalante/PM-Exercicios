package quiz_3_PM;

public class ExcecaoAnoInvalido extends ExcecaoDataInvalida{
    public ExcecaoAnoInvalido(int ano){
        super("O ano "+ ano +" está inválido,tente novamente com um número positivo");
    }
}
