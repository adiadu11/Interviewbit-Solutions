public class Solution {
    public int black(String[] A) {
        
        int i, j, count = 0;
        int r = A.length;
        int c = A[0].length();
        boolean[][] visited = new boolean[r][c];
        
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                char ch = A[i].charAt(j);
                if (ch == 'X' && visited[i][j] == false)
                {
                    countGroup(A, visited, i, j, r, c);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public void countGroup(String[] A, boolean[][] visited, int i, int j, int r, int c)
    {
        visited[i][j] = true;
        int [][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        for (int d = 0; d < 4; d++)
        {
            int diri = i + dir[d][0];
            int dirj = j + dir[d][1];
            
            
            while (diri >= 0 && diri < r && dirj >= 0 && dirj < c && A[diri].charAt(dirj) == 'X' && 
                                                        visited[diri][dirj] == false)
            {
                countGroup(A, visited, diri, dirj, r, c);                                            
            }
        }
        
    }
}
