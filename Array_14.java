import java.util.*;
public class Array_14 {
//    You are given a matrix 'MATRIX' of dimension 'N' x 'M'. Your task is to make all the elements of row 'i' and column 'j' equal to 0 
//    if any element in the ith row or jth column of the matrix is 0.
    // brute force approach
    static void setrow(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m,int i){
    for(int j=0;j<n;j++){
        if(matrix.get(i).get(j)!=0){
            matrix.get(i).set(j, -1);
        }
    }
}
    static void setcolumn(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m,int j){
        for(int i=0;i<m;i++){
            if(matrix.get(i).get(j)!=0){
                matrix.get(i).set(j,-1);
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        // Write your code here.
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    setrow(matrix, n, m, i);
                    setcolumn(matrix, n, m, j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==-1){
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }

    // better approach
    public static ArrayList<ArrayList<Integer>>better(ArrayList<ArrayList<Integer>>matrix ,Integer n , Integer m){
        int row[]=new int[n];
        int col[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }

    // optimal approach
    public static ArrayList<ArrayList<Integer>>optimal(ArrayList<ArrayList<Integer>>matrix ,Integer n , Integer m) {
        // int[] row = new int[n]; --> matrix[..][0]
        // int[] col = new int[m]; --> matrix[0][..]

        int col0 = 1;
        // step 1: Traverse the matrix and
        // mark 1st row & col accordingly:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark i-th row:
                    matrix.get(i).set(0, 0);

                    // mark j-th column:
                    if (j != 0)
                        matrix.get(0).set(j, 0);
                    else
                        col0 = 0;
                }
            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) != 0) {
                    // check for col & row:
                    if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        //step 3: Finally mark the 1st col & then 1st row:
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }
        return matrix;
    }

public static void main(String[]args){
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
    matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
    matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

    int n = matrix.size();
    int m = matrix.get(0).size();

    ArrayList<ArrayList<Integer>> ans = better(matrix, n, m);

    System.out.println("The Final matrix is: ");
    for (ArrayList<Integer> row : ans) {
        for (Integer ele : row) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
}
