import java.util.Arrays;

//存在重复元素:给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
//输入：nums = [1,2,3,1]
//输出：true
//思路：将数组先从小到大排序，然后通过比较前后两个元素是否相同，判断是否有重复
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}


