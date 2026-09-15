class Solution {
    public boolean isPalindrome(String s) {

        int k = s.length();
        String lc = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++)
        {
        
            if(Character.isLetterOrDigit(lc.charAt(i)))
            {
                sb=sb.append(lc.charAt(i));
            }
        }
        int n = sb.length();
        int l=0;
        int r = n-1;
        while(l<r)
        {
            if(sb.charAt(l)!=sb.charAt(r))
            {
                return false;
            }
            else
            {
                l++;
                r--;
            }
        }
        return true;
        

        
    }
}
