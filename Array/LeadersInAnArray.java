class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer>list=new ArrayList<Integer>();
        int max=arr[n-1];
        list.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(list);
        return list;
        
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer>list=new ArrayList<Integer>();
        int flag=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>=arr[j]){
                    flag=1;
                }
                else{
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                list.add(arr[i]);
            }
        }
        list.add(arr[n-1]);
        return list;
        
        
        
    }
}
