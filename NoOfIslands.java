class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
            
        }
        return count;
    }
        public static void dfs(char grid[][],int i,int j){
            int n=grid.length;
            int m=grid[0].length;
            if(i<0||j<0||i>=n||j>=m||grid[i][j]=='0'){
                return;
            }
            grid[i][j] ='0';
            
            dfs(grid,i,j+1);
            dfs(grid,i+1,j);
            dfs(grid,i-1,j);
            dfs(grid,i,j-1);
            dfs(grid,i+1,j+1);
            dfs(grid,i-1,j-1);
            dfs(grid,i+1,j-1);
            dfs(grid,i-1,j+1);
        }
  /*
  Given a grid of size n*m (n is the number of rows and m is the number of columns in the grid) consisting of '0's (Water) and '1's(Land). Find the number of islands.

Note: An island is either surrounded by water or boundary of grid and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.

Example 1:

Input:
grid = {{0,1},{1,0},{1,1},{1,0}}
Output:
1
Explanation:
The grid is-
0 1
1 0
1 1
1 0
All lands are connected.
Example 2:

Input:
grid = {{0,1,1,1,0,0,0},{0,0,1,1,0,1,0}}
Output:
2
Expanation:
The grid is-
0 1 1 1 0 0 0
0 0 1 1 0 1 0 
There are two islands :- one is colored in blue 
and other in orange.
Your Task:
You don't need to read or print anything. Your task is to complete the function numIslands() which takes the grid as an input parameter and returns the total number of islands.

Expected Time Complexity: O(n*m)
Expected Space Complexity: O(n*m)

Constraints:
1 ≤ n, m ≤ 500*/
