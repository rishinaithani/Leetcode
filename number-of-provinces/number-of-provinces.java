
// here we can do dfs and count the number of friends accoridng to the condition
// first we go throught the roq ansd check whether if it is not visited, if not visited we do the dfs column wise
// inside the dfs funxction, if we already visited a particulkar item just return
// else just mark the current as visited for do the traverse on the column
// if its not visited and the corresponding cell = 1, do the dfs
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int friendCount = 0;
        // a boolean array for visited
        int row = isConnected.length;
        boolean [] visited = new boolean[row];
        for (int i=0; i<row; i++) {
            if (!visited[i]) {
                // do the dfs and increase the count
                dfs(isConnected, visited, i);
                friendCount += 1;
            }
        }
        return friendCount;
    }
    public void dfs(int [][] isConnected, boolean [] visited, int current) {
        if (visited[current])
            return;
        visited[current] = true;
        for (int i=0; i<isConnected[current].length; i++) {
            if (!visited[i] && isConnected[current][i] == 1)
                // continue the dfs
                dfs(isConnected, visited, i);
        }
    }
}