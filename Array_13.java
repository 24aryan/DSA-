import java.util.*;
public class Array_13 {
    // need to find the longest common subsequence
    // means to find the size of number which are repeating in a sequence

    // brute force approach
    public static boolean linear(int a[],int num){
        for(int i=0;i<a.length;i++){
            if(a[i]==num)
                return true;
        }
        return false;
    }
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int n =a.length;
        int longest=1;
        for(int i=0;i<n;i++){
            int x=a[i];
            int count=1;
            while(linear(a, x+1)==true){
                x+=1;
                count+=1;
            }
            longest=Math.max(longest, count);
        }
        return longest;
    }

    // better approach

    public static int better(int []a) {
        // Write your code here.
        int longest=1;
        int  count=0;
        int n=a.length;
        int smallest=Integer.MIN_VALUE;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]-1==smallest){
                count+=1;
                smallest=a[i];
            }
            else if(a[i]!=smallest){
                smallest=a[i];
                count=1;
            }
            longest=Math.max(longest, count);
        }
        return longest;
    }

    // optimal approach
    public static int optimal(int []a) {
        // Write your code here.
        int longest=1;
        HashSet<Integer> ans =new HashSet<>();
        for(int i=0;i<a.length;i++){
            ans.add(a[i]);
        }
        for(int it : ans){
            if(!ans.contains(it - 1 )){
                int x=it;
                int count=1;
                while(ans.contains(x+1)){
                    x+=1;
                    count+=1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }

    public static void main(String [] args){
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
