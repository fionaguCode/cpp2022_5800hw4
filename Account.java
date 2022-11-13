
public class Account {
    private AccountHolder holder;
    private float balance = 0;

    public Account(float amt, AccountHolder holder){
        this.balance = amt;
        this.holder = holder;
    }


    public void deposit(float amt){
        this.balance += amt;
    }

    public void withdraw(float amt){
        this.balance -= amt;
    }

    public float getBalance(){
        return this.balance;
    }

    public AccountHolder getHolder(){
        return this.holder;
    }

    public void setBalance(float amt){
        this.balance = amt;
    }

    public void setHolder(AccountHolder holder){
        this.holder = holder;
    }


}