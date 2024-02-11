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

