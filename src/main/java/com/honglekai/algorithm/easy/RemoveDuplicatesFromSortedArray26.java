package com.honglekai.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例 1:
 *
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 2:
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 说明:
 *
 * 为什么返回数值是整数，但输出的答案是数组呢?
 *
 * 请注意，输入数组是以“引用”方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 *
 * 你可以想象内部操作如下:
 *
 * // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
 * int len = removeDuplicates(nums);
 *
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/9/15 23:33
 * modifyTime
 */
public class RemoveDuplicatesFromSortedArray26 {

    /**
     * 算法
     *
     * 数组完成排序后，我们可以放置两个指针 iii 和 jjj，其中 iii 是慢指针，而 jjj 是快指针。只要 nums[i]=nums[j]nums[i] = nums[j]nums[i]=nums[j]，我们就增加 jjj 以跳过重复项。
     *
     * 当我们遇到 nums[j]≠nums[i]nums[j] \neq nums[i]nums[j]​=nums[i] 时，跳过重复项的运行已经结束，因此我们必须把它（nums[j]nums[j]nums[j]）的值复制到 nums[i+1]nums[i + 1]nums[i+1]。然后递增 iii，接着我们将再次重复相同的过程，直到 jjj 到达数组的末尾为止。
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/solution/shan-chu-pai-xu-shu-zu-zhong-de-zhong-fu-xiang-by-/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param nums
     * @return
     */
    public static  int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,4,5,7,7,3,4,5,6,1};
        removeDuplicates(a);
    }
}
