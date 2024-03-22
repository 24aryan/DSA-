import java.util.*;
// video 3
public class Recursion_02 {

    // taking two input n and sum
    // parameterised approach
public static void addnumber(int n,int sum){
    //till n greater than 1 it will run after than it will directly print the answer
    while(n<1){
        System.out.println(sum);
        return;
    }
    //here calling the function reducing after every step and adding it's value in n
    addnumber(n-1,sum+n);
}
// more optimal way
    // functional approach
    static int sum=0;
    public static long add(long n){
    if(n>0){
        sum+=n;
        add(n-1);
    }
    return sum;
    }

    // one more approach
    public static int add2(int n){
        // here when n becomes zero it returns
        if(n==0){
            return 0;
        }
        // and we don't need any sum just n + the next n with recursion only
        return n+add2(n-1);
    }

    // and now if we want to find factorial
    public static int factorial(int n){
        // make sure tou return 1 as it's multiplication
        while(n<1){
            return 1;
        }
        return n * factorial(n-1);
    }
public static void main(String args[]){
    //addnumber(3,0);
    System.out.println(factorial(5));
}
}
