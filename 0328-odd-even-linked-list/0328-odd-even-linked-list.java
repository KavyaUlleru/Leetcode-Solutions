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
        // if(head==null || head.next==null)
        //     return head;
        // ListNode temp=head;
        // ArrayList<Integer> list=new ArrayList<>();
        // while(temp!=null){
        //     list.add(temp.val);
        //     if(temp.next==null)break;
        //     temp=temp.next.next;
        // }
        // temp=head.next;
        // while(temp!=null){
        //     list.add(temp.val);
        //     if(temp.next==null)break;
        //     temp=temp.next.next;
        // }
        // temp=head;
        // for(int i=0;i<list.size();i++){
        //     temp.val=list.get(i);
        //     temp=temp.next;
        // }
        // return head;
        if(head==null || head.next==null)
            return head;
        ListNode oddp=head;
        ListNode evenp=head.next;
        ListNode head1=evenp;
        while(evenp!=null && evenp.next!=null){
            oddp.next=oddp.next.next;
            evenp.next=evenp.next.next;

            oddp=oddp.next;
            evenp=evenp.next;
        }
        oddp.next=head1;
        return head;
    }
}