package Encapsulation;


public class Encapsulation {

    // OOP principals
        /*
        Abstraction
        Polymorphism
        Inheritance
        Encapsulation
         */

    // What is encapsulation?
    // Why do we need encapsulate?
    /*
           - to protect data
           - to prevent inconsistencies
     */
    // How do we encapsulate?
    /*
        getter and setter methods
     */
    public static void main(String[] args) {
        AccountBalance checkingAccount = new AccountBalance(45_000);
        checkingAccount.withdraw(5_000);
    }

}

class AccountBalance {
    private int balance;
    private int age;

    public AccountBalance(int balance){
        this.balance = balance;
    }

public void setAge(int age){

      if(age >= 18)  {
          this.age = age;
      } else { this.age = -1;}
}

    public void withdraw (int amount){
        System.out.println("Your previous balance was: " + balance);
        balance -= amount;
        System.out.println("Your new balance is: " + balance);
    }


}
