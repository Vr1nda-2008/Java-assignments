// TASK - 01
public class ArrayStatistics {

    public void Sum(int[] values) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public double average(int[] values) {
        int sum = 0;
        int l = values.length;

        for (int i = 0; i < l; i++) {
            sum += i;
        }

        double avg = sum / l;
        System.out.print("avg");
        return avg;
    }

    public int minimum(int[] values) {
        int i = 0;
        int min = Integer.MAX_VALUE;

        for (; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        System.out.print(min);
        return min;
    }

    public int maximum(int[] values) {
        int i = 0;
        int max = Integer.MIN_VALUE;

        for (; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        System.out.print(max);
        return max;
    }

    public int countEven(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print(count);
        return count;
    }

    public void printSignCounts(int[] values) {
        int paw = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                paw++;
            } else if (values[i] < 0) {
                neg++;
            } else if (values[i] == 0){
                zero++;
            }
        }
        System.out.println("Zero: " + zero);
        System.out.println("Positive numbers: " + paw);
        System.out.println("Negative numbers: " + neg);
    }

}
