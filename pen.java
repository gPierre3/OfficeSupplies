public class pen {
        private int inkAmount;
        private String inkColor;
        private int clickcount;



        public pen() 
        {
            inkAmount = 100;
            inkColor = "Black";
            clickcount = 0;
        }

        public int getInkAmount()
        {
            return inkAmount;
        }

        public String getColor()
        {
            return inkColor;
        }
        public int getclickcount()
        {
            return clickcount;
        }

        public void click(int amount)
        {
            clickcount = clickcount + amount;
        }

}