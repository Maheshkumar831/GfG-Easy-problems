 class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i+1==arr[i]){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
/*
Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
*/
