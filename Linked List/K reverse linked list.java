public class Solution {
    public ListNode reverseList(ListNode A, int B) 
    {
        ListNode curr = A, temp, first = null, prev, n, head = null;
        
        while (curr != null)
        {
            prev = null;
            int k = 0;
            temp = curr;
            
            while (k < B && curr != null)
            {
                n = curr.next;
                curr.next = prev;
                prev = curr;
                curr = n;
                k++;
            }
            
            if (first != null)
            {
                first.next = prev;
            }
            else
            {
                head = prev;
            }
            
            first = temp;
        }
        
        return head;
    }
}
