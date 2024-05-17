package quiz_3_PM;

public class ExcecaoMesInvalido extends ExcecaoDataInvalida{
    
    public ExcecaoMesInvalido(int mes){
        super("O mes "+ mes +" está inválido,tente novamente entre 1 e 12");
    }
}
