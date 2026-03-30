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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dumm = new ListNode();
        ListNode res = dumm;
        int tot = 0;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            tot = carry;
            if(l1 != null){
                tot += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                tot += l2.val;
                l2 = l2.next;
            }
            int num = tot%10;
            carry = tot/10;
            dumm.next = new ListNode(num);
            dumm = dumm.next;
        }
        return res.next;
    }
}