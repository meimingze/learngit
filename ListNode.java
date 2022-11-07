//---------------------------------两数相加------------------------------------------------

//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//请你将两个数相加，并以相同形式返回一个表示和的链表。
//你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//思路：利用数学的方法，模拟进位运算，并且通过虚拟节点，将每一位保存到新的链表中去，注意其中头节点和尾节点中所包含的数据




import java.util.List;

public class ListNode {
     public static void main(String[] args) {
         ListNode l1 = new ListNode(451);
         ListNode l2 = new ListNode(592);
         Solution solution =new Solution();
         solution.addTwoNumbers(l1,l2);


     }
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode preparenode = new ListNode(0);
        ListNode currentnode = preparenode;
        int carry = 0;
        while(l1 != null || l2 != null){
            int valuel1 = l1 == null?0:l1.val;
            int valuel2 = l2 == null?0:l2.val;
            int sum = valuel1 + valuel2 +carry;
            int result = sum % 10;
            if (sum >= 10){
                carry = 1;
            }
            else{
                carry = 0;
            }
            currentnode.next = new ListNode(result);
            currentnode = currentnode.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(carry == 1){
            currentnode.next = new ListNode(1);
        }

        return preparenode.next;
    }
}