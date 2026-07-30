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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // int size=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;
        // }
        // if(size==n)
        //     return head.next;
        // int pos=size-n-1;
        
        // ListNode cur=head;
        // for(int i=0;i<pos;i++)
        //     cur=cur.next;
        // cur.next=cur.next.next;
        // return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        for(int i=0;i<=n;i++){
            if(fast==null)return head;
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        if(slow.next!=null)
            slow.next=slow.next.next;
        return dummy.next;
    }
}