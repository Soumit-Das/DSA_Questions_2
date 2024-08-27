/*

Print numbers from N to 1 (space separated) without the help of loops.

Example 1:

Input:
N = 10
Output: 10 9 8 7 6 5 4 3 2 1

Your Task:
This is a function problem. You only need to complete the function printNos() that takes N as parameter and prints number from N to 1
recursively.

 */

public class Print_N_to_1 {
    public static void printReverse(int n){
        if(n < 1){
            return;
        }
        System.out.print(n+" ");
        n--;
        printReverse(n);
    }
    public static void main(String[] args){
        printReverse(10);
    }
}
