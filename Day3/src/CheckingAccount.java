public class CheckingAccount extends Account {
    //String name = "Checking Account";

    public CheckingAccount(int initial){
        setAmount(initial);
    }
    public void withdraw(int minus){
        setAmount(-minus);
    };
}

