public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) 
    {
        int sum = 0, carry = 0;
        
        addZero(A, B);
        
        sum = A.val + B.val;
        if (sum > 9)
        {
            carry = 1;
            sum = sum % 10;
        }
        ListNode C = new ListNode(sum);
        ListNode temp = C;
        A = A.next;
        B = B.next;
        while (A != null && B != null)
        {
            sum = A.val + B.val + carry;
            if (sum > 9)
            {
                carry = 1;
                sum = sum % 10;
            }
            else
                carry = 0;
                
            temp.next = new ListNode(sum);
            temp = temp.next;
            A = A.next;
            B = B.next;
        }
        
        if (carry == 1)
        {
            temp.next = new ListNode(1);
        }
        
        
        return C;
        
    }
    
    public void addZero(ListNode A, ListNode B)
    {
        ListNode a = A, b = B;
        
        while (A.next != null && B.next != null)
        {
            A = A.next;
            B = B.next;
        }
        
        if (A.next == null)
        {
            a =  A;
            b = B;
        }
        else
        {
            a = B;
            b = A;
        }
        
        while (b.next != null)
        {
            a.next = new ListNode(0);
            b = b.next;
            a = a.next;
        }
    }
}
