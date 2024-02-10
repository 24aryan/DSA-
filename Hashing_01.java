import java.util.*;
// hash array type 1 number
public class Hashing_01 {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    // first input for no. of elements in the array
    int n=sc.nextInt();

    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        // input for the elements in the array
        arr[i]=sc.nextInt();
    }
// making a hash array having a limit of 13 elements
    int hash[]=new int[13];
    for (int i=0;i<n;i++){
        // traversing each element for array and storing it's count in hash array
        hash[arr[i]]+=1;
    }
// input for no. of query we want to search
    int q = sc.nextInt();
    // decreasing  q till it  becomes zero
    while (q--!=0){
        // input of number whose count we want to check
        int number=sc.nextInt();
        // printing the value in hash map to the particular query asked
        System.out.println(hash[number]);
    }
}
}
