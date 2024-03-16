import java.util.*;
public class Array_12 {
    public static ArrayList<Integer> superiorElements(int[] a, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[i])
                    leader = false;
                break;
            }
            if (leader)
                ans.add(a[i]);
        }
        return ans;
    }
    // optimal one
    public static ArrayList<Integer> superiorElements2(int []a, int n) {
        ArrayList<Integer> ans =new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(a[i]>max)
                ans.add(a[i]);
            max=Math.max(a[i], max);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10, 22, 12, 3, 0, 6};
        int n =arr.length;
        ArrayList<Integer> ans = superiorElements2(arr, n);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
