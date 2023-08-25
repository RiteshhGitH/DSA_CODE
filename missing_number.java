/* 
Given an array of size N-1 such that it only contains distinct 
integers in the range of 1 to N. Find the missing element.

Input:
N = 5
A[] = {1,2,3,5}
Output: 4

Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


*/

class Solution {
    int missingNumber(int array[], int n) {
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }

        return expectedSum - actualSum;
    }
}
