public class CoffeeMachine {
        private int waterTank;
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
            waterTank = 100;
            CoffeeFilter = true;
            BeanHopper = 100;
            MilkTank = 100;
            MachineStatus = true;
            Cleanliness = true; 
            CatArt = "/\_/\ 
                     ( o.o )
                      > ^ <"
             
            SmileyArt = " o    o 
                            ∆     
                         \______/ "
            
            HeartArt = " ***    ***
                        ***** ******
                       **************
                        ************
                          ********
                            ***
                             *   "
                          
        }

        public String MakeCoffee(String DrinkType)
        {
            if (MachineStatus == true)
            {
                if (waterTank > 100)
                {
                    System.out.println("Machine heating up...");
                    System.out.println("Making a " + DrinkType + " for you!");
                    WaterTank - 10;
                    MilkTaknk - 10;
                    BeanHopper - 10;
                }
            }

            else
            {
                System.out.println("You can't make any drinks right now because the machine is off! Turn off the machine")
            }
        }

        public int getWaterTank()
        {
            return waterTank;
        }

        public void int fillWaterTank()
        {
        
            System.out.println("Filling the water tank up...");
            waterTank == 100;
            System.out.println("Water tank is full!");
        
        }

        public int getMilktank()
        {
            return MilkTank;
        }

        public void int fillMilkTank()
        {
            System.out.println("Filling the milk tank up...");
            MilkTank == 100;
            System.out.println("Milk tank is full!");
        }

        public int getBeanBin
        {
            return BeanBin;
        }

        public void int fillBeanHopper()
        {
            System.out.println("Filling the bean hopper up...");
            BeanHopper == 100;
            System.out.println("Bean hopper is full!");
        }

        public boolean getMachineStatus()
        {
            return MachineStatus;
        }

        public void boolean setMachineStatus(boolean input)
        {
            if (MachineStatus == true && input == true)
            {
                System.out.println("Machine is already on!")
            }
            else if (MachineStatus == false && input == true)
            {
                System.out.println("Machine turning on!");
            }
            else if (MachineStatus == true && input == false)
            {
                MachineStatus == false;
                System.out.println("Turning the coffee machine off...");
            }
        }

        public void Askdesign()
        {
            System.out.println("Latte art options: Heart, Cat, Smiley Face");
        }

        public void String PrintDesign(String ArtOption)
        {
            System.out.println("You choose: " + ArtOption + " to add to your latte");
            System.out.prrintln("Making Design...");
            Milktank - 2;
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

