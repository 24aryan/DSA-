import java.util.*;
public class Hashing_02 {
   // type 2 character type hashing
    // storing the valur=e of characters with their ascii values
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // line for string type of input
    String s = sc.nextLine();
// here we are taking only lower case alphabets that's why size of hash is 26
    // if all characters is taken we can use 256 size also
    int hash[] = new int[26];
    for (int i = 0; i < s.length();i++) {
        // every character ascii - a's ascii and the answer stored numerically for lower case
        // for upper case it will be -'A'
        // and for all characters no need of -
        // here int the brackets of hash ii always need s an integer value , so it automatically converts it
        hash[s.charAt(i) - 'a']++;
    }
    // no. of query input means how many alphabets
int q=sc.nextInt();

    // here the condition states to check till q is greater than 0
    while(q-->0) {
        // for char type of input
        char c = sc.next().charAt(0);
        // for output of count of every char - a's ascii value in hash array
        System.out.println(hash[c - 'a']);
    }
}
}
