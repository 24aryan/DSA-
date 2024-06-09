public class String_02 {
    //copying one string in another
    public static void copy(String x){
        char y[] =x.toCharArray();
        char z[] =new char[y.length];
        int i=0;
       while(i!=y.length){
          z[i]=y[i];
           i++;
        }
       // print as an array
//       for(int j=0;j<z.length;j++){
//           System.out.println("elements of array " + z[j]);
//       }
        // to print as a string
        System.out.println(z);
    }

    // reverse a string m-1
    public static void reverse(String x){
        char[]y=x.toCharArray();
        char []z =new char[y.length];
        int size=y.length-1;
       for(int i=0;i<y.length;i++){
           z[size-i]=y[i];
        }
        System.out.println(z);
    }

    // reverse a string m-2 two pointer approach
    public static void reverse2(String x){
        char[]y=x.toCharArray();
        int left=0;
        int right =y.length-1;
        while(left<right){
            // swapping
          char temp =y[left];
          y[left]=y[right];
          y[right]= temp;
          // moving towards middle
         left++;
         right--;
        }
        System.out.println(y);
    }
    public static void main(String[] args){
       String str ="Aryan Mishra";
//       copy(str);
//       reverse(str);
       reverse2(str);
    }
}
