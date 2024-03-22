import java.util.*;
public class Array_05 {
    // 2 sum problem
    // need to find a target sum oof 2 variables from the array
    // the sequence doesn't matter

    // btute force
    public static void sum(int arr[],int target){
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<arr.length;i++){

            // can optimise this brute force using j+1
            //so that every i can have unique sum
            // as in this case we are checking previously done sums also again which increase t.c unnecessarily
//            for(int j=0;j<arr.length;j++){
//                if(i==j)continue;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    System.out.println(ans);
                }
            }
        }
    }

    // better solution with hashmap
    public static int[] twosum(int[] arr, int target){
        int n=arr.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer,Integer>variable = new HashMap<>();
        for(int i=0;i<n;i++){
            int num=arr[i];
            // for current index
            // target -num is for every index
            //that's why num is given value arr[i]
           int moreneeded = target - num;
           // to check value .contains key
           if(variable.containsKey(moreneeded)) {
               // to get the value .get
               ans[0] = variable.get(moreneeded);
               ans[1] = i;
               return ans;
           }
           variable.put(arr[i],i);
        }
        return ans;
    }

    // optimal case but this case works for variant one only in which we return yes or no
    public static String sum2(int arr[],int target){
        int n=arr.length;
        int left=0;
        int right=n-1;
            while (left<right){
                int sum=arr[left]+arr[right];
                if(sum==target) {
                    return "yes";
                }
                if(sum<target) left++;
                else right--;
        }
       return "no";
    }
    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 8, 11};
        Arrays.sort(arr);
        int target=14;
        // to print an array
//        int ans[]=twosum(arr,target);
//        System.out.println("This is the answer for variant 2: [" + ans[0] + ", " + ans[1] + "]");

        System.out.println(sum2(arr,target));
    }
}
