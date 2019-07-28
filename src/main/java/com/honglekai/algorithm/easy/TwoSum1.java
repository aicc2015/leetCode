package com.honglekai.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/7/14 15:49
 * modifyTime
 */
public class TwoSum1 {

    /**
     * 其中注释掉的为我的答案，官方给出最佳答案是一遍hash，时间复杂度是O(n)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
       /*

        int[] resultArr = new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target && i!=j){
                    resultArr[0] = i;
                    resultArr[1] = j;
                }
            }
        }
        return resultArr;*/

        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        System.out.println(twoSum(a,9));
    }
}
