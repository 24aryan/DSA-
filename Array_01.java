import java.util.*;
public class Array_01 {
// question 1 largest element

    // brute force
    // sort the array and print the last element

    // optimal solution
    public static void largest(int arr[], int n) {
        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        System.out.println(largest);
    }

    // question 2 to find the second largest element

    // brute force
    // sort the array and then pass a loop and check if there
    // exists a element not equal to largest
    // here we don't need to check the highest as the array is already sorted and wwhen the if condition fails the element
    // at which we are becomes the slargest


    // best
    //pass a for loop which have optimal approach to find largest element
    //and then pass a for loop to find lesser than slargest and != largest
    // to avoid any same element andassign slargsest


    // optimal approach
    public static int seclargest(int arr[], int n) {
        int largest = arr[0];
        // slargest is the least valye
        // INTEGER.MIN VALUE is assigned to find largest
        int slargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            // finding the slargest element
            if (arr[i] > largest) {
                // if any element is largest it's prev largest largest will be slargest
                slargest = largest;
                largest = arr[i];
                // if not foind slargest in this
                // check if there exists an element greater than the largest and lesser than the slargest
                // if there assign it the slargest
            } else if (arr[i] > largest && arr[i] < slargest)
                slargest = arr[i];
        }
        return slargest;
    }

    // second smallest element
    // all the cases same as smallest
    // brute and best

    //optimal

    public static int secsmallest(int arr[], int n) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < ssmallest)
                ssmallest = arr[i];

        }
        return ssmallest;
    }
    // in order to return to elements at same time
    // return new int[]{element,element};


    // check if the array is sorted or not
    // check if the next element is greater or equal to previous element or not

    public static int sortedarray(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else return 0;
        }
        return 1;
    }

    // question 5 remove duplicates from the sorted array
    // asked in many companies

    //brute force approach

    public static int duplicate(int a[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            // adding the elements of array in set
            // the duplicate element in set is assigned as x
            set.add(a[i]);
        }

        //if asked to return only the count of unique number just return size of set

        // here j fetches the size of array unique element
        int j = set.size();
        //k is the counter
        int k = 0;
        // and x is the value of the set for duplicates
        //and the j values when copied to array will replace x at duplicate values.
        for (int x : set) {
            // as the k increases x is put in the array
            a[k++] = x;
        }
        // j is returned with unique elements
        //and then added to array by running loop
        return j;
    }

    //optimal

    public static int duplicates(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
       return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};
        int j = duplicates(arr);
        System.out.println("after removing duplicates ");
        for (int i = 0; i < j; i++) {
            System.out.println(arr[i] + "");
        }

//        System.out.println(duplicates(arr,arr.length));
    }
}