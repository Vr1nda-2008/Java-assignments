//TASK - 04
public class MatrixOperations {
    public int[][] add(int[][] first, int[][] second) {
        int size1 = first.length;
        int size2 = second.length;
        int[][] sum = new int[size1][size2];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                sum[i][j] = first[i][j] + second[i][j];
                System.out.print(" " + sum[i][j]);
            }
            System.out.println();
        }

        return sum;
    }

    public int[] rowSums(int[][] matrix) {
        int size1 = matrix.length;
        int[] sums = new int[size1];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1; j++) {
                sums[i] += matrix[i][j];
            }
            System.out.println(sums[i]);
        }
        return sums;
    }

    public int[] columnSums(int[][] matrix) {
        int size1 = matrix.length;
        int[] sums = new int[size1];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1; j++) {
                sums[i] += matrix[j][i];
            }
            System.out.print(" " + sums[i]);
        }
        return sums;
    }

    public int[][] multiply(int[][] first, int[][] second) {
        int size1 = first.length;
        int size2 = second.length;
        int[][] product = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                product[i][j] = first[i][j] * second[i][j];
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
        return product;
    }
public void printMatrix(int[][] matrix){
    int size1 = matrix.length;
    for (int i = 0; i < size1; i++) {
        for (int j = 0; j < size1; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
public int[][] transpose(int[][] matrix){
    int size1 = matrix.length;
    int [][]Trans_pose = new int[size1][size1];
    for(int i=0; i<size1; i++){
        for(int j=0; j<size1; j++){
          Trans_pose[i][j] = matrix[j][i];
          System.out.print(Trans_pose[i][j] + " ");
        }
        System.out.println();
    }
    return Trans_pose;
  
}

}
