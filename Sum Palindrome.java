class Solution {
   
    static long isSumPalindrome(long n){
        int i=1;
        while(i<=5){
            long rev=0;
            long temp=n;
            while(temp!=0){
                rev=rev*10+(temp%10);
                temp/=10;
            } 
            if(n==rev)
                return n;
            long sum=n+rev;//100
            if(isPal(sum))
                return sum;
            n=sum;
            i++;
        }
        
        return -1;
        
    }
    static boolean isPal(long sum){
        long dup=sum;
        long reverse=0;
        while(dup!=0){
            reverse=reverse*10+(dup%10);
            dup/=10;
        }
        return sum==reverse;
         
    }
}
