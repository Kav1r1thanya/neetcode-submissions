class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int num:nums1)
        {
            seen.add(num);
            
        }
        for(int num:nums2)
        {
            if(seen.contains(num))
            {
                res.add(num);
            }
        }
        int[] arr = new int[res.size()];
        int i=0;
        for(Integer num: res)
        {
            arr[i]=num;
            i++;
        }
        return arr;
    }
}