/*
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
说明：
你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

题解：使用离散数学中异或的方法，a异或0=a
a异或a=0，并且满足交换律和结合率，故我们用异或遍历一遍数组，最终有相同的数则是0，不相同的话就会变成只出现一次的数
 */



class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for(int num: nums) {
            answer ^= num;
        }
        return answer;
    }
}