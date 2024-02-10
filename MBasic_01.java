public class MBasic_01 {

    // the function is to extract the last digit from any number till its remainder becomes 0
    public static void countDigits(int n) {
        int count = 0;
        int lastdigit = 0;
        while (n > 0) {
            lastdigit = n % 10;
            count++;
            n = n / 10;
        }
        System.out.println(lastdigit);
    }
// here the problem is to find out the count of the number, which can itself alone divide the whole number without leaving any remainder in it
//You are given a number ’n’.
   // Find the number of digits of ‘n’ that evenly divide ‘n’.
        public static int countDigits2(int n){
            // taking a counter to track the count in which a digit can divide
            int count = 0;
            // storing the value of n in num
            int num = n;
            // finding the digit one by one
            int digit;
 //loop runs till the number become 0
            while(num > 0){
                // extracting each digit
                digit = num % 10;
                // now main step here , checking whether the digit which is extracted is >0 or not
                if(digit > 0){
                    // now checking if the digit can divide the whole number evenly w/o any remainder
                    if (n % digit == 0){
                        // if yes then count gets incremented
                        count++;
                    }
                }
// here the number is getting divide by 10 to remove the last digit and updating its value
                num /=10;
            }

            return count;
        }
// if we are dividing anything the time complexity will be in log


    public static void reversenumber(int n){
        int reverse_num=0;
        int lastdigit=0;
        while (n>0){
           lastdigit = n % 10;
           // dividing number by 10 to assign new no.
           n /= 10;
           // here to reverse the num taking the last digit and multiplying by 10 to give base and adding the next last digit
            // here the no. already prints in reverse fashion and we are just adding them according to base and printing it
           reverse_num=(reverse_num*10)+ lastdigit;
        }
        System.out.println(reverse_num);
    }
    public static void main(String[] args) {
        reversenumber(123);
        }
    }
