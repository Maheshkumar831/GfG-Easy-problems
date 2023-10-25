class Solution { 
    
    static int sum(int num,int p){
        int sum=0;
        while(num!=0){
            int l=num%10;
            sum+=(int)Math.pow(l,p);
            num/=10;
        }
        
        return sum;
    }
  
     static int isHappy(int N) { 
        int temp=N,p=2;
        N=sum(N,p);
        while(N/10>0){
            N=sum(N,p);
        }
        if(N==1)
            return 1;
        
        return 0;
         
     }
}
/*
Input: 
N = 19
Output: 
1
Explanation:
19 is a Happy Number,
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
As we reached to 1, 
19 is a Happy Number.*/
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
       


     
