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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1 == null || list2 == null)
            return list1;
        ListNode temp1 = new ListNode();
        ListNode temp2 = new ListNode();
        int count = 0;
        temp1 = list1;
        temp2 = list1;
        while(temp1 != null){
            if((count + 1) == a)
                break;
            count++;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp2 != null){
            if(count == b)
                break;
            count++;
            temp2 = temp2.next;
        }
        temp1.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = temp2.next;
        return list1;
    }
}

