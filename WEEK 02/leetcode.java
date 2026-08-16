public class leetcode {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String sol : operations)
        {
            if (sol.contains("+")) 
            {
                x++;
            } 
            else 
            {
                x--;
            }
        }

        return x;
    }
}
