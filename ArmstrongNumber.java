class Solution {
    static String armstrongNumber(int n){
        int original=n;
        int power=0;
        int rem;
        while(n>0){
            rem=n%10;
            power+=java.lang.Math.pow(rem,3);
            n/=10;
            
        }
        if(power==original)
            return "Yes";
        else
            return "No";
        
    }
}

/*
Input: N = 153
Output: "Yes"
Explanation: 153 is an Armstrong number
since 13 + 53 + 33 = 153.
Hence answer is "Yes".
  */
