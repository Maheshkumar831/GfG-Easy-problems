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
