package ClassesAndObjects;

  /*
    Create Account class with field 'double balance'
    create 'deposit(double amount)' method which adds amount to balance
    create 'withdraw(double amount)' method which subtracts the amount from the balance
  */

class Client {
    String name;
    Account account;
}

class Account {
    private double balance;

    void deposit(double amount) {
        System.out.println("Your balance is: " + balance);
        balance += amount;
        System.out.println("Your new balance is: " + balance);
        System.out.println("------ Thanks for banking with us.------------");
    }

    void withdraw(double amount) {
        balance -= amount;
    }
}



  /*
    Create Client class with fields 'String name' and 'Account account'
   */


public class BankAccount {

    public static void main(String[] args) {
        /*
        Let the user deposit and withdraw some amount of money as the way you wish
        Provide necessary information about the transaction like "Dear clientName, your new balance is"
          or "not enough balance" etc.
         */

        Client client1 = new Client();

        client1.name = "Techno Study";
        client1.account = new Account();

        client1.account.deposit(53.28);

//        client1.account.balance = 100_000;

        client1.account.deposit(45.89);
        client1.account.deposit(89.36);
        client1.account.deposit(896.45);

    }
}
