/*

Problem Statement: "Given a string, check if the string is palindrome or not."
A string is said to be palindrome if the reverse of the string is the same as the string.

Examples:

Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.

*/


public class Check_Palindrome {
    public static boolean palindrome(int i, String str){
        char[] ch = str.toCharArray();
        if(i >= ch.length){
            return true;
        }
        if(ch[i] != ch[ch.length - i - 1]){
            return false;
        }
        i++;
        return palindrome(i, str);
    }
    public static void main(String[] args){
        System.out.println(palindrome(0, "RACECAR"));
    }
}
