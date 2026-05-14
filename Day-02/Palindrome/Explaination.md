# Palindrome - Day 02

## Problem
Check whether a given string is a palindrome or not.

---

## What is a Palindrome?
A palindrome is a string that reads the same forward and backward.

Examples:
- "madam" → Palindrome
- "racecar" → Palindrome
- "hello" → Not a palindrome

---

## Approach 1 (Reverse Method)

1. Reverse the given string
2. Compare it with the original string
3. If both are equal → Palindrome
4. Else → Not a palindrome

---

## Approach 2 (Two Pointer - Optimized)

1. Take two pointers:
   - Left → start of string
   - Right → end of string

2. Compare characters:
   - If they are equal → move inward
   - If not equal → Not a palindrome

3. Continue until left >= right

---

## Time Complexity
- O(n)

## Space Complexity
- O(1) (for two pointer approach)

---

## Key Learning
- String comparison using `.equals()`
- Efficient checking using two pointers
- Avoid unnecessary extra space