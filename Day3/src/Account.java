public class Account {
    private int balance=0;
    private String name = "Account 1";

    public void deposit(int dep){
     balance=balance+dep;
    };
    public String getName(){
      return name;
    };

    public void setAmount(int a){
        balance=balance+a;
    };
    public int getAmount(){
        return balance;
    };

}
