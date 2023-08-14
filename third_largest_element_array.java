/* THIRD LARGEST ELEMENT IN ARRAY */

/*the logic is local max checks the max of the array every time it iterates
	        ones the max is set it checks the count where it needs to place the max 
	        is it first_max or second_max or third_max 
	        once it is done a benchmark is set , i.e the array element a[i] must be less than 
	        the set max values ie first_max or second_max then it again starts to iterate */
class Solution
{
    int thirdLargest(int a[], int n)
    {
	    
	    int max=0;
	    int first_max=Integer.MAX_VALUE; 
	    int second_max=Integer.MAX_VALUE;
	    int third_max=Integer.MAX_VALUE;
	    int count=3; // number of thimes the while loop will iterate to find the fist second and third max
	    
	    while (count!=0){
	        
            for(int i=0;i<n;i++){
	            
	            // setting the benchmark
                if(a[i]>max && a[i]<first_max && a[i]<second_max){  // max is the local max 
	                max=a[i];
                }
                
	        } 
	        
	        if(count==3){
	            first_max=max;
	        }
	        if(count==2){
	            second_max=max;
	        }
	        if(count==1){
	            third_max=max;
	        }
	        count--;
	        max=0; // nessesary to reset max value as it is affecting the search
	    }
	    return third_max;
    }
}
