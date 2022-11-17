//给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
//你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
//1 <= nums.length <= 3 * 104
//-3 * 104 <= nums[i] <= 3 * 104
//除了某个元素只出现一次以外，其余每个元素均出现两次。


class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int number = nums.length;
        int end = nums[number - 1];
        int result = nums[0];
        for(int i = 0; i < nums.length - 2 ; i++){
            if(nums[i] != nums[i + 1] && nums[i + 1] != nums[i + 2] ){
                result = nums[i + 1];
            }
            else if(nums[0] != nums[1]){
                result = nums[0];
            }
            else if(nums[number - 2] != end){
                result = end;
            }
        }
        return result;
    }
}