package com.honglekai.algorithm.easy;

/**
 * description
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 *
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/8/18 22:21
 * modifyTime
 */
public class PlusOne66 {

    /**
     * 解题思路
     * 根据题意加一，没错就是加一这很重要，因为它是只加一的所以有可能的情况就只有两种：
     *
     *     除 999 之外的数字加一；
     *     数字 999。
     *
     * 加一得十进一位个位数为 000 加法运算如不出现进位就运算结束了且进位只会是一。
     *
     * 所以只需要判断有没有进位并模拟出它的进位方式，如十位数加 111 个位数置为 000，如此循环直到判断没有再进位就退出循环返回结果。
     *
     * 然后还有一些特殊情况就是当出现 999999、999999999 之类的数字时，循环到最后也需要进位，出现这种情况时需要手动将它进一位。
     *
     * 作者：yhhzw
     * 链接：https://leetcode-cn.com/problems/two-sum/solution/java-shu-xue-jie-ti-by-yhhzw/
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(arr);
    }
}
