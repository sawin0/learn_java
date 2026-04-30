package unit3;

public class EncapuslationExample {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.getBalance());
        bank.setBalance(-900);
        System.out.println(bank.getBalance());
        bank.setBalance(1000);
        System.out.println(bank.getBalance());
    }
}
