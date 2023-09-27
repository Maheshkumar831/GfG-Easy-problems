class Solution
{
    public String is_palindrome(int n)
    {
        int temp=n;
        int rev=0;
        while(n!=0){
            rev=rev*10+(n%10);
            //System.out.println(rev);
            n/=10;
        }
        if(temp==rev){
            return "Yes";
        }
        else{
            return "No";
        }
       /* StringBuilder sb=new StringBuilder();
        
        sb.append(n);
        String str1=sb.toString();
        sb.reverse();
        String str2=sb.toString();
        //System.out.println(str);
        if(str1.equals(str2))
            return "Yes";
        else
            return "No";
        
        
        */
        
    }
}
