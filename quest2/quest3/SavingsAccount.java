package Abstract.quest2.quest3;

public class SavingsAccount extends BankAccount{
    private float creditSavings;
    
    public SavingsAccount(float credit, float creditSavings){
        super(credit);
        setCredit(creditSavings);
    }

    @Override
    public void deposit(float x) {
        x += getCreditSavings();
        setCreditSavings(x);
    }

    @Override
    public void withdraw(float x) {
        x -= getCreditSavings();
        setCreditSavings(x);
    }

    public float getCreditSavings() {
        return creditSavings;
    }

    public void setCreditSavings(float creditSavings) {
        this.creditSavings = creditSavings;
    }
}
