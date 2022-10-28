/*
                        三数之和
给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
你返回所有和为 0 且不重复的三元组。
注意：答案中不可以包含重复的三元组。
 */
    class Solution {
        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> answer = new ArrayList();
            int length = nums.length;
            Arrays.sort(nums);
            if(length < 3 || nums == null){
                return answer;
            }
            for (int i = 0; i < length; i++){
                if (nums[i] > 0){
                    break;
                }
                if(i > 0&&nums[i]==nums[i-1]){
                    continue;
                }
//双指针
                int left = i+1;
                int right = length - 1;

                while(left < right){
                    if(nums[i] + nums[left] +nums[right] == 0){
                        answer.add(Arrays.asList (nums[i],nums[left],nums[right]));
                        while (left<right&&nums[left]==nums[left+1]){ left++;}
                        while (left<right&&nums[right]==nums[right-1]){right--;}
                        left++;
                        right--;
                    }
                    else if(nums[i] + nums[left] +nums[right] > 0 &&left<right){
                        right--;
                    }
                    else if(left<right && nums[i] + nums[left] +nums[right] < 0){
                        left ++;
                    }
                }
            }
            return answer;
        }
    }

