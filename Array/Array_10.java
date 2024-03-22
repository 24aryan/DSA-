public class Array_10 {
    // problem best on best time to buy and sell stock in order to gain max profit
    public static int brute(int arr[],int n){
        int profit=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    profit=Math.max(arr[j]-arr[i],profit);
                }
            }
        }
        return profit;
    }

    public static int optimal(int arr[],int n){
        int buying=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<n;i++){
//            if(arr[i]<buying){
//                buying=arr[i];
//            }
            buying =Math.min(buying,arr[i]);
            profit=Math.max(profit,arr[i]-buying);
        }
        return profit;
    }
    public static void main(String[] args){
        int arr[]={7,1,5,3,6,4};
        int n =arr.length;
        int profit=optimal(arr,n);
        System.out.println("max profit is "+ profit);
    }
}
