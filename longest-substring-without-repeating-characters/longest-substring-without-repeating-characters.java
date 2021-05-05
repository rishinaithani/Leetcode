class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        HashSet<Character> hash_set = new HashSet<Character>();
        
        // Sliding window : 2 ponters , initially i stays at 0 ; j iterates till end
        // 
        while(j < s.length())
        {
            if(!hash_set.contains(s.charAt(j)))
            {
                // add char at j to hashset, and increment j 
            hash_set.add(s.charAt(j));
            j++;
            max = Math.max(hash_set.size(), max);
            }
            else
            {
                //else , remove the char at i from the Hashset(sliding window , you see) & increment i
                hash_set.remove(s.charAt(i));
                i++;
            }
        }
        return max ;
    }
}