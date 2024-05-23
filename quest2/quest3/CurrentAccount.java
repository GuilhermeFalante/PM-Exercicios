package Abstract.quest2.quest3;

public class CurrentAccount extends BankAccount{
    
    public CurrentAccount(float credit){
        super(credit);
    }

    @Override
    public void deposit(float x) {
        setCredit(getCredit() + x);
        System.out.println("Depositou " + x + " na conta corrente");
    }

    @Override
    public void withdraw(float x) {
        setCredit(x - getCredit());
        System.out.println("Retirou " + x + " da conta corrente");
    }

}
