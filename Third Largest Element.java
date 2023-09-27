class Solution
{
    int thirdLargest(int a[],int n){
        int max=a[0];
	    for(int i=0;i<n;i++){
	        if(max<a[i])
	            max=a[i];
	        
	    }
	    
	   int secondMax=Integer.MIN_VALUE;
	   for(int i=0;i<n;i++){
	        if(secondMax<a[i] && a[i]<max)
            {
                secondMax=a[i];
            
            }
	   }
	  
       int  thirdMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(thirdMax<a[i] && a[i]<secondMax){
                thirdMax=a[i];
            
        }
	       
	   }
	   return thirdMax;
        
       /*Arrays.sort(a);
	    return a[n-3];*/
    }
}
