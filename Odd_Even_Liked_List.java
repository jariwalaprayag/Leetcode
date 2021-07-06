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
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return head;
        ListNode even_pointer = head;
        ListNode odd_pointer = head.next;
        ListNode odd_head = odd_pointer;
        while(odd_pointer != null && odd_pointer.next != null){
            even_pointer.next = odd_pointer.next;
            even_pointer = even_pointer.next;
            odd_pointer.next = even_pointer.next;
            odd_pointer = odd_pointer.next;
        }
        even_pointer.next = odd_head;
        return head;
    }
}