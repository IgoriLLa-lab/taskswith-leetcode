package Task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

public class TwoSum {
    public static void main(String[] args) {
        //Input:
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        System.out.println("First option " + Arrays.toString(twoSum(nums, target)));

        System.out.println("Second option " + Arrays.toString(twoSumHashM(nums, target)));
    }

    //First option. complexity - O(n^2).
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == target - nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Not found indices of the two numbers, " +
                "since the numbers are not in the array");
    }

    //Second option. complexity - O(N).
    public static int[] twoSumHashM(int[] num, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int desiredNumber = target - num[i];
            if (map.containsKey(desiredNumber) && map.get(desiredNumber) != i) {
                return new int[]{map.get(desiredNumber), i};
            }
            map.put(num[i], i);
        }
        throw new IllegalArgumentException("Not found indices of the two numbers, " +
                "since the numbers are not in the array");
    }

}
