/* 
Given an array of size N-1 such that it only contains distinct 
integers in the range of 1 to N. Find the missing element.

Input:
N = 5
A[] = {1,2,3,5}
Output: 4

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9
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
