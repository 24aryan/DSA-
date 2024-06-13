public class String_04 {
    // ascii american standard code for information interchange
// A is at 65 and a is at 97

    public static void lowertoupper(String x){
        char[] y = x.toCharArray();
        int size=y.length;
        int i=0;
        while (i!=size){
            // to skip spaces
            if(y[i]!= ' ') {
                y[i] = (char) (y[i] - 32);
            }

            // to change upperase to lower case just add 32 instead of subtraction
//            y[i]= (char)(y[i]+32);
                i++;
        }
        System.out.println(x);
        System.out.println(y);
    }

    public static void firsttoupper(String x){
        char[] y = x.toCharArray();
        int size = y.length;
        // converting first letter to capital
        y[0]= (char) (y[0]-32);
        int i = 1;
        while(i!=size){
            // if space is there move to next element which is starting of a word and convert it into uppercase
            if(y[i]==' '){
                y[i+1] = (char) (y[i+1] - 32);
            }
            i++;
        }
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args){
     String str ="aryan is a programmer";
//     lowertoupper(str);
     firsttoupper(str);
    }
}
