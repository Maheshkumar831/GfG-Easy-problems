class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
       int flag=0;
        if(n==1)
            return true;
        for(int i=1;i<n;i++){
            flag=0;
            if(arr[i]>=arr[i-1]){
                flag++;
            }
            else{
                flag=0;
                break;
            }
            
        }
        if(flag>0){
            return true;
        }
        else{
            return false;
        }
        
        
        
    }
}
/*
Example 1:

Input:
N = 5
arr[] = {10, 20, 30, 40, 50}
Output: 1
Explanation: The given array is sorted.
Example 2:

Input:
N = 6
arr[] = {90, 80, 100, 70, 40, 30}
Output: 0
Explanation: The given array is not sorted.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
  */
