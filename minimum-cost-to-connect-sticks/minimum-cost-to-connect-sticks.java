class Solution {
    public int connectSticks(int[] sticks) {
        int cost = 0;
 
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
 
        // add all sticks to the min heap.
        for (int stick : sticks) {
            minHeap.add(stick);
        }
 
        // combine two of the smallest sticks until we are left with just one.
        while (minHeap.size() > 1) {
            int stick1 = minHeap.remove();
            int stick2 = minHeap.remove();
            
            int sum = stick1 + stick2;
            cost += sum;
            
            minHeap.add(stick1 + stick2);
        }
 
        return cost;
    }
}