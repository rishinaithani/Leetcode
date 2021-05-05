public class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right) {
            // Checking if our character is alphanumeric or not, If not then increment the pointer
            while(!Character.isLetterOrDigit(s.charAt(left)) && left < right) {
                left++;
            }
            // Checking if our character is alphanumeric or not, if not then increment the pointer
            while(!Character.isLetterOrDigit(s.charAt(right)) && right > left) {
                right--;
            }
            // If both left and right are alphanumeric, we compare the chars 
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}
