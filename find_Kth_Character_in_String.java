class Solution {
    public char kthCharacter(long k) {
        int shifts = Long.bitCount(k-1);
        return (char) ('a'+ shifts%26);
    }
}