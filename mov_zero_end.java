//Move all zeroes to end of array

/*
Example 

Input:
N = 5
Arr[] = {3, 5, 0, 0, 4}
Output: 3 5 4 0 0
Explanation: The non-zero elements
preserve their order while the 0
elements are moved to the right.

*/


/* The logic here is just count the no of zeros in array 
and for all non zero elements store the data in new array 
Then transfer all the non zero element from the new array to old array serialy 
and fill the rest gaps with zeros*/


class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        
        int[] new_arr=new int[n];
        int zero_count=0;
        int j=0;
        
        for(int i=0;i<n;i++){
            
            if(arr[i]==0){ //count the no of zeros
                zero_count++;
            }
            else{
                new_arr[j]=arr[i]; // store the non zero values in new array
                j++;
            }
        }
        for(int i=0;i<n;i++){
            if(i>=(n-zero_count)){ // Place zero in existing gaps in old array
                arr[i]=0;
            }
            else{
                arr[i]=new_arr[i];  // Transfer the nonzero values in old array serialy 
            }
        }
    
       
    }
    
}
