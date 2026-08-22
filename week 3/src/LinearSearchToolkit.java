public class LinearSearchToolkit {
    public boolean contains(int[] values, int target)
    {
        for(int i = 0; i<values.length; i++)
        {
            if(values[i] == target)
            {
                return true;
            }
        }
        return false;
    }
    public int firstIndexOf(int[] values, int target)
    {
        for(int i = 0; i<values.length ; i++)
        {
            if(values[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(int[] values, int target)
    {
        for(int i = values.length ; i<=0; i++)
        {
            if(values[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    public int countOccurrences(int[] values, int target)
    {
        int count = 0;

        for(int i = 0; i< values.length ;) //why i++ was removed from here by vs code?
            {
            if(values[i]==target)
            {
                count++;
            }
            return count;
        }
        return 0;
    }
}
