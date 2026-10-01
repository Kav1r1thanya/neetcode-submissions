class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++)
        {
            sum += nums[r];
            while(sum>=target)
            {
                minlen=Math.min(minlen,r-l+1);
                sum-=nums[l];
                l++;
                
            }
        }
        int min = 0;
        if(minlen!=Integer.MAX_VALUE)
        {
            min = minlen;
        }
        return min;
        
    }
}