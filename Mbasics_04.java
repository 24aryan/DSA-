import java.util.*;
public class Mbasics_04 {
    // method 1 to find gcd / hcf
    // need to find the highest common factor between two  numbers
       public static void gcd(int n1,int n2){
           // taking a variable gcd store multiple factor value and to print the highest factor at the end
           int gcd=1;
           // here taking the min of both numbers as it helps to find only relevant factors
           // here we can take the larger number if known rather then min function
           for(int i=1;i<=Math.min(n1,n2);i++){
               // finding modulo of both numbers and most common from them gets printed
               if(n1%i==0 && n2%i==0){
                   gcd =i;
               }
           }
           System.out.println("the GCD of given numbers is "+ gcd);
       }
       // method 2
  public static void hcf(int n1,int n2){

           // taking loop in the reverse as 1 is common in all factors and by taking reverse loop can find the highest common factor in start only
           for(int i=Math.min(n1, n2);i>=1;i--) {
               if (n1 % i == 0 && n2 % i == 0) {
                   // the first factor from reverse direction is the hcf only so just print it and break the loop
                   System.out.println(i);
                   break;
               }
           }
  }

  // ecludian algorithm
    // here  this algorithm states that gcd of (a,b)= (a-b,b) till a>b
    //or can be written as (a,b)= (a%b,b) the smaller one module the bigger one
    // till one of them become zero and the other become the gcd and gets printed

    public static void eculidian(int a, int b){
           // running the loop till both are greater than zero
           while(a>0 && b>0){
               // if a is greater find it's modulo else of b
          if(a>b){
              a=a%b;
          }
          else{
              b=b%a;
          }
          // if one of both becomes zero print the other one as gcd

        }
        if(a==0){
            System.out.println(b);
        }
            System.out.println(a);
    }
       public static void main(String args[]){
          Scanner sc =new Scanner(System.in);
          int n1 = sc.nextInt();
          int n2 = sc.nextInt();
        //  gcd(n1,n2);
           //hcf(n1,n2);
           eculidian(n1,n2);
       }
}
