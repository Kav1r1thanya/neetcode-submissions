class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l =0;
        int r = n-1;
        int maxarea = (r-l)* (Math.min(heights[l],heights[r]));
        while(l<r)
        {
            int mini = Math.min(heights[l],heights[r]);
            int curarea = (r-l)* mini ;
            if(curarea>maxarea)
            {
                maxarea=curarea;
            }
            if(mini==heights[l])
            {
                l++;
            }
            else
            {
                r--;
            }


        }
      return maxarea;  
    }
}
