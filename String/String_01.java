public class String_01{
// computing the length of the string
    public static void length(String str){
        int i=0;
        int count =0;
        while(i<str.length()){
            i++;
            count++;
        }
        System.out.println("length of String "+ count);
    }

    // method 2
    public static void length2(String x){
        System.out.println(x.length());
    }

    // method 3 when the use of length method is not permittable
    public static void length3(String x){
        // adding a null string at the end of array with concat and same can be done with append
        x = x.concat("\0");
        // now storing the string as an character array
        char []y = x.toCharArray();
        int i=0;
        int count=0;
// we added "\0" null at string and here using '\0' instead bcoz now it's converted into a character
        while(y[i]!='\0'){
           i++;
           count++;
        }
        System.out.println("length of String "+ count);
    }
    public static void main(String[] args) {
        String str = "Aryan Mishra";
       length3(str);
    }
}
