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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode dummy=new ListNode(0);
        // ListNode cur=dummy;
        // ListNode temp1=list1;
        // ListNode temp2=list2;
        // while(temp1!=null && temp2!=null){
        //     if(temp1.val<temp2.val){
        //         cur.next=temp1;
        //         temp1=temp1.next;
        //     }else{
        //         cur.next=temp2;
        //         temp2=temp2.next;
        //     }
        //     cur=cur.next;
        // }
        // if(temp1!=null){
        //     cur.next=temp1;
        // }
        // if(temp2!=null){
        //     cur.next=temp2;
        // }
        // return dummy.next;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }

    }
}