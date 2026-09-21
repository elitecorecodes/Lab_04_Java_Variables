public class HomeMaintenanceCalculator {
    public static void main(String[] args) {


        //Declare variables
        double springCost = 100.00;
        double summerCost = 150.00;
        double fallCost = 200.00;
        double winterCost = 250.00;
        double yearlyTotal = 0.0;




        System.out.println("Spring maintenance cost : $" + springCost);
        System.out.println("Summer maintenance cost : $" + summerCost);
        System.out.println("Fall maintenance cost : $" + fallCost);
        System.out.println("Winter maintenace cost : $" + winterCost);
        yearlyTotal = springCost + summerCost + fallCost + winterCost;
        System.out.println("Total yearly maintenace cost : $" + yearlyTotal);

    }

}