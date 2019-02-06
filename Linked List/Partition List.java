public class Solution {
    public ListNode partition(ListNode A, int B) 
    {
        ListNode x, curr, prev, prev2, head;
        x = curr = prev = A;
        head = new ListNode(-9999);
        head.next = A;
        x = head;
        while (x.val < B)
        {
            prev = x;
            x = x.next;
        }
        
        prev2 = x;
        curr = x.next;
        
        while (curr != null)
        {
            if (curr.val < B)
            {
                prev2.next = curr.next;
                prev.next = curr;
                curr.next = x;
                prev = curr;
            }
            
            prev2 = curr;
            curr = prev2.next;
        }
        
        
        return head.next;
    }
}
