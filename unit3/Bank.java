package unit3;

public class Bank {
    private int balance = 999999;

    public int getBalance(){
        return balance;
    }

    public void setBalance(int b){
        if(b <= 0){
            System.out.println("Unable to set balance...");
            return;
        }
        balance = b;
    }

}
