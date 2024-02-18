import java.util.*;
public class Array_03 {
    // question to find out intersected arrays from two sorted array
    //
    public static ArrayList<Integer> intersection(int a[],int b[]) {
        // when any array is created initially all it's value will be 0 only
        int vis[]=new int[b.length];
        ArrayList<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && vis[j] == 0) {
                    intersection.add(a[i]);
                    vis[j] = 1;
                    break;
                }
                if (b[j] > a[i]) break;
            }
        }
        return intersection;
}

    // question to find the missing number from sequence of number

    public static int missing(int arr[]){
        // here taking arr.length+1 because we want to find the missing element which is not present and counted so check more than length
        int n=arr.length+1;
        for(int i=1;i<=n;i++){
            int flag=0;
            // here from index 0 to end
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if (flag==0) return i;
        }
        // if no number is missing
       return -1;
    }

    // better approach
    public static int missing2(int arr[]){
        int n=arr.length+1;
        int[] hash=new int[n+1];
        // when any array is created initially all it's value will be 0 only
        for(int i=0;i<n-1;i++){
            hash[arr[i]]+=1;
        }
        // can check from 0 to 1 if sequential number starts from 0
        for(int i=1;i<=n;i++){
            if(hash[i]==0)
                return i;
        }
        return -1;
    }

    //optimal have two approaches
    // so first approach will be like
    // and mine works for only non zero will truly give you missing number
    public static int missing3(int arr[]){
        int n=arr.length+1;
        // sum of all n number will be
        int sum1=n*(n+1)/2;
        // for sum of array elements
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum2 += arr[i];
            // the difference of sum will be missing number
        }
        return sum1-sum2;
    }

    // now on leetcode solution it is like the missing number will be valued as  0 and we need to find which number is it
    // means if it 2 is missing array should be of size 3 only
    // so take n=nums.length
    //and loop for arr value from 0 to n-1
//    int n = nums.length;
//    int totalSum = n*(n+1)/2;
//    int sum = 0;
//        for(int i =0;i<n;i++){
//        sum = sum+nums[i];
//    }
//        return totalSum - sum;


    // question find the most consecutive number of 1
    public static int consecutive(int arr[]){
            int count=0;
            int max=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==1){
                    count++;
                    max=Math.max(count,max);
                }
                else count=0;
            }
            return max;
    }
    // find the number that appears once
    public static int onceappear(int arr[]){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==num)
                    count++;
            }
            if(count==1) return num;
        }
        return -1;
    }
// better appraoch
    public static int onceappear2(int arr[]){
      int max=0;
      int n=arr.length;
      for(int i=0;i<n;i++){
          max=Math.max(arr[i],max);
      }
        int hash[]=new int[max+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(hash[arr[i]]==1)
                return arr[i];
        }

       return -1;
    }
    public static void main(String[]args){
     int arr[]={1,1,2,2,3,3,4};
   //  Arrays.sort(arr);
        System.out.println(onceappear2(arr));
    }
}
