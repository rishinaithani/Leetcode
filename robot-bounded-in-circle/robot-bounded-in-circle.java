class Solution {
    public boolean isRobotBounded(String instructions) {
        // north = 0, east = 1, south = 2, west = 3
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        // Initial position is in the center
        int x = 0, y = 0;
        // facing north
        int dir = 0;
        
        for (char i : instructions.toCharArray()) {
            if (i == 'L')
                dir = (dir + 3) % 4;
            else if (i == 'R')
                dir = (dir + 1) % 4;
            else {
                x += directions[dir][0];
                y += directions[dir][1];   
            }    
        }
        
        // after one cycle: we just need to check 2 conditions :(if any 1 is true,we have a circle)
        // 1) robot returns into initial position
        // 2) or robot doesn't face north
        return (x == 0 && y == 0) || (dir != 0);
    }
}