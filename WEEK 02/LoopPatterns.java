public class LoopPatterns {
    public static void patternA(){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

public static void patternB(){
            System.err.println();

        for(int i= 1; i<=4; i++){
            for(int j=1; j<=i; j++){

                System.out.print("*\t");
            }
            System.out.println();
        }

}
    public static void patternC(){
        System.err.println();

        for(int i= 1; i<=4; i++){
            for(int j=1; j<=i; j++){

                System.out.print("\t"+j);
            }
            System.out.println();
        }
    }
    public static void patternD(){
        System.out.println();
        for(int i=4; i>0; i--){
            for(int j=i;j>0;j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void patternE(){
                System.err.println();

        for(int i= 1; i<=4; i++){
            for(int j=1; j<=i; j++){

                System.out.print("\t"+i);
            }
            System.out.println();
        }
    }
    
}
