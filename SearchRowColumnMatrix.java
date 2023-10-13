class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    int i=0;
	    int j=matrix.length-1;
	    while(i<matrix.length-1&&j>=0){//    i             BINARY SEARCH-TC:O(N)   SC:O(1)
	        if(matrix[i][j]==x){//matrix[0][3]=>38==62 no i++ 38>62 //60<62 //69>62  j--51<62 so no element.      
	            return true;
	        }
	        else if(matrix[i][j]>x){
	            j--;
	        }
	        else{
	            i++;
	        }
	    }
	    return false;
	   
	} 
} 

     /*for(int i=0;i<n;i++){                         //LINEAR SEARCH-TC:O(N^2) 
	        for(int j=0;j<m;j++){                                  //   SC:O(1)
	            if(matrix[i][j]==x){
	                return true;
	            }
	           
	        }
	    }
	    return false;

     Input:
n = 3, m = 3, x = 62
matrix[][] = {{ 3, 30, 38},
              {36, 43, 60},
              {40, 51, 69}}
Output: 0
Explanation:
62 is not present in the matrix, 
so output is 0.
	    */
