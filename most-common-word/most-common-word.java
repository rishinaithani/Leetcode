class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> banned_words = new HashSet();
        HashMap<String, Integer> valid_word_counts = new HashMap();
        
        for(String banned_word : banned)
        {
            banned_words.add(banned_word);
        }
        // Lets split up our words now
        String[] words = paragraph.toLowerCase().split("\\W+");
        
        // now we can loop thru and add them to valid_word_counts
        for (String word : words)
        {
            if(!banned_words.contains(word)){
                //The getOrDefault(Object key, V defaultValue) method of Map interface, //implemented by HashMap class is used to get the value mapped with specified key. If no value //is mapped with the provided key then the default value is returned.
                valid_word_counts.put(word,valid_word_counts.getOrDefault(word,0) + 1);
            }
        }
        
        int max = 0;
        String result = " ";
        // now , we go thru each key and its sunsequent count value(count) in the hashmap
        for (String word : valid_word_counts.keySet()){
            if(valid_word_counts.get(word) > max)
            {
                max = valid_word_counts.get(word);
                result = word;
            }
        }
        return result;
    }
}