class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null) return 0;
        int islandCount = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j =0; j < grid[0].length; j++) {
                if(grid[i][j] == '1')
                {
                    //increase our island count
                    ++islandCount;
                    //change any other land (or 1's) connected : to Zeroes(0)
                    changeLandToWater(grid,i,j); 
                }
                
            }
        }
        return islandCount;
    }
    
    private void changeLandToWater(char[][] grid,int i,int j)
    {
        //base case conditions
        //1row less than 0
        //2row greater than grid.length (row length)
        //3cloumn lessthan 0
        //4column gretaer than grid[0].length (coumn length)
        //5if position is a '0'
        
        if( i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0')
            return;
        
        // changing 1's to 0's
        grid[i][j] = '0';
        // calling the recursive functions on all adjacent numbers
        changeLandToWater(grid,i-1,j); // doen
        changeLandToWater(grid,i+1,j); // up
        changeLandToWater(grid,i,j-1); // left
        changeLandToWater(grid,i,j+1); // right
        
    }
}