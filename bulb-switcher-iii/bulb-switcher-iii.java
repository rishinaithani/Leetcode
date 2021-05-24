class Solution {
   
public int numTimesAllBlue(int[] light) {
        int max=light[0];
        int ans=0;
        for(int i=0;i<light.length; i++){
            if(light[i]>max)
                max=light[i];
            
            if(max==i+1)
                ans++;
        }
        return ans;
    }
}