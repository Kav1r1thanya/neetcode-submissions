class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num: nums)
        {
            seen.add(num);
        }
        if(nums.length==0)
        {
            return 0;
        }
        int min = Integer.MIN_VALUE;
        int res = 0;
        int max = 0;
        for(Integer num: seen)
        {
            
            if(!seen.contains(num-1))
            {
                min=num;
            res = 1;
            int cur = num;
            while(seen.contains(cur+1))
            {
                res++;
                cur++;
            }
            max = Math.max(max,res);
            }
        }
        
    
        return max;
        
    }
}
