import java.util.*;
// first 2 videos
   public class Recursion_01 {
    // declaring count as a global variable using static
   static int count=6;
   public static void recurse(){
    if(count==1){
        return ;
    }
    else{
        System.out.println(count);
        count--;
        recurse();
    }
}
// method 1
// taking two parameters without global declaration
    public static void printname(int i,int n){
    if(i>n)return;
    else
        System.out.println("Aryan");
    // everytime after a loop ends i gets incremented till the condition is true
    printname(i+1,n);
}

// method 2 to print name without using loop
//You are given an integer ‘n’.
//Print “Coding Ninjas ” ‘n’ times, without using a loop.
    // collection framework applied to make a arraylist
    static List<String>print=new ArrayList<String>();
    public static List<String> printNtimes(int n){
        // applying count
        int count=n;
        if(count==0){
            return print;
        }
        print.add("Coding Ninjas");
        count--;
        // returning the current value of count in function
        printNtimes(count);
        return print;
    }

    // print 1 to n linearly
    // and to print in decreasing order just reverse the conditions
    public static void numinc(int i,int n ){
        if(i>n){
            return;
        }
        else
            System.out.println(i);
        numinc(i+1,n);
    }

// print numbers in increasing order but using backtracking

    public static void incnum2(int i){
        if(i<1)return;
            incnum2(i-1);
        // here we are printing after the function
        System.out.println(i);
    }

    // for decreasing order
   public static void decnum(int i,int n ){
        if(i>n)return;
        decnum(i+1,n);
    System.out.println(i);
    // here print is after the function bcoz when the condition gets satisfied it will start executing
}


    public static void main(String args[]){
  //  printname(1,5);
  //  recurse();
   //numinc(1,5);
        //incnum(2);
        //decnum(1,6);
}
}
