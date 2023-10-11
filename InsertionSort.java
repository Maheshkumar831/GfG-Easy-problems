class Solution
{
  
  public void insertionSort(int arr[], int n)                             //Selection Sort-Select the minimum element in array
  {                                                                       //Bubble Sort-Push max element to the last by adjacent swap
      for(int i=0;i<n;i++){                                               //Insertion Sort-Take an element place at on correct order 
          int j=i;
          while(j>0 && arr[j-1]>arr[j]){
             int temp=arr[j-1];
             arr[j-1]=arr[j];
             arr[j]=temp;
             j--;
             
          }
      }
  }
}
/*
Input:
N = 5
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9
Expected Time Complexity: O(N*N).
Expected Auxiliary Space: O(1).
  */
