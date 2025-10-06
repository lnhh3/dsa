# Two Sum

### Description
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

### Examples

**Example 1:**
```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

**Example 2:**
```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

**Example 3:**
```
Input: nums = [3,3], target = 6
Output: [0,1]
```

### Constraints
- 2 <= nums.length <= 10^4
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
- Only one valid answer exists

### Approach

#### Intuition
We can use a hash map to store the numbers we've seen so far and their indices. For each number, we check if the complement (target - current number) exists in the hash map.

#### Algorithm
1. Create an empty hash map
2. Iterate through the array
3. For each number, calculate the complement (target - number)
4. If complement exists in hash map, return the indices
5. Otherwise, add the current number and its index to the hash map

#### Complexity Analysis
- **Time Complexity**: O(n) - We traverse the array once, and hash map operations are O(1)
- **Space Complexity**: O(n) - Hash map can store up to n elements

### Solution

```python
def twoSum(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """
    seen = {}  # HashMap to store number -> index
    
    for i, num in enumerate(nums):
        complement = target - num
        
        if complement in seen:
            return [seen[complement], i]
        
        seen[num] = i
    
    return []  # Should never reach here given constraints
```

```java
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
        return new int[0];
    }
}
```

```javascript
function twoSum(nums, target) {
    const map = new Map();
    
    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        
        if (map.has(complement)) {
            return [map.get(complement), i];
        }
        
        map.set(nums[i], i);
    }
    
    return [];
}
```

### Notes
- This is a classic hash map problem
- The brute force approach would be O(n²) using nested loops
- Hash map reduces time complexity to O(n) at the cost of O(n) space
- Make sure to check for the complement before adding the current number to avoid using the same element twice
