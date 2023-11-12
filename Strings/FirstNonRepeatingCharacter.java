class Solution
{
    //Function to find the first non-repeating character in a string.
    static final int CHAR=256;
    static char nonrepeatingCharacter(String S)
    {
        int n=S.length();
        int fi[]=new int[CHAR];
        Arrays.fill(fi,-1);
        for(int i=0;i<n;i++){
            if(fi[S.charAt(i)]==-1){
                fi[S.charAt(i)]=i;
            }
            else{
                fi[S.charAt(i)]=-2;
            }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<CHAR;i++){
            if(fi[i]>=0){
                res=Math.min(res,fi[i]);
            }
        }
        res=(int)res;
        return (res==Integer.MAX_VALUE)?-1:res;
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        int n=S.length();                   //BETTER APPROACH
        int count[]=new int[256];
        for(int i=0;i<n;i++){
            count[S.charAt(i)]++;
        }
        for(int i=0;i<n;i++){
            if(count[S.charAt(i)]==1)
                return S.charAt(i);
        }
        return '$';
        
        
        
--------------------------------------------------------------------------------------------------------------------------------------------------------------------

        int n=S.length();                       //BRUTE FORCE APPROACH
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<n;j++){
                if(i!=j && S.charAt(i)==S.charAt(j)){
                    flag=true;
                    break;
                }
                
            }
            if(flag==false)
                return S.charAt(i);
        }
        return '$';
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  /*
  Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.
Example 2:

Input:
S = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is
the character which is non-repeating. 
Your Task:
You only need to complete the function nonrepeatingCharacter() that takes string S as a parameter and returns the character. If there is no non-repeating character then return '$' .

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |S|
  */
