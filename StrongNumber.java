class Solution
{
    static int f[]=new int[10];
    static void fact()
    {
        f[0]=1;
        f[1]=1;
        for(int i=2;i<10;i++){
            f[i]=f[i-1]*i;//f(2)=f(1)*2=2,f(3)=f(2)*3=6
        }

    }
    public int is_StrongNumber(int n)
    {
        fact();
        int temp=n;
        int Sum=0;
        while(temp!=0){
            Sum+=f[temp%10];//5!=120+24+1
            temp/=10;
        }
        if(Sum==n){//145==145
            return 1;
            
        }
        return 0;
        
    }
}
/*
Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number. Given a number, the task is to check if it is a Strong Number or not.
 

Example 1:

Input: 145
Output: 1
Explanation: 1! + 4! + 5! = 145
Example 2:

Input: 5314
Output: 0
Explanation: 5! + 3! + 1! + 4! 
is not equal to 5314.
 

Your Task:
You don't need to read or print anything. Your task is to complete the function is_StrongNumber() which takes the number as input parameter and returns 1 if it is Strong Number otherwise returns 0.
 

Expected Time Complexity : O(Number of digits in N)
Expected Space Complexity: O(1)
  */
