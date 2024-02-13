public class Main {
    public static void main(String[] args) {

        double balanceInitial = 5000;
        double interestRate = 0.17;
        double interestFirstMonth = 0;
        double interestSecondMonth = 0;

        System.out.println("Your initial credit card balance is " + balanceInitial);

        interestFirstMonth = balanceInitial * interestRate;
        System.out.println("Your first month's interest is " + interestFirstMonth);

        interestSecondMonth = (interestFirstMonth + balanceInitial) * interestRate;
        System.out.println("Your second month interest is " + interestSecondMonth);
    }
}