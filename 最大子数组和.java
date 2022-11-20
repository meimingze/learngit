//最大子数组和:给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
//子数组 是数组中的一个连续部分。
// 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
//思路:动态规划，将问题划分成以数组中每一个数字结尾所产生的所有最大和，然后再找到最大和中的最大值即可



class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        int result = dp[0];
        for (int i = 1; i < length; i++){
            if(dp[i - 1] > 0){
                dp[i] = dp[i - 1] + nums[i];
            }
            else{
                dp[i] = nums[i];
            }
            result = Math.max(result, dp[i]);
        }
        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        Solution solution = new Solution();
        solution.maxSubArray(num);

    }
}
