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
       }
       return res;
    } 
}
