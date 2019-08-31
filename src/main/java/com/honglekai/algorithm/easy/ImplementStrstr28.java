package com.honglekai.algorithm.easy;

/**
 * description
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/8/31 22:14
 * modifyTime
 */
public class ImplementStrstr28 {

    /**
     * 这里先判断是否存在包含，如果包含则求出位置，否则直接返回-1
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        int index = -1;
        if (haystack.contains(needle)){
            index = haystack.indexOf(needle);
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));

    }
}
