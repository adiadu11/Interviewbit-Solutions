/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> a) 
    {
        PriorityQueue<ListNode> p = new PriorityQueue<ListNode>(a.size(), new Comparator<ListNode>()
                                {
                                    public int compare(ListNode x, ListNode y)
                                    {
                                        return x.val - y.val;
                                    }
                                });
        
        for (int i = 0; i < a.size(); i++)
        {
            p.add(a.get(i));
        }
        ListNode head = new ListNode(0);
        ListNode c = head;
        
        while (p.size() > 0)
        {
            ListNode temp = p.poll();       
            c.next = temp;
            if (temp.next != null)
            {
                p.add(temp.next);
            }
            c = c.next;
        }
                                
        return head.next;                   
    }
        
    }

