
class Solution
{ 
    public static int findSum(int A[],int N) 
    {
       int max=A[0];
       int min=A[0];
       for(int i=0;i<N;i++){
           if(A[i]>max){
               max=A[i];
           }
           else if(A[i]<min){
               min=A[i];
           }
       }
       int sum=min+max;
       return sum;
        
    }
}
/*
Arrays.sort(A);
        int min=A[0];
        int max=A[N-1];
        int sum=min+max;
        return sum;
        
Input:
N = 5
A[] = {-2, 1, -4, 5, 3}
Output: 1
Explanation: min = -4, max =  5. Sum = -4 + 5 = 1

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/
