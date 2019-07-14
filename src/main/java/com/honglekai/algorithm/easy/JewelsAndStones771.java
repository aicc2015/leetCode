package com.honglekai.algorithm.easy;

import java.util.HashSet;

/**
 * description
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 *
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 *
 * Example 2:
 *
 * Input: J = "z", S = "ZZ"
 * Output: 0
 *
 * Note:
 *
 *     S and J will consist of letters and have length at most 50.
 *     The characters in J are distinct.
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/7/8 3:17
 * modifyTime
 */
public class JewelsAndStones771 {
    public static int numJewelsInStones(String J, String S) {
        int totalNum = 0 ;
        HashSet hs = new HashSet();

        for (char c : J.toCharArray()){
            hs.add(c);
        }

        for (char c : S.toCharArray()){
            if (hs.contains(c)){
                totalNum++;
            }
        }

        return totalNum;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
}
