public class GreatestCommonDivisor {
    public static int gcd(int first, int second) {
        if (first < 0 || second < 0) {
            first = Math.abs(first);
            second = Math.abs(second);
        }

        if (second == 0) {
            return first;
        }

        do {
            int remainder = first % second;
            first = second;
            second = remainder;

        } while (second != 0);

        System.out.println("the greatest common divisor : " + first);
        return first;
    }
}