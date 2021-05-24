class Solution {
   
/*public int numTimesAllBlue(int[] light) {
        int max=light[0];
        int ans=0;
        for(int i=0;i<light.length; i++){
            if(light[i]>max)
                max=light[i];
            
            if(max==i+1)
                ans++;
        }
        return ans;
    } */
    
    
    
    public int numTimesAllBlue(int[] light) {
	int switchedOnbulbsSum = 0, count = 0, indexSum = 0;

	for(int i=0; i<light.length; i++) {
		switchedOnbulbsSum+= light[i];
		indexSum += i+1;

		if(switchedOnbulbsSum == indexSum) count++;
	}

	return count;
}
}