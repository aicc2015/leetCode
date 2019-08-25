package com.honglekai.algorithm.easy;


import com.sun.deploy.util.StringUtils;

/**
 * description
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * company YH
 *
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/8/25 22:05
 * modifyTime
 */
public class LongestCommonrefix14 {

    /**
     * 方法一：水平扫描法
     *
     * 思路
     *
     * 首先，我们将描述一种查找一组字符串的最长公共前缀 LCP(S1…Sn)LCP(S_1 \ldots S_n)LCP(S1​…Sn​) 的简单方法。
     * 我们将会用到这样的结论：
     *
     * LCP(S1…Sn)=LCP(LCP(LCP(S1,S2),S3),…Sn)LCP(S_1 \ldots S_n) = LCP(LCP(LCP(S_1, S_2),S_3),\ldots S_n)LCP(S1​…Sn​)=LCP(LCP(LCP(S1​,S2​),S3​),…Sn​)
     *
     * 算法
     *
     * 为了运用这种思想，算法要依次遍历字符串 [S1…Sn][S_1 \ldots S_n][S1​…Sn​]，当遍历到第 iii 个字符串的时候，找到最长公共前缀 LCP(S1…Si)LCP(S_1 \ldots S_i)LCP(S1​…Si​)。当 LCP(S1…Si)LCP(S_1 \ldots S_i)LCP(S1​…Si​) 是一个空串的时候，算法就结束了。 否则，在执行了 nnn 次遍历之后，算法就会返回最终答案 LCP(S1…Sn)LCP(S_1 \ldots S_n)LCP(S1​…Sn​)。
     *
     * 找到最长公共前缀
     *
     * 图 1. 查找最长公共前缀 （水平扫描法）
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/longest-common-prefix/solution/zui-chang-gong-gong-qian-zhui-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param strs
     * @return
     */
    public static  String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix == null || "".equals(prefix)) return "";
            }
        return prefix;
    }


    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

}
