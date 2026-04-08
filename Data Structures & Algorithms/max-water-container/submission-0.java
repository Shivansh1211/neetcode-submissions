class Solution {
    public int maxArea(int[] heights) {
           int i=0;
           int j=heights.length-1;
           int maxAreas=0;
           while(i<j)
           {
             int height= Math.min(heights[i],heights[j]);
             int width=j-i;

             int area=height*width;

              maxAreas = Math.max(area,maxAreas);

             if(heights[i]<heights[j])
             {
                i++;
             }
             else
             {
                j--;
             }
           }
           return maxAreas;
    }
}
