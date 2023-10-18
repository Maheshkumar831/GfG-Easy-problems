class Solution
{
    static int great(int a,int b){
        if(a==0)
            return b;
        return great(b%a,a);
    }
    public int gcd(int N , int arr[]) 
    { 
       int res=arr[0];
       for(int i:arr){
           res=great(res,i);
           if(res==1)
                return 1;
       }
       
       return res;
    } 
}

/*Input: N = 3, arr[] = {2, 4, 6}
Output: 2
Explanation: GCD of 2,4,6 is 2.

Expected Time Complexity: O(N logN)
Expected Auxiliary Space: O(1)

*/
