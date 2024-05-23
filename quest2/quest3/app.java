package Abstract.quest2.quest3;

public class app {
    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount(500);
        ca.withdraw(50);
        ca.deposit(100);
        System.out.println(ca.getCredit());
    }
}
