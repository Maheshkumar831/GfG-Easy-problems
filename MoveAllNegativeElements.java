class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                list.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                list.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=list.get(i);
        }
   }
}

 /*
 Given an unsorted array arr[] of size N having both negative and positive integers. The task is place
 all negative element at the end of array without changing the order of positive element and negative element.
 Example 1:
 Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5



Two pointer approach doesn't work for me😥
     int j=0;
       for(int i=0;i<n;i++){
           if(arr[i]<0){
               j=i;
               break;
           }
           
       }
       for(int i=j+1;i<n;i++){
           if(arr[i]>0){
               int temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
               j++;
           }
       }
      */
