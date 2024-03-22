public class Mbasics_02 {
    public static boolean palindrome(int n) {
        // here we are storing the original value of n in a duplicate variable as after the function n becomes zero it can't be compared
        int dup =n;
        int reverse_num = 0;
        int lastdigit = 0;
        while (n > 0) {
            lastdigit = n % 10;
            // dividing number by 10 to assign new no.
            n /= 10;
            // here to reverse the num taking the last digit and multiplying by 10 to give base and adding the next last digit
            // here the no. already prints in reverse fashion, and we are just adding them according to base and printing it
            reverse_num = (reverse_num * 10) + lastdigit;
            }
        if(reverse_num==dup){
            return true;
        }
      return false;
    }
    // different approach for thi to directly write the function in main and take the scanner input from user

    public static boolean armstrong(int n){
        // here we need to solve Armstrong Numbers , the numbers having the sum of digits raised to power no. of digits is equal to a given number.
        // taking two duplicates of n to store original value
        int temp=n;
        int original=n;
        int sum = 0;
        int lastdigit=0;
        int count=0;
        // first while loop to count the digits
        while(temp>0){
            count++;
            temp = temp/10;
        }
        // second while loop to get lastdigits and get their power and sum individually
        while(n>0) {
            lastdigit = n % 10;
            sum += Math.pow(lastdigit, count);
            n /= 10;
        }
        // comparing n with sum
        if(sum==original){
            return true;
        }
        else {
            return false;
        }
    }

    // here two problems are solved one to print all divisors and the sum of all divisors
    public static void divisors(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            if (n%i==0) {
                //System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
//new problem based on this we have a number n and we need to find all divisors up till n for each ans find sum at the end
    public static int sumofalldivisors(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            // here both the i are working independently
            // we are finding all the divisors of a n at a time and adding with the next one
         //   Explanation:
          //  We need to find the sum of ‘sumOfDivisors(i)’ for all ‘i’ from 1 to 5.
//‘sumOfDivisors(1)’ = 1
//‘sumOfDivisors(2)’ = 2 + 1 = 3
//‘sumOfDivisors(3)’ = 3 + 1 = 4
//‘sumOfDivisors(4)’ = 4 + 2 +1 = 7
//‘sumOfDivisors(5)’ = 5 + 1 = 6
//            Therefore our answer is sumOfDivisors(1) + sumOfDivisors(2) + sumOfDivisors(3) + sumOfDivisors(4) + sumOfDivisors(5) = 1 + 3 + 4 + 7 + 6 = 21.
            sum=sum+(n/i)*i;
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(sumofalldivisors(5));
    }
}
