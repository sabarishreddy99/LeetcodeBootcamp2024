class Solution {
    public int videoStitching(int[][] clips, int time) {
        int min=0;
        int max=0;
        int total = 0;

        while(max<time){
            for(int i=0;i<clips.length;i++){
                int l=clips[i][0];
                int r=clips[i][1];
                if(l<=min && r>max ){
                      max=r;
                }
            }

            if(min==max){
                return -1;
            }

            total+=1;
            min=max;

        }

        return total;
        
    }
}


// 0.         1.         2.          3.       4.      5.       6.      7.      8.     9.    10.
// mn(0)---------------mx(2)
//                                            mn(4)-----------mx(6)
//                                                                             mn(8)--------mx(10)
//          mn(1)--------------------------------------------------------------------mx(9)
//          mn(1)-------------------------------------mx(5)
//                                                    mn(5)--------------------------mx(9)                                                                   
