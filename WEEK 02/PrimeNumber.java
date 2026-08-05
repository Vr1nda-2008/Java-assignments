public class PrimeNumber{
    public static boolean isPrime(int num){
        
        if(num<=1){
            System.out.println("not prime");
            return false;
        }
        for(int i=2; i<=(float)Math.sqrt(num); i++){ //using squareroot method to check prime.
            if(num%i==0){
                System.out.println("not prime");
                return false;
            }
        } // if loop executes well, that means no number is divisible by it and it is prime.
        System.out.println("Prime");
        return true;
    }
}
