class Compute {
    
    public void rotate(int arr[], int n)
    {
        int k=1;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,k,n-1);
        
    }
    public static void reverse(int arr[],int start,int end){
        while(start<=end){
             int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;
        }
        
        
       
    }
}
/*
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
 */
