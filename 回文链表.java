/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<Integer>();
        ListNode savenode = head;
        while (savenode != null) {
            vals.add(savenode.val);
            savenode = savenode.next;
        }
        int first = 0;
        int end = vals.size() - 1;
        while (first < end) {
            if (!vals.get(first).equals(vals.get(end))) {
                return false;
            }
            first++;
            end--;
        }
        return true;
    }
}