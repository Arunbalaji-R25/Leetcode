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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode helper(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while( l1 != null || l2 != null || carry != 0){
            int dig1 = (l1 != null) ? l1.val:0;
            int dig2 = (l2 != null) ? l2.val:0;
            int sum = dig1 + dig2 + carry;
            int dig = sum%10;
            carry = sum/10;

            ListNode node = new ListNode(dig);
            tail.next = node;
            tail = tail.next;
            l1 = (l1 != null) ? l1.next:null;
            l2 = (l2 != null) ? l2.next:null;
        }

        ListNode res = dummy.next;
        return res;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode ans = helper(l1, l2);
        return reverse(ans);
    }
}