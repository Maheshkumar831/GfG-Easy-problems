class Solution {
    static long factNum(int n,int r){     //Only 50 testcase passed...because they are bigger inputs i can't solve long datatype.Upcoming days i will try to solve the problem.
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);//1*3..1*3,3/1*3...1*3,3/1*3,3/1*3/2*3
            res=res/(i+1);//3/1=3..3/1,3/1*3/2=3...3/1*3/2*3/3=
        }
        return res;
        
    }
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList<Long>list=new ArrayList<Long>();
        for(int i=1;i<=n;i++){
            list.add(factNum(n-1,i-1));//3,0..3,1..3,2..3,3
        }
        return list;
       
    }
}
/*
Given a positive integer N, return the Nth row of pascal's triangle.
Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.

Example :
1
1 1
1 2 1
1 3 3 1
For N = 3, return 3rd row i.e 1 2 1

Example 1:

Input:
N = 4
Output: 1 3 3 1
Explanation: 4th row of pascal's triangle
is 1 3 3 1.
Example 2:

Input:
N = 5
Output: 1 4 6 4 1
Explanation: 5th row of pascal's triangle
is 1 4 6 4 1.
 

Your Task:
Complete the function nthRowOfPascalTriangle() which takes n, as input parameters and returns an array representing the answer. 
The elements can be large so return it modulo 109 + 7. You don't to print answer or take inputs.

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(N2)
*/
