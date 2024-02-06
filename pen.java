public class pen {
        private int inkAmount;
        private String inkColor;
        private int clickcount;
        //instance variables


        /**
        * Constructs a pen with an ink amount, ink color, and click count
        */
        public pen() 
        {
            inkAmount = 100;
            inkColor = "Black";
            clickcount = 0;
        }

        /**
         * returns ink left in pen
         * @return inkAmount ink left in pen
         */
        public int getInkAmount()
        {
            return inkAmount;
        }
        /**
         * returns color of pen
         * @return inkColor color of pen
         */
        public String getColor()
        {
            return inkColor;
        }
        /**
         * returns click count of pen
         * @return clickcount number of times pen has been clicked 
         */
        public int getclickcount()
        {
            return clickcount;
        }

        /**
         * clicks pen a certain number of times
         * @param amount number of times pen will be clicked
         */
        public void click(int amount)
        {
            clickcount = clickcount + amount;
        }

}