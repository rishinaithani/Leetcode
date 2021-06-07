class Solution {
    public int reverse(int input) {
       
    long reversed = 0;
    while (input != 0) {
        reversed = reversed * 10 + input % 10;
        input /= 10;
        if (reversed > Integer.MAX_VALUE 
                 || reversed < Integer.MIN_VALUE) {
            return 0;
        }
    }
    return (int) reversed;

    }
}