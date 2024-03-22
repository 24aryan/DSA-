public class Hashing_04 {
    //questions of coding ninjas

        public static int[] countFrequency(int n, int x, int []nums){
            // Write your code here.
            int hash[]=new int[n];
            for(int i=0;i<n;i++){
                // if value of array element greater than n continue
                if(nums[i]>n){
                    continue;
                }
                // here x is 1 which is standard for frequency. so every element in 1 then increment in hash
                hash[nums[i]-1]+=1;
            }
            return hash;
        }
    }

//    public class Solution {: This declares a public class named Solution.
//
//public static int[] countFrequency(int n, int x, int[] nums) {: This declares a public static method named countFrequency that takes three parameters: n (the limit for counting frequencies), x (seems unused), and nums (an array of integers for which frequencies need to be counted). The method returns an array of integers.
//
//int hash[] = new int[n];: This creates an integer array hash with a size of n. This array will be used to store the frequency counts of elements.
//
//for (int i = 0; i < n; i++) {: This is a loop that iterates through the elements of the nums array.
//
//if (nums[i] > n) { continue; }: This checks if the current element in the nums array is greater than n. If it is, the loop continues to the next iteration without processing the current element.
//
//hash[nums[i] - 1] += 1;: This increments the count of the current element in the hash array. The index is calculated as nums[i] - 1 because array indices start from 0, and the values in nums are assumed to be in the range of 1 to n.
//
//return hash;: The method returns the hash array containing the frequency counts of elements.
//
//Note: The variable x is declared as a parameter but not used within the method. If it is unnecessary, you may consider removing it from both the method signature and the method body.

