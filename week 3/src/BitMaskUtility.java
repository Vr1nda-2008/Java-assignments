public class BitMaskUtility {
    public boolean isBitSet(int number, int position) 
    {

        if ((number >> position & 1) == 1) 
        {
            System.out.println("true");
            return true;
        }
        return false;
    }
    public int setBit(int number, int position) 
    {
        return number | (1 << position);
    }
    public int clearBit(int number, int position) {
        return number & ~(1 << position);
    }
    public int toggleBit(int number, int position) {
        return number ^ (1 << position);
    }

}
