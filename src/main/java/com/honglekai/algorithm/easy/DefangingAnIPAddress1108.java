package com.honglekai.algorithm.easy;

/**
 * description
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 *
 *
 *
 * Example 1:
 *
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 *
 * Example 2:
 *
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/7/8 3:16
 * modifyTime
 */
public class DefangingAnIPAddress1108 {

    public static  String defangIPaddr(String address) {
        String returnStr = address.replaceAll("\\.","[\\.]");
        return returnStr;
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
