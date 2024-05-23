package Abstract.quest2.quest3;

public abstract class BankAccount {
    private float credit;

    public abstract void deposit(float x);
    public abstract void withdraw(float x);
    
    public BankAccount(float credit){
        this.credit = credit;
    }
    public float getCredit() {
        return credit;
    }
    public void setCredit(float credit) {
        this.credit = credit;
    }
}
