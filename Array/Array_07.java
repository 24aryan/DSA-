import java.util.*;
// to check if a element is occuring n/2 times
public class Array_07 {

    public static int brute(int arr[] , int n){
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i])
                    count++;
            }
            if(count > n/2)
                return arr[i];
        }
        return -1;
    }

    public static int better(int num[],int n){
        HashMap<Integer,Integer> arr =new HashMap<>();
        for(int i=0;i<n;i++){
            int value = arr.getOrDefault(num[i],0);
            arr.put(num[i],value+1 );
        }
        for(Map.Entry<Integer,Integer> it : arr.entrySet()){
           if(it.getValue() > (n/2))
              return it.getKey();
        }
        return -1;
    }

    public static int MooreVoting(int arr[],int n){
        int count=0;
        int element =0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                element=arr[i];
            } else if (element==arr[i]) {
                count++;
            }
            else count--;
        }
// checking the suspected element is majority or not
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==element) count1++;
        }
        if(count1 > n/2) return element;
        return -1;
    }
    public static void main(String [] args){
      int arr[]={2, 2, 1, 1, 1, 2, 2};
      int n =arr.length;
      int ans = MooreVoting(arr,n);
        System.out.println("majority element " + ans);
    }
}
