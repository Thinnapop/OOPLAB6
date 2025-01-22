
public class test {
    public static void main(String[] args) {
        bank b1 = new bank(111,5000);

        System.out.println("Account ID: "+ b1.getId());
        System.out.println("Initial balance: "+b1.getBalance());
        System.out.println("Date created on: "+b1.getDate());
        
        b1.deposit(3000);

        System.out.println("Balance after deposit: "+b1.getBalance());

        b1.withdraw(2000);

        System.out.println("Balance after withdraw: "+b1.getBalance());

        b1.setAnnualInterestRate(3.5);

        System.out.println("Monthly Interest Rate: "+b1.getMonthlyInterestRate()+" %");
        System.out.println("Monthly Interest: "+b1.getMonthlyInterest());
    }
}
