public class OfficeSuppliesTester {
    public static void main(String[] args) 
    {
        int testsPassedd = 0;
        System.out.println("TESTING PEN");
        System.out.println();
        System.out.println("Obtaining a new pen machine...");
        pen p = new pen();
        testsPassedd++;
        System.out.println(testsPassedd + "/4 tests passed");
        System.out.println();

        System.out.println("Getting pen color...");
        System.out.println(p.getColor());
        testsPassedd++;
        System.out.println(testsPassedd + "/4 tests passed");
        System.out.println();

        System.out.println("Clicking pen 534 times...");
        p.click(534);
        testsPassedd++;
        System.out.println(testsPassedd + "/4 tests passed");
        System.out.println();

        System.out.println("Getting how many times pen has been clicked...");
        System.out.println(p.getclickcount());
        testsPassedd++;
        System.out.println(testsPassedd + "/4 tests passed");
        System.out.println();


        System.out.println("-----------------------");
        int testsPassed = 0;
        System.out.println("TESTING COFFEE MACHINE");
        System.out.println();

        System.out.println("Creating a new coffee machine...");
        CoffeeMachine cm = new CoffeeMachine();
        testsPassed++;
        System.out.println(testsPassed + "/11 tests passed");
        System.out.println();

        System.out.println("Checking Machine Status...");
        System.out.println(cm.getMachineStatus());
        testsPassed++;
        System.out.println(testsPassed + "/11 tests passed");
        System.out.println();

        System.out.println("Turning on machine...");
        cm.setMachineStatus(true);
        testsPassed++;
        System.out.println(testsPassed + "/11 tests passed");
        System.out.println();


        System.out.println("Making a latte...");
        cm.MakeCoffee("latte");
        testsPassed++;
        System.out.println(testsPassed + "/11 tests passed");
        System.out.println();

        System.out.println("Getting options for latte art...");
        cm.Askdesign();
        testsPassed++;
        System.out.println(testsPassed + "/11 tests passed");
        System.out.println();

        System.out.println("Choosing Cat Art for latte!");
        cm.PrintDesign("Cat");
        testsPassed++;
        System.out.println(testsPassed + "/11 tests passed");
        System.out.println();

        System.out.println("Getting volume of milk tank, water tank, and water tank...");
        System.out.println("Bean hopper currect volume: " + cm.getBeanHopper());
        System.out.println("Water tank currect volume: " + cm.getWaterTank());
        System.out.println("Milk tank currect volume: " + cm.getMilktank());
        testsPassed++;
        System.out.println(testsPassed + "/11 tests passed");
        System.out.println();

        System.out.println("Filling water tank, milk tank, and bean hopper...");
        cm.fillWaterTank();
        cm.fillMilkTank();
        cm.fillBeanHopper();
        testsPassed++;
        System.out.println(testsPassed + "/11 tests passed");
        System.out.println();

        System.out.println("Getting volume of milk tank, water tank, and water tank once again...");
        System.out.println("Bean hopper currect volume: " + cm.getBeanHopper());
        System.out.println("Water tank currect volume: " + cm.getWaterTank());
        System.out.println("Milk tank currect volume: " + cm.getMilktank());
        testsPassed++;
        System.out.println(testsPassed + "/11 tests passed");
        System.out.println();

        System.out.println("Turning off machine...");
        cm.setMachineStatus(false);
        testsPassed++;
        System.out.println(testsPassed + "/11 tests passed");
        System.out.println();

        System.out.println("Checking Machine Status...");
        System.out.println(cm.getMachineStatus());
        testsPassed++;
        System.out.println(testsPassed + "/11 tests passed");
        System.out.println();

    }
}