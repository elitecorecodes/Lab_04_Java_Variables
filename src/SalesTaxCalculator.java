public class SalesTaxCalculator{

    public static void main(String[] args) {

        //Declare variables
        double purchasePrice = 100;
        double taxRate = 0.05;
        double salesTax = 0.0;

        //Calculate sales tax
        salesTax = purchasePrice * taxRate;

        //Display results
        System.out.println("Purchase price : $" + purchasePrice);
        System.out.println("Sales tax (5%) : $" + salesTax);
    }







}



