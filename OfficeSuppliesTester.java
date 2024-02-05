public class OfficeSuppliesTester {
    public static void main(String[] args) 
    {
        int testsPassed = 0;
        System.out.println("TESTING COFFEE MACHINE");
        System.out.println();

        System.out.println("Creating a new coffee machine...");
        CoffeeMachine cm = new CoffeeMachine();
        testsPassed++;
        System.out.println(testsPassed + "/9 tests passed");
        System.out.println();

        System.out.println("Checking Machine Status...");
        cm.getMachineStatus();
        testsPassed++;
        System.out.println(testsPassed + "/9 tests passed");
        System.out.println();

        System.out.println("Turning on machine");
        cm.setMachineStatus(true);
        testsPassed++;
        System.out.println(testsPassed + "/9 tests passed");
        System.out.println();

        System.out.println("Checking water tank...");
        cm.getWaterTank();
        testsPassed++;
        System.out.println(testsPassed + "/9 tests passed");
        System.out.println();

        System.out.println("Checking milk tank...");
        cm.getMilktank();
        testsPassed++;
        System.out.println(testsPassed + "/9 tests passed");
        System.out.println();

        System.out.println("Checking bean hopper...");
        cm.getBeanHopper();
        testsPassed++;
        System.out.println(testsPassed + "/9 tests passed");
        System.out.println();

        System.out.println("Making a latte...");
        cm.MakeCoffee("latte");
        testsPassed++;
        System.out.println(testsPassed + "/9 tests passed");
        System.out.println();

        System.out.println("Getting options for latte art");
        cm.Askdesign();
        testsPassed++;
        System.out.println(testsPassed + "/9 tests passed");
        System.out.println();

        System.out.println("Choosing Cat Art for latte!");
        cm.PrintDesign("Cat");
        testsPassed++;
        System.out.println(testsPassed + "/9 tests passed");
        System.out.println();
    }
}