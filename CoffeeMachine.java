public class CoffeeMachine {
        private int WaterTank;
        private boolean CoffeeFilter;
        private int BeanHopper;
        private int MilkTank;
        private boolean MachineStatus;
        private boolean Cleanliness;
        private String CatArt;
        private String HeartArt;
        private String SmileyArt;
        //private String DrinkType
        
        public CoffeeMachine() 
        {
            WaterTank = 100;
            CoffeeFilter = true;
            BeanHopper = 100;
            MilkTank = 100;
            MachineStatus = false;
            Cleanliness = true; 
            CatArt = " /\\_/\\\n( o.o )\n > ^ <";
             
            SmileyArt = " o    o \n                            ∆     \n                         \\______/ ";
            
            HeartArt = " ***   *** \n                        ***** ***** \n                       ************* \n                        *********** \n                         ********\n                            ***\n                             *   ";                          
        }

        public void MakeCoffee(String DrinkType)
        {
            if (MachineStatus == true)
            {
                if (WaterTank > 100)
                {
                    System.out.println("Machine heating up...");
                    System.out.println("Making a " + DrinkType + " for you!");
                    WaterTank = WaterTank - 10;
                    MilkTank = MilkTank - 10;
                    BeanHopper = BeanHopper - 10;
                }
            }

            else
            {
                System.out.println("You can't make any drinks right now because the machine is off! Turn off the machine");
            }
        }

        public int getWaterTank()
        {
            return WaterTank;
        }

        public void fillWaterTank()
        {
        
            System.out.println("Filling the water tank up...");
            WaterTank = 100;
            System.out.println("Water tank is full!");
        
        }

        public int getMilktank()
        {
            return MilkTank;
        }

        public void fillMilkTank()
        {
            System.out.println("Filling the milk tank up...");
            MilkTank = 100;
            System.out.println("Milk tank is full!");
        }

        public int getBeanHopper()
        {
            return BeanHopper;
        }

        public void fillBeanHopper()
        {
            System.out.println("Filling the bean hopper up...");
            BeanHopper = 100;
            System.out.println("Bean hopper is full!");
        }

        public boolean getMachineStatus()
        {
            return MachineStatus;
        }

        public void setMachineStatus(boolean input)
        {
            if (MachineStatus == true && input == true)
            {
                System.out.println("Machine is already on!");
            }
            else if (MachineStatus == false && input == true)
            {
                System.out.println("Machine turning on!");
            }
            else if (MachineStatus == true && input == false)
            {
                MachineStatus = false;
                System.out.println("Turning the coffee machine off...");
            }
        }

        public void Askdesign()
        {
            System.out.println("Latte art options: Heart, Cat, Smiley Face");
        }

        public void PrintDesign(String ArtOption)
        {
            System.out.println("You choose: " + ArtOption + " to add to your latte");
            System.out.println("Making Design...");
            MilkTank = MilkTank - 2;
            System.out.println("Finished adding art. Enjoy your drink!");
            if (ArtOption.equals("Heart"))
            {
                System.out.println(HeartArt);
            }
            else if (ArtOption.equals("Cat"))
            {
                System.out.println(CatArt);
            }
            else if (ArtOption.equals("Smiley Face"))
            {
                System.out.println(SmileyArt);
            }


    }
}

