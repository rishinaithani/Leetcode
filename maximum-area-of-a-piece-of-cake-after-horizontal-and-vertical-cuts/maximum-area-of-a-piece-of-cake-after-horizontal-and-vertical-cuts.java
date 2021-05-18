/*Sort the horizontalCuts and verticalCuts array
First we will see the horizontal cuts, to start get the max between the first cut and the difference of the height and the last element
Loop through the remaining elements from index 1 to the length and get the maxHeight computed.
Do the same for vertical cuts and compute the maxWidth
return the product of maxHeight and maxWidth
Since the test cases are huge we want to convert the area to long data type and the result needs to be the % of 1000000007
*/

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        int hLength = horizontalCuts.length;
        int vLength = verticalCuts.length;
                
        int maxHeight = Math.max(horizontalCuts[0]-0, h - horizontalCuts[hLength-1]);
        for (int i = 1;i<hLength; i++){
            int diff = horizontalCuts[i] - horizontalCuts[i-1];
            maxHeight = Math.max(maxHeight, diff);
        }
        
        
        int maxWidth = Math.max(verticalCuts[0]-0, w - verticalCuts[vLength-1]);
        for (int i = 1;i<vLength; i++){
            int diff = verticalCuts[i] - verticalCuts[i-1];
            maxWidth = Math.max(maxWidth, diff);
        }
        
        long ans = 1L * maxHeight * maxWidth;
        
        return  (int) (ans % 1000000007);
    }
}