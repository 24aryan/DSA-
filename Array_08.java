import java.util.*;

// kaden's algorithm
public class Array_08 {
    public static int kadens(int arr[],int n){
        int maximum =Integer.MIN_VALUE;
        int sum=0;
        int start=0;
        int sumstart=-1;
        int sumend=-1;

        for(int i=0;i<n;i++){
            // if it is asked to print the max subarray
            if(sum==0) {
                start = i;
            }
            sum+=arr[i];
            // if a single negative element exist in this case it can be solved and returned maximum
            // or if multiple elements are there loop will run again and the next sum will be zero according to condition
          //  maximum=Math.max(sum,maximum);
            if(sum> maximum){
                maximum=sum;
            sumstart=start;
            // the point at which sum exceeds the max is the end of sub array that i is the sum end
            sumend = i;
            }
            if(sum<0) {
                sum = 0;
            }
        }
        System.out.println("the subarray is [");
        for(int i=sumstart;i< sumend;i++){
            System.out.println(arr[i] + "");
        }
        System.out.println("]");
        return maximum;
    }
public static void main(String[] args){
    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
    int n=arr.length;
    int ans=kadens(arr,n);
    System.out.println("max subarray sum is "+ ans);
}
}
