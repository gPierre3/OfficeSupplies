public class Apple
{
    
    private int bitesLeft;
    

    public Apple()
    {
        bitesLeft = 10;
        
    }
    public int getBitesLeft();
        {
            return bitesLeft;
        }
    
    public int bite(int amount)
        {
            bitesLeft = bitesLeft - amount;

        }
    public int newApple()
    {
        if(bitesLeft == 0)
        {
            bitesLeft = 10;
        }

    


}