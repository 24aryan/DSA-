import java.util.Scanner;
// method 1
// here checking the prime number via a counter
public class Mbasics_03 {
    public static void primenumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime  number");
        }
        else{
            System.out.println("not a Prime number");
        }
    }
// method 2
    // using math.sqrt to reduce the number of iteration for checking the number
        public static boolean isPrime(int num) {
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
               return false;
                }
            }
return true;
        }
// method 3
   // here checking the loop from 2 uptill less than the number if it gets divided completely means it is not a prime number
        public static boolean isprime2(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
            return true;
        }

    //print all prime in a range
    //function calls a function for a task this type of function is called helper function
    public static void primecheck(int n){
        for (int i=2;i<=n;i++){
            if(isprime2(i)){
                //true
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
