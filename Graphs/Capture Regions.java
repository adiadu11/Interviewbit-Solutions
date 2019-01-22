public class Solution {
    public void solve(ArrayList<ArrayList<Character>> a) {
        
        int i, j;
        int r = a.size();
        int c = a.get(0).size();
    
        for (i = 0; i < c; i++)
        {
           char ch = a.get(0).get(i);     
           if (ch == 'O')
           {
               findRegion(a, 0, i, r, c);
           }
        }
        
        for (i = 0; i < c; i++)
        {
           char ch = a.get(r - 1).get(i);     
           if (ch == 'O')t
           {
               findRegion(a, r - 1, i, r, c);
           }
        }
        
        for (i = 0; i < r; i++)
        {
           char ch = a.get(i).get(0);     
           if (ch == 'O')
           {
               findRegion(a, i, 0, r, c);
           }
        }
        
        for (i = 0; i < r; i++)
        {
           char ch = a.get(i).get(c - 1);     
           if (ch == 'O')
           {
               findRegion(a, i, c - 1, r, c);
           }
        }
        
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                if (a.get(i).get(j) == 'O')
                    a.get(i).set(j, 'X');
            }
        }
        
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                if (a.get(i).get(j) == 'U')
                    a.get(i).set(j, 'O');
            }
        }
    }
    
    public void findRegion(ArrayList<ArrayList<Character>> a, int i, int j, int r, int c)
    {
        a.get(i).set(j, 'U');
        int [][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        for (int d = 0; d < 4; d++)
        {
            int diri = i + dir[d][0];
            int dirj = j + dir[d][1];
            
            
            while (diri >= 0 && diri < r && dirj >= 0 && dirj < c && a.get(diri).get(dirj) == 'O')
            {
                findRegion(a, diri, dirj, r, c);                                            
            }
        }
        
    }
}
