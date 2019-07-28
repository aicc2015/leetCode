package com.honglekai.algorithm.easy;

import java.util.Stack;

/**
 * description 有效的括号
 *给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 *     左括号必须用相同类型的右括号闭合。
 *     左括号必须以正确的顺序闭合。
 *
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 *
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 *
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 *
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 *
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/7/28 23:36
 * modifyTime
 */
public class ValidParentheses20 {


    /**
     * 1.首先分割字符串
     * 2.根据栈的特性来处理
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        boolean isValid = false;
        Stack<String> stringStack = new Stack<String>();
        for (int i=0;i<s.length();i++){
            String splitStr = s.substring(i,i+1);
            if (!stringStack.isEmpty()){
                if (
                        "[]".equals(stringStack.lastElement()+splitStr)
                        || "{}".equals(stringStack.lastElement()+splitStr)
                        || "()".equals(stringStack.lastElement()+splitStr)
                        ){

                    stringStack.pop();
                }else{
                    stringStack.push(splitStr);
                }
            }else {
                stringStack.push(splitStr);
            }
        }
        if (stringStack.isEmpty()){
          isValid = true;
        }
        return isValid;
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
}
