
class Solution
{
    public static void sort012(int a[], int n)
    {
        //int arr2[]=new int[];
        int zeroes=0;
        int ones=0;
        int twos=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                zeroes++;
            }
            else if(a[i]==1){
                ones++;
            }
            else{
                twos++;
            }
            
        }
        for(int i=0;i<zeroes;i++)a[i]=0;
        for(int i=zeroes;i<zeroes+ones;i++)a[i]=1;
        for(int i=zeroes+ones;i<n;i++)a[i]=2;
        
    }
}
/*
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.
*/
