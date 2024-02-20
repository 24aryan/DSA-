import java.util.HashMap;

public class Array_04 {
    // question to find the length of subarray with sum k

    // brute force
    // long k is to differentiate
    // same case applicable to negative as well
    public static void sub(int arr[],long k){
        int n= arr.length;
        int length=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum +=arr[j];
//                for(int k=i;k<=j;k++){
//                    sum +=arr[k];
//                }

//                 optimised brute force just sum the subarray and for every new element add the previous sum to it
//                and check the if condition
                if(sum==k)
                    length=Math.max(length,j-i+1);
            }
        }
        System.out.println(length);
    }

    // better approach using prefix technique
    // this approach covers zero and negative numbers also
    public static void subarray1(int a[],long k){
        int n=a.length;
        long sum=0;
        int maxlen=0;
        HashMap<Long,Integer> presum=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=a[i];
            // if we find the whole array as sub array
            if(sum==k){
                maxlen=Math.max(maxlen,i+1);
            }
            long remsum= sum-k;
            if(presum.containsKey(remsum)){
                // here removing the indexes containing remsum and calculating its length
                int len = i - presum.get(remsum);
                maxlen=Math.max(len,maxlen);
            }
            // if rem contains sum that means the array have zeros and -ve elements which results to sum same as prev
            // if the rem part don't contains in the sum then add the sum and index i to the map and continue to next value
            // imp step
            if(!presum.containsKey(remsum)){
                presum.put(sum,i);
            }
        }
        System.out.println(maxlen);
    }

    // optimal approach
    // for positive and zeros only
    public static void subarray(int a[],int k){
        int maxlen=0;
        int count=0;
        // in case of count take sum as 0 only as in length we want sum with length but here we want only sum so it's recommended to take it as zero not the value f first element.
        int sum =a[0];
        int i=0;
        int j=0;
        while(j<a.length){
            // till i and j have a subarray in them
        while(i<=j && sum > k){
            // here of sum becomes greater than k to make it upto k moving i
            sum -= a[i];
            i++;
        }
            if (sum == k) {
                count++;
                maxlen = Math.max(maxlen, j - i + 1);
            }
            // when sum is still in the boundary
               j++;
            if(j<a.length)
                sum += a[j];
           }
        System.out.println("no.of subarray " + count);
        System.out.println(maxlen);
    }
    public static void main(String[]args){
        int[] a = {1,2,3,1,1,1,1,3,3};
       int k=6;
       subarray(a,k);
    }
}
//////////////////////////////////// Easy level questions ends here //////////////////////////////////////////
