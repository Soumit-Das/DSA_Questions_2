/*

Print GFG n times without the loop.

Example:

Input:
5
Output:
GFG GFG GFG GFG GFG

Your Task:
This is a function problem. You only need to complete the function printGfg() that takes N as parameter and prints N times GFG recursively. Don't print newline, it will be added by the driver code.

*/


function printName(n){
    if(n < 1){
        return;
    }
    console.log("Soumit");
    n--;
    printName(n);
}

printName(5);