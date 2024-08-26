
/*

Print GFG n times without the loop.

Example:

Input:
5
Output:
GFG GFG GFG GFG GFG

Your Task:
This is a function problem. You only need to complete the function printGfg() that takes N as parameter and prints N times GFG recursively.
Don't print newline, it will be added by the driver code.

 */

public class Print_Name_N_Times {
    public static void printName(int n){
        if(n < 1){
            return;
        }
        System.out.print("Soumit ");
        n--;
        printName(n);
    }
    public static void main(String[] args){
        printName(5);
    }
}
