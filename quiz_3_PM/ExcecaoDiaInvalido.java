package quiz_3_PM;

public class ExcecaoDiaInvalido extends ExcecaoDataInvalida{
    
    public ExcecaoDiaInvalido(int dia){
        super("O dia " + dia + "está invalido,tente novamente");
    }
}
