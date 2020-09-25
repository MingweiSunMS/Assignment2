/**
 * The deadline of this assignment is 09/25/2020 23:59 PST.
 * Please feel free to contact Yafei and Yaqi for any questions.
 */

public class Assignment2_2 {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and outprint its sum.
     *
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     */
    public static int maxSubArray(int[] nums) {
        int length=nums.length;
        if(nums==null || length == 0) {
        	System.out.println("nothing");
        	return -1;
        }
        int maxSum=nums[0];
        int tempSum;
        for(int i=0;i<length;i++) {
        	tempSum=nums[i];
        	for(int j=i+1;j<length;j++) {
        	tempSum=tempSum+nums[j];
        	if(tempSum>maxSum) {
        		maxSum=tempSum;
        	}
        }
      }
        return maxSum;
    }    
       

    public static void main(String[] args) {
        //write your code here
    	int[]nums = {-2,1,-3,4,-1,2,1,-5,4};
    	int result=maxSubArray(nums);
    	System.out.println("For Array [-2,1,-3,4,-1,2,1,-5,4], the maxinum subarray sum is "+result);
    	
    	int[]num2 = {1};
    	int result2=maxSubArray(num2);
    	System.out.println("For Array [1], the maxinum subarray sum is"+result);
    	
    	int[] nums3= {};
    	System.out.println("For a empty array, the return result is"+maxSubArray(nums3));
    }
}
