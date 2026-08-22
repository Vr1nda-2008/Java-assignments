public class ArrayTransformations 
{
    public void reverseInPlace(int[] values)
    {
        int size = values.length;
        for(int i = 0; i<size/2; i++)
        { 
            int temporary = values[i];
           values[i]= values[size - 1-i];
            values[size-i-1]= temporary;
        }
        System.out.println(values);
    }
    
}
