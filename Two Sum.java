/* 
1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

*/

// Question
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    }
}

// Optimal solution with hash map
class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

// Loop solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Iterate through each number in the array
        for (int i = 0; i < nums.length; i++) {
            // For each number, check the rest of the array
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of these two numbers equals the target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // If no valid indices are found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
}



