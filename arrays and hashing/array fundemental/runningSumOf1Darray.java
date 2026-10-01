//1480. Running Sum of 1d Array

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
// Example 2:

// Input: nums = [1,1,1,1,1]
// Output: [1,2,3,4,5]
// Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

// Constraints:

// 1 <= nums.length <= 1000
// -10^6 <= nums[i] <= 10^6

//here first we create and sum array and store thhe running sum insted a optimal is can store in same array

//solution using same array 

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==0){
                continue; //for first number the running sum is that number itself only
            }
            nums[i] +=nums[i-1];
        }
        return nums;
    }
}