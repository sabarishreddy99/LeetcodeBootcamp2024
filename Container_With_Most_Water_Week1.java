class Solution {
    public int maxArea(int[] height) {

        
            int l=0;
            int r=height.length-1;
            int maxarea=0;
            int area =0;

            while(l<r){
                
                 int minheight=Math.min(height[l],height[r]);
                  int diff = r-l;
                  area=minheight*diff;
                if(maxarea<area){
                    // System.out.println(area);
                    maxarea=area;
                }
                if(height[l]<height[r]){
                    l++;
                }
                else{
                    if(height[r]<height[l]){
                        r--;
                    }else{
                        if(height[l+1]<height[r]){
                            l++;
                        }else{
                            r--;
                        }
                    }
                }

               

            }

            return maxarea;
        
        
    }
}
