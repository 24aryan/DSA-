import java.util.*;
public class Array_11 {
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        // Write your code here.
        int index=-1;
        int n=A.size();
        for(int i=n-2;i>=0;i--){
            if(A.get(i)<A.get(i+1)){
                index=i;
                break;
            }
        }
        if(index==-1){
            Collections.reverse(A);
            return A;
        }

        for(int i=n-1;i>index;i--){
            if(A.get(i)>A.get(index)){
                Collections.swap(A, i, index);
                break;
            }
        }
        List<Integer>subList=A.subList(index+1 , n);
        Collections.reverse(subList);
        return A;
    }
    public static void main(String[] args){
        List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }
}

