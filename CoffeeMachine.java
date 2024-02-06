public class CoffeeMachine {
        private int WaterTank;
        private int BeanHopper;
        private int MilkTank;
        private boolean MachineStatus;
        private String CatArt;
        private String HeartArt;
        private String SmileyArt;
        // instance variables in here


        /**
          * Constructs a coffee machiine with a full water tank,
          * milk tank, and bean hopper. The machine starts as off. 
          * Latte art also constructed.
          */
        public CoffeeMachine() 
        {
            WaterTank = 100;
            BeanHopper = 100;
            MilkTank = 100;
            MachineStatus = false;
            CatArt = " /\\_/\\\n( o.o )\n > ^ <";
             
            SmileyArt = " o    o \n                            ∆     \n                         \\______/ ";
            
            HeartArt = " ***   *** \n                        ***** ***** \n                       ************* \n                        *********** \n                         ********\n                            ***\n                             *   ";                          
        }

        /**
        * makes whatever drink is inputted. 
        * Making drink uses milk, water, and beans.
        * @param DrinkType type of drink user wants to be made
        */  
        public void MakeCoffee(String DrinkType)
        {
            if (MachineStatus == true)
            {
                if (WaterTank > 10)
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
                System.out.println("You can't make any drinks right now because the machine is off!");
            }
        }

        /**
        * returns water left in water tank
        * @return WaterTank amount of water out of 100 left
        */
        public int getWaterTank()
        {
            return WaterTank;
        }

        /**
        * fills water tank back to full (100)
        */
        public void fillWaterTank()
        {
        
            System.out.println("Filling the water tank up...");
            WaterTank = 100;
            System.out.println("Water tank is full!");
        
        }

        /**
        * returns milk left in water tank
        * @return MilkTank amount of milk out of 100 left
        */
        public int getMilktank()
        {
            return MilkTank;
        }

        /**
        * fills milk tank back to full (100)
        */
        public void fillMilkTank()
        {
            System.out.println("Filling the milk tank up...");
            MilkTank = 100;
            System.out.println("Milk tank is full!");
        }

        /**
        * returns beans left in Bean hopper
        * @return BeanHopper amount of beans out of 100 left
        */
        public int getBeanHopper()
        {
            return BeanHopper;
        }

        /**
        * fills bean hopper back to full (100)
        */
        public void fillBeanHopper()
        {
            System.out.println("Filling the bean hopper up...");
            BeanHopper = 100;
            System.out.println("Bean hopper is full!");
        }

        /**
         * returns machine status as a boolean
         * @return Machiine Status either off (false) or on (true)
         */
        public boolean getMachineStatus()
        {
            return MachineStatus;
        }

        /**
        * sets machine status based on user input
        * @param input boolean that determines machine status
        */  
        public void setMachineStatus(boolean input)
        {
            if (MachineStatus == true && input == true)
            {
                System.out.println("Machine is already on!");
            }
            else if (MachineStatus == false && input == true)
            {
                MachineStatus = true;
                System.out.println("Machine powered on!");
            }
            else if (MachineStatus == true && input == false)
            {
                MachineStatus = false;
                System.out.println("Turning the coffee machine off...");
            }
        }

        /**
         * asks user what design they want to add to their desired drink
         */
        public void Askdesign()
        {
            System.out.println("Latte art options: Heart, Cat, Smiley Face");
        }

        /**
         * prints out art option based on input
         * @param ArtOption the option the user chooses for their drink's art
         */
        public void PrintDesign(String ArtOption)
        {
            System.out.println("You chose: " + ArtOption + "art to add to your latte");
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

