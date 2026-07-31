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
    public ListNode sortList(ListNode head) {
        // Bubblesort
        // int size=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;
        // }
        // for(int i=0;i<size;i++){
        //     ListNode cur=head;
        //     for(int j=0;j<size-i-1;j++){
        //         if(cur.val>cur.next.val)
        //         {
        //             int tem=cur.val;
        //             cur.val=cur.next.val;
        //             cur.next.val=tem;
        //         }
        //         cur=cur.next;
        //     }
        // }
        // return head;

       /* using arraylist
        ListNode temp=head;
        List<Integer> a=new ArrayList<>();
        while(temp!=null){
            a.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(a);
        temp=head;
        int i=0;
        while(temp!=null){
            temp.val=a.get(i++);
            temp=temp.next;
        }
        return head;
        */
        if(head==null || head.next==null)
            return head;
        ListNode left=null;
        ListNode right=null;
        if(head.next.next==null){
            right=sortList(head.next);
            head.next=null;
            left=sortList(head);
        }else{
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode temp=slow.next;
            slow.next=null;
            left=sortList(head);
            right=sortList(temp);
        }
        return merge(left,right);
    }
    public ListNode merge(ListNode temp1,ListNode temp2){
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                cur.next=temp1;
                temp1=temp1.next;
            }else{
                cur.next=temp2;
                temp2=temp2.next;
            }
            cur=cur.next;
        }
        if(temp1!=null){
            cur.next=temp1;
        }
        if(temp2!=null){
            cur.next=temp2;
        }
        return dummy.next;
    }
}