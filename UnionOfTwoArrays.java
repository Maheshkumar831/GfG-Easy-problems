class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Arrays.sort(a);
        Arrays.sort(b);
        HashSet<Integer>hs=new HashSet();
        for(int i=0;i<n;i++){
            hs.add(a[i]);
            
        }
        for(int i=0;i<m;i++){
            hs.add(b[i]);
        }
        
        return hs.size();
    }
}
Input
5 3
1 2 3 4 5
1 2 3
Your Output: 
5
Expected Output: 
5
Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(n+m)
