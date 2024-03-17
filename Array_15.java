public class Array_15 {
    public static int [][] rotate(int matrix[][],int n){
         n = matrix.length;

        // Create a new matrix to store the rotated values
        int[][] rotatedMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }

        // Copy rotated matrix back to the original matrix
        for (int i = 0; i < n; i++) {
            System.arraycopy(rotatedMatrix[i], 0, matrix[i], 0, n);
        }
    return matrix;
    }

    // optimal approach

    public static void rotateMatrix(int [][]mat){
        // Write your code here.
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
            // mat[0].length indicate the column here 0 is the row that means without changing row traversing through the column
            // we can write n also instead of this
            for(int j=i+1;j<mat[0].length;j++){
                int temp=0;
                // transposing the elements
                temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<mat.length;i++){
            // taking half of the column because swapping with other half only
            for(int j=0;j<mat.length/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-1-j];
                mat[i][n-1-j]=temp;
            }
        }
    }
    public static void main(String[] args){
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = arr.length;
        int rotated[][] = rotate(arr,n);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}
