import java.util.*;
// 4 video
// samsung question
import static java.util.Collections.swap;

public class Recursion_03{
    static void printarray(int arr[],int n){
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    static void reversearray(int arr[],int i, int n){
        if(i<n){
            int temp=arr[i];
        arr[i]=arr[n];
        arr[n]=temp;
        reversearray(arr,i+1,n-1);}
    }

    // 2nd approach
    static void revarr(int arr[],int i,int n){
        if(i>=n/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]= temp;
        revarr(arr,i+1,n);
    }

    static boolean palindrome(String s,int i){
       if(i>=s.length()/2){
           return true;
       }
       if (s.charAt(i) != s.charAt(s.length()-1-i)){
           return false;
        }
     return palindrome(s,i+1);
    }




    public static void main(String args[]){
        int arr[] = {2,4,5,1,8};

        String s = "madam";
        System.out.println(palindrome(s,0));
     //  int n= arr.length;
       // reversearray(arr,0,n-1);
       // revarr(arr,0,n);
       // printarray(arr,n);
    }
}
