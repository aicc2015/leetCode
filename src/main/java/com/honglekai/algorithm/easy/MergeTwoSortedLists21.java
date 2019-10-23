package com.honglekai.algorithm.easy;

/**
 * description
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/10/15 1:37
 * modifyTime
 */
public class MergeTwoSortedLists21 {

    /**
     * 方法 1：递归
     *
     * 想法
     *
     * 我们可以如下递归地定义在两个链表里的 merge 操作（忽略边界情况，比如空链表等）：
     *
     * {list1[0]+merge(list1[1:],list2)list1[0]<list2[0]list2[0]+merge(list1,list2[1:])otherwise\left\{ \begin{array}{ll} list1[0] + merge(list1[1:], list2) & list1[0] < list2[0] \\ list2[0] + merge(list1, list2[1:]) & otherwise \end{array} \right. {list1[0]+merge(list1[1:],list2)list2[0]+merge(list1,list2[1:])​list1[0]<list2[0]otherwise​
     *
     * 也就是说，两个链表头部较小的一个与剩下元素的 merge 操作结果合并。
     *
     * 算法
     * 我们直接将以上递归过程建模，首先考虑边界情况。
     * 特殊的，如果 l1 或者 l2 一开始就是 null ，那么没有任何操作需要合并，所以我们只需要返回非空链表。否则，我们要判断 l1 和 l2 哪一个的头元素更小，然后递归地决定下一个添加到结果里的值。如果两个链表都是空的，那么过程终止，所以递归过程最终一定会终止。
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists/solution/he-bing-liang-ge-you-xu-lian-biao-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param l1
     * @param l2
     * @return
     */
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            else if (l2 == null) {
                return l1;
            }
            else if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            }
            else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }

        }

    public static void main(String[] args) {
        MergeTwoSortedLists21 lists = new MergeTwoSortedLists21();
        ListNode l1 = new ListNode(1);
        ListNode l1_2 = new ListNode(2);
        ListNode l1_3 = new ListNode(4);
        l1.next = l1_2;
        l1_2.next = l1_3;

        ListNode l2 = new ListNode(1);
        ListNode l2_2 = new ListNode(3);
        ListNode l2_3 = new ListNode(4);

        l2.next = l2_2;
        l2_2.next = l2_3;
        lists.mergeTwoLists(l1,l2);
    }


}
