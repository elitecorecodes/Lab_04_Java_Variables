public class CreditCardInterestCalculator {
    public static void main(String[] args) {


        // Declare variables
        double balance = 5000.00;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12;
        double firstMonthInterest = 0.0;
        double secondMonthInterest = 0.0;


        // Calculate interest after one month
        firstMonthInterest = balance * monthlyInterestRate;


        // Update balance (no paymenets made)
        balance = balance + firstMonthInterest;

        // Calculate interest after two months
        secondMonthInterest = balance * monthlyInterestRate;

        // Display results
        System.out.printf("First month interest: $%.2f%n", firstMonthInterest);

        System.out.printf("Second month interest: $%.2f%n", secondMonthInterest);
        }
    }

