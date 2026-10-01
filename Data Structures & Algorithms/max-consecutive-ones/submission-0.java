class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int curmax=0;
        int maxlen = 0;
        for(int r=0;r<nums.length;r++)
        {
            if(nums[r]==1)
            {
                curmax = r-l+1;
                maxlen = Math.max(curmax,maxlen);
            }
            else
            {
                l=r+1;
                curmax=0;
            }
        }
        return maxlen;
        
    }
}