class Sol
{
    public static int search(int A[], int N)       //OPTIMIZE APPROACH:TC:O(N) SC:O(1)
    {
        int flag=0;
        for(int i=0;i<N;i++){
            flag^=A[i];
        }
        return flag;
    }
}
        
  /*  for(int i=0;i<N;i++){                   Brute force TC:O(N^2)   SC:O(1)
            int flag=0;
            for(int j=0;j<N;j++){
                if(A[i]==A[j])
                    flag++;
                     
            }
            if(flag==1)
                return A[i];
        
        }
        return -1;
        
    }
}
*/
