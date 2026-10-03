class Main {


    public static void main(String[] args) {

        // Declare variables
        int intOperandA = 2;
        int intOperandB = 7;
        int intSum = 11;
        int intProduct = 21;
        int intDifference = 50;
        int intQuotient = 10;
        int intModulo  = 35;

        // Declare double variables
        double doubleOperandA = 2.50;
        double doubleOperandB = 1.25;
        double doubleSum = 5.25;
        double doubleProduct = 14.50;
        double doubleDifference = 10.75;
        double doubleQuotient = 25.50;


        // Integer arithmetic operations
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);

        // Double
        //
        // arithmetic operations
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using double of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using double of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using double of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using double of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);




    }

}