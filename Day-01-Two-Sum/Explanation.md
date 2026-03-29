# Two Sum - Day 01

## Problem
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to target.

---

## Approach (HashMap - Two Pass)

1. First, store all elements in a HashMap:
   - Key → number
   - Value → index

2. Traverse the array again:
   - For each element, calculate:
     complement = target - current element

3. Check:
   - If complement exists in HashMap
   - Ensure it is not the same index

4. Return both indices

---

## Code Logic
- First loop builds the map
- Second loop finds the pair using `target - nums[i]`

---

## Time Complexity
- O(n) → Two loops

## Space Complexity
- O(n) → HashMap storage

---

## Key Learning
- HashMap helps reduce time complexity from O(n²) to O(n)
- Always check index to avoid using same element twice