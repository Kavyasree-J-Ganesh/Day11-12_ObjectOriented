package object_oriented_program.account;

public class Account {
    int accountBalance;                  // Instance variable

    void debitFromBalance(int debitAmount){    // Instance method
        if(this.accountBalance < debitAmount){
            System.out.println("Debit amount exceeded account balance");
        }else{
           this.accountBalance = this.accountBalance - debitAmount;
            System.out.println(" Account balance after Amount debit : " + this.accountBalance );
        }
    }
    public static void main(String[] args) {
        Account sbi = new Account();       // creating the instance of Account class
        sbi.accountBalance = 25000;        // assigning value to instance variable.
        sbi.debitFromBalance(10000);
        sbi.debitFromBalance(20000);
    }
}
