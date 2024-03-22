public class Bsearch_02 {
    // in this question we need to find the index at which the target is getting equal or lesser than
    // the element in the array & the array is already in sorted order
    // in this problem we will consider greater and equal to case in one condition only and if not found return n
    public static int lowerbound(int n ,int arr[],int target){
        n= arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                // if target is smaller or equal to this
                // we must need to check if smaller than this exist or not if yes  then we need to go on left side
                high=mid-1;
            }
            // but if there exist a number greater than the smallest but smaller than the target we nee dto find it as we want the next smallest index
            else low=mid+1;
        }
        return ans;
    }
    // same type of question but for upper bound index
    public static int upperbound(int arr[],int n,int target){
        n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                // here moving high to check if any other grater than mid are there or not if yes we nee dto check them too
                // as we want the very next greater or equal to of target
               high=mid-1;
            }
            //if it's not smaller than the mid we need to find greater element so move
            else low=mid+1;
        }
        return ans;
    }
    public static void main(String[]args){
        int arr[]={3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int value=upperbound(arr,n,x);
        System.out.println("the upper bound index is "+ value);
    }
}
