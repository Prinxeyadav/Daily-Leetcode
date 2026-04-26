class Solution {
    public int compress(char[] chars) {
        int Count = 1;
        StringBuilder sb = new StringBuilder("");

        sb.append(chars[0]);

        for(int i = 1; i<chars.length; i++) {
            
            if (chars[i-1]!=chars[i]) {
                if(Count>1) {

                    sb.append(Count+"");
                }

                sb.append(chars[i]);
                Count = 1;
            } else {
                Count++;
            }
        }

        if (Count>1) {
            sb.append(Count+"");
        }

        for(int i=0; i<sb.length(); i++) {
            char ch = sb.charAt(i);
            chars[i] = ch;
        }

        return sb.length();
    }
}