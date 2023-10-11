
class Solution
{
    int i=1;
    
  public void printNos(int N)
    {
     
        if(i>N) return;
        System.out.print(i+" ");
        i++;
        printNos(N);
    }
}
/*
Input:
N = 10
Output: 1 2 3 4 5 6 7 8 9 10
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N) (Recursive).*/



