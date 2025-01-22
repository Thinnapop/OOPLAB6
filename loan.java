package LAB_6.Chap1;
public class loan {
    protected double loan;

    public loan(){

    }
    public loan(double loan){
        this.loan = loan;
    }
    public String toString(){
        return "Loan amount: $"+loan;
    }
}
