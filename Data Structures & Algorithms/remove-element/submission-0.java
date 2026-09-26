class Solution {
    public int removeElement(int[] nums, int val) {

        int l = 0;
        int c =0;
        for(int r = 0;r<nums.length;r++)
        {
            if(nums[r]!=val)
            {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            else
            {
                c++;
            }
        }
        int k = nums.length-c;
        return k;
        
        
    }
}