package Array;
//Given the array of integers nums, you will choose two different indices i and j of that array.
//        Return the maximum value of (nums[i]-1)*(nums[j]-1).

import java.util.Arrays;

public class ProductOfArray {
    public static int maxProduct(int[] nums) {
        int biggest = nums[0];
        int secondBiggest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > biggest) {
                secondBiggest = biggest;
                biggest = nums[i];
            } else if (nums[i] > secondBiggest && nums[i] != biggest) {
                secondBiggest = nums[i];
            }
        }
        return ((biggest-1)*(secondBiggest-1));

    }


}