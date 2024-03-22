public class Recursion_04 {
    // video no.5
    // recursion using multiple function calls
    public static int fibonacci(int n){
        // fibonacci number means current no. = addition of last + second last value
        // now if n is less or equal to 1 return n as it's starting of numbers
        if(n<=1){
            return n;
        }
        // now for any n last + second last equals it's value
        // so calling them by recursion only here the function will go one till 1 so it can find it's values
        // for the first line whole recursion will happen then the second function and after that main function will be executed
        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);
        return last + slast;
        // time complexity O(2^n)exponential
    }
    public static void main(String args[]){
        System.out.println(fibonacci(10));
    }
}
