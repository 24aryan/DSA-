import java.util.*;
public class Array_16 {
    // print the spiral matrix
    public static int[] spiralMatrix(int [][]MATRIX) {
        // Write your code here.
        int n=MATRIX.length;
        int m =MATRIX[0].length;
        int top=0;
        int right=m-1;
        int bottom=n-1;
        int left=0;
        ArrayList<Integer>ans=new ArrayList<>();
        while(top<=bottom&& left<=right){
            for(int i=left;i<=right;i++)
                ans.add(MATRIX[top][i]);
            top++;

            for(int i=top;i<=bottom;i++)
                ans.add(MATRIX[i][right]);
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                    ans.add(MATRIX[bottom][i]);
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                    ans.add(MATRIX[i][left]);
                left++;
            }
        }
        int []arr=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
    public static void main(String[] args){
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int[] ans = spiralMatrix(mat);
        for(int i = 0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
