package com.honglekai.algorithm.easy;

import java.util.Arrays;

/**
 * description
 *
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 *     初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 *     你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/10/7 22:05
 * modifyTime
 */
public class MergeSortedArray88 {

    /**
     * 方法一 : 合并后排序
     *
     * 直觉
     *
     * 最朴素的解法就是将两个数组合并之后再排序。该算法只需要一行(Java是2行)，时间复杂度较差，为O((n+m)log⁡(n+m))O((n + m)\log(n + m))O((n+m)log(n+m))。这是由于这种方法没有利用两个数组本身已经有序这一点
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/merge-sorted-array/solution/he-bing-liang-ge-you-xu-shu-zu-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] num2 = {2,5,6};
        int n = 3;
        merge(nums1,m,num2,n);
    }
}
