/**
 * The apple class describes an apple for the tester. 
 * tracks number of bites eaten.
 */


public class Apple
{
    //instance variab;es
    private int bitesLeft;

    /**
     * Constructs an apple with a number of bites left.
     */
    public Apple()
    {
        bitesLeft = 10;
        
    }

    /**
     * returns bites left in apple
     * @return bitesLeft in apple
     */
    public int getBitesLeft()
        {
            return bitesLeft;
        }

    /**
    * takes away bites left in apple by a certain amount
    * @param amount amount of bites to be taken
    */   
    public void bite(int amount)
        {
            bitesLeft = bitesLeft - amount;
        }
    /**
    * creates a new apple by resetting bitesLeft of apple back to ten
    */   
    public void newApple()
    {
        if(bitesLeft == 0)
        {
            bitesLeft = 10;
        }
        System.out.println("You got a new apple ready for biting!");
    }
}
