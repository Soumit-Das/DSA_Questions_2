
/*

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.


Approach
- We will use a brute-force approach with two pointers:
  1. Outer loop runs through each possible starting index in `haystack`
     where `needle` could start (up to length difference).
  2. Inner loop checks if characters of `needle` match with characters from `haystack`
     starting at current index `i`.
- If all characters match, return that starting index `i`.
- If no match is found after checking all positions, return -1.

 */

public class First_Occurance {
    public int strStr(String haystack, String needle) {

        int hLen = haystack.length();
        int nLen = needle.length();

        if (nLen > hLen) return -1;

        for (int i = 0; i <= hLen - nLen; i++) {
            int j = 0;
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == nLen) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        First_Occurance firstOccurance = new First_Occurance();
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(firstOccurance.strStr(haystack, needle));
    }
}
