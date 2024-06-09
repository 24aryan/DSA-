public class String_03 {

    // palindrome
    // in addition removing space
    // and can handle the mix of upper and lower case
    public static void palindrome(String x){
        // removing the spaces
        x=x.replace(" ","");
        // converting the string either completely to uppercase
        x=x.toUpperCase();
        //can do the same by calling tolowercase()
        char [] y =x.toCharArray();
        char[] z = new char[y.length];
        int size= y.length-1;
        int i=0;
        while(i!=size){
            z[size-i]=y[i];
            i++;
        }
        while(i!=y.length){
            if(y[i]!=z[i]){
                System.out.println("not a palindrome");
                return;
            }else {
                i++;
                continue;
            }
        }
        System.out.println("is a palindrome");
    }
    public static void main(String [] args){
        String x = "aryan";
        palindrome(x);
    }
}
