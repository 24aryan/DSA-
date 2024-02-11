import java.util.*;
public class Hashmap_03 {

        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // for no.of elements
                // amd value of elements
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
        }
// pre computation stage

                // the mapping work for both types of hashing int and character
                HashMap<Integer,Integer>mp=new HashMap<>();
          for(int i=0;i<n;i++) {
                  // here key and valur is established
                  // key is collecting values from i
                  int key = arr[i];
                  // at start with no data frequency of all will be zero
                  int freq = 0;
                  // now if we find key and has any frequency get it
                  if (mp.containsKey(key)) freq = mp.get(key); // fetching from the map
                  // after fetching ++ in the map
                  freq++;
                  // enter it's value in the map
                  mp.put(key, freq);
          }
          // q for no. of query required
                  int q=sc.nextInt();
                  while(q-- >0){
                          int number=sc.nextInt();
                          // here all the number is taken as input and compared and, if any frequency exist gives output
                          if(mp.containsKey(number)) System.out.println(mp.get(number));
                          else System.out.println(0);
                  }
          }
        }

