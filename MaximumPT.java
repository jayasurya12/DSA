
class MaximumPT {
    //Maximum Product of Three Numbers

    //Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

    // Example 1:

    // Input: nums = [1,2,3]
    // Output: 6
    // Example 2:

    // Input: nums = [1,2,3,4]
    // Output: 24
    // Example 3:

    // Input: nums = [-1,-2,-3]
    // Output: -6


    // Constraints:

    // 3 <= nums.length <= 104
    // -1000 <= nums[i] <= 1000

    // Function to find a maximum
    // product of a triplet in array
    // of integers of size n

    static int maxProduct(int[] arr) {

        int max1 = Integer.MIN_VALUE,
        max2 = Integer.MIN_VALUE,
        max3 = Integer.MIN_VALUE,
        min1 = Integer.MAX_VALUE,
        min2 = Integer.MAX_VALUE;

        for (int num: arr) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = { -100,-98,-1,2,3,4 };

        int max = maxProduct(arr);

        if (max == -1)
            System.out.println("No Triplet Exists");
        else
            System.out.println("Maximum product is " + max);
    }
}


   // public int maximumProduct(int[] nums) {
   //      int max1 = Integer.MIN_VALUE,
   //      max2 = Integer.MIN_VALUE,
   //      max3 = Integer.MIN_VALUE,
   //      min1 = Integer.MAX_VALUE,
   //      min2 = Integer.MAX_VALUE;

   //      for (int n : nums) {
   //          if (n > max1) {
   //              max3 = max2;
   //              max2 = max1;
   //              max1 = n;
   //          } else if (n > max2) {
   //              max3 = max2;
   //              max2 = n;
   //          } else if (n > max3) {
   //              max3 = n;
   //          }

   //          if (n < min1) {
   //              min2 = min1;
   //              min1 = n;
   //          } else if (n < min2) {
   //              min2 = n;
   //          }
   //      }
   //      return Math.max(max1*max2*max3, max1*min1*min2);
   //  }