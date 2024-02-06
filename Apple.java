public class Apple
{
    private int bitesLeft;

    public Apple()
    {
        bitesLeft = 10;
        
    }
    public int getBitesLeft()
        {
            return bitesLeft;
        }

    public void bite(int amount)
        {
            bitesLeft = bitesLeft - amount;
        }
    public void newApple()
    {
        if(bitesLeft == 0)
        {
            bitesLeft = 10;
        }
        System.out.println("You got a new apple ready for biting!");
    }
}
