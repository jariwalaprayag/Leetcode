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
    ListNode forward = new ListNode();
    int forward_count = 1;
    int backward_count = 0;
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null)
            return head;
        ListNode temp = new ListNode();
        temp = head;
        swap(temp, k);
        return head;
    }
    void swap(ListNode temp, int k){
        if(temp == null)
            return;
        if(forward_count == k)
            forward = temp;
        forward_count++;
        swap(temp.next, k);
        backward_count++;
        if(backward_count == k){
            int temp1 = forward.val;
            forward.val = temp.val;
            temp.val = temp1;
        }
        return;
    }   
}