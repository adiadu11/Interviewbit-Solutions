public class Solution {
    
    
    public int knight(int A, int B, int C, int D, int E, int F) {
        
        int [][] dir = { {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {-2, - 1}, 
                            {-2, 1}, {2, 1} };
                            
        class Cord
        {
            int x, y;
        
            Cord(int x, int y)
            {
                this.x = x;
                this.y = y;
            }
        }
        
        Queue<Cord> q = new LinkedList<Cord>();
        boolean [][] visited = new boolean [A + 1][B + 1];
        visited[C][D] = true;
        q.add(new Cord(C, D));
        int count = 0;
        
        while (!q.isEmpty())
        {
            int s = q.size();
            
            for (int i = 0; i < s; i++)
            {
                Cord obj = q.poll();
                int x = obj.x;
                int y = obj.y;
                if (x == E && y == F)
                    return count;
                for (int j = 0; j < dir.length; j++)
                {
                    int newx = x + dir[j][0];
                    int newy = y + dir[j][1];
                    
                    if (newx >= 1 && newx <=A && newy >= 1 && newy <=B && visited[newx][newy] == false)
                    {
                        visited[newx][newy] = true;
                        q.add(new Cord(newx, newy));
                    }
                }
            }
            count++;
        }
        return -1;
    }
}
