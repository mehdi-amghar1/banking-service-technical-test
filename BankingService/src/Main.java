import model.Account;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        //account.deposit(-100);
        //account.withdraw(5000);


        account.printStatement();
    }
}