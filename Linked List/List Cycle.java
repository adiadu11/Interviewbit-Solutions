public class Solution {
	public ListNode detectCycle(ListNode a) 
	{
	    ListNode fast, slow, curr;
	    fast = slow = a;
	    int size = 1;
	    slow = slow.next;
	    fast = fast.next.next;
	    while (fast != null && fast.next != null && slow.next != null && fast != slow)
	    {
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    
	    if (fast == null || fast.next == null || slow.next == null)
	    {
	        return null;
	    }
	    
	    curr = slow.next;
	    
	    while (curr != slow)
	    {
	        curr = curr.next;
	        size++;
	    }
	    
	    curr = a;
	    
	    for (int i = 0; i < size; i++)
	    {
	        curr = curr.next;
	    }
	    
	    ListNode k = a;
	    while (curr != k)
	    {
	        curr = curr.next;
	        k =  k.next;
	    }
	    
	    return curr;
	 
	}
}