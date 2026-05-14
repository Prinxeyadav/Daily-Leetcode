class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1; // Pointer for string a
        int j = b.length() - 1; // Pointer for string b
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry; // Start with the carry from the last step
            
            if (i >= 0) {
                sum += a.charAt(i--) - '0'; // Add digit from a and move pointer
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0'; // Add digit from b and move pointer
            }
            
            res.append(sum % 2); // The digit to keep (0 or 1)
            carry = sum / 2;     // The new carry (0 or 1)
        }
        
        // Since we added digits from right to left, the string is backwards
        return res.reverse().toString();
    }
}