
# Move Zeroes


## Problem Statement
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



## Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1



## Approach
- We traverse L -> R, one pointer keeps track of if we see zeros
- if yes, we do a swap using temp variable.

## Algorithm

- Start from the left = 0 index
- Traverse R =0 uptil R < nums.len
- if nums[r]!= 0 then 