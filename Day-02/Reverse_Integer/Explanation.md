# Reverse Integer - Day 03

## Problem
Given a signed 32-bit integer `x`, return `x` with its digits reversed.

If reversing `x` causes it to go outside the signed 32-bit integer range 
[-2^31, 2^31 - 1], then return 0.

---

## Examples
- Input: 123 → Output: 321
- Input: -123 → Output: -321
- Input: 120 → Output: 21

---

## Approach

1. Initialize a variable `rev = 0`
2. Extract last digit using:
   digit = x % 10

3. Add digit to reversed number:
   rev = rev * 10 + digit

4. Remove last digit from original number:
   x = x / 10

5. Repeat until x becomes 0

---

## Important Edge Case (Overflow)

Before updating `rev`, check:
- If `rev > Integer.MAX_VALUE / 10`
- Or `rev < Integer.MIN_VALUE / 10`

If true → return 0

---

## Time Complexity
- O(log n) → number of digits

## Space Complexity
- O(1)

---

## Key Learning
- Use modulo (%) to extract digits
- Use division (/) to shrink number
- Always handle overflow in integer problems