/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
 
public class Solution {
    
    int n = 0;
    public int inorder(int k, TreeNode root)
    {
        if (root == null)
            return 0;
        
        int a = inorder(k, root.left);
        //a.add(root.val);// = root.data;
        if (n == k)
        return root.val;
        n++;
        a = inorder(k, root.right);
        return a;
    }
    
    public int kthsmallest(TreeNode root, int B) {
        
        Stack<TreeNode> stk = new Stack<TreeNode>();
        int n = 1;
        TreeNode A = root;
        while (true)
        {
            while (A != null)
            {
                stk.push(A);
                A = A.left;
            }
            if (n == B)
                return stk.peek().val;
            if (stk.empty())
                break;
            TreeNode temp = stk.peek();
            stk.pop();
            
            
            A = temp.right;
            n++;
        }
        return 0;
        /*
        
        
        
        //ArrayList<Integer> arl = new ArrayList<Integer>();
        return inorder(B, root);
        //return arl.get(B - 1);*/
    }
}
