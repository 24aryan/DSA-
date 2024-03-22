import java.util.*;

public class Array_02 {
    //question 1
    // to rotate the array by one place to the left side
    public static void rotate(int arr[], int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    // move element to left by d places
    // brute force d1
    public static void d1rotate(int arr[], int d, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            temp.add(arr[i]);
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = n - d; i < n; i++) {
            // i is the current and n-d is the void place value
            //if we subtract them the  integer value will be equivalent to temp indexing and arrangement only
            arr[i] = temp.get(i - (n - d));
        }
    }
    public static void reverse(int []nums,int start,int last){
        while(start<last){
            int temp=nums[start];
            nums[start]=nums[last];
            nums[last]=temp;
            start++;
            last--;
        }
    }
    public static void d2rotate(int[] nums, int k) {
        k=k%nums.length;
        int d=nums.length-k;
        reverse(nums,0,d-1);
        reverse(nums,d,nums.length-1);
        reverse(nums,0,nums.length-1);
    }

    // move all the zeros to then end of array

    // brute force
    public static void movezero(int arr[]){
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        for(int i=0;i < temp.size();i++){
            arr[i]=temp.get(i);
        }
        for(int i=temp.size();i<arr.length;i++){
            arr[i]=0;
        }

    }

    // optimal solution
    public static void shiftzero(int arr[]){
        // if j remains -1 means there are no zero values in the array.
        int j=-1;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
               j=i;
               break;
           }
        }
        if(j==-1) return;
        for(int i=j+1;i< arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }

    // union of two arrays in a sorted form and having no duplicates in it
    // here we are getting sorted array but on coding ninja this case is failing some cases
    public static int[] twoarray(int[] n1, int[] n2) {
        HashMap<Integer,Integer>freq=new HashMap<>();

        for(int i=0;i<n1.length;i++){
            // here in the map we have key value storagr
            // so when we are storing key we need to store value and if there is zero value we need to add something
            // so here is a method getordefault in it if there is value add it or in default case add 1 or leave that
            freq.put(n1[i], freq.getOrDefault(n1[i],0)); //+1);
        }
        for(int i=0;i<n2.length;i++){
            freq.put(n2[i], freq.getOrDefault(n2[i],0)); //+1);
        }
        // here we declared a array to store values of union of size of map
        int union[]=new int[freq.size()];
        // declared a variable i to iterate
        int i=0;
        // here this is a auto for loop
        // we have declared a variable key which will contain the value of map
        for(int key: freq.keySet()){
            // now in the union array will increment i to the key values
            // so all the values of map can be copies
            union[i++]=key;
        }
        // for list collections.sort
        Arrays.sort(union);
        return union;
    }


    //optimal case using two pointer
    // this problem only works for sorted arrays
    public static ArrayList<Integer> unionarray(int[] a, int[] b){
        int i=0;
        int j=0;
        ArrayList<Integer>union=new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
               // the condition here satisfy if any one of them is true
                // 1. it checks if the list is empty . if yes then add the element
                //2. it checks if the previous element is same as this one .
                // if yes then not allowed to add and i will be incremented further.
                if(union.size()==0 || union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                }
                i++;
            }
            else {
                if (union.size()==0 || union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }
        while(i<a.length){
            if(union.get(union.size()-1)!=a[i]){
                union.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(union.get(union.size()-1)!=b[j]){
                union.add(b[j]);
            }
            j++;
        }
        return union;
    }
    public static void main(String[] args) {
        int arr1[] = {1,7,3,5,5,7};
        int arr2[]={2,5,8,7,4,6};
        Arrays.sort(arr1);
        Arrays.sort(arr2);

//       d1rotate(arr,3, arr.length);
//        reversearray(arr,0,arr.length);
//       d2rotate(arr,2);
      //movezero(arr);
        //shiftzero(arr);
      //  int arr[]=twoarray(arr1,arr2);
        ArrayList<Integer>Union= unionarray(arr1,arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }
}


//to copy from one list to other
//    public static void reverseArray(ArrayList<Integer> arr, int start, int end){
//
//        while (start<=end){
//
//            int temp = arr.get(start);
//
//            arr.set(start,arr.get(end));
//
//            arr.set(end,temp);
//
//            start++;
//
//            end--;
//
//        }
//
//    }
//
//}

