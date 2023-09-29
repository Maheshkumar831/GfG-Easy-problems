class Solution
{
    public int distance(int x1, int y1, int x2, int y2)
    {
        int ans= (int)(Math.round(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2))));
        return ans;
    }
}
/*
Input: 0 0 2 -2
Output: 3
Explanation: Distance between (0, 0) 
and (2, -2) is 3.
*/
