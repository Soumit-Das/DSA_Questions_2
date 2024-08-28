/*

Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.

Example 1:

Input:
n=5
Output:
225
Explanation:
13+23+33+43+53=225


Example 2:

Input:
n=7
Output:
784
Explanation:
13+23+33+43+53+63+73=784

*/


let sum = 0;

function Nterms(n){
    if(n < 1){
        return sum;
    }
    sum += n * n * n;
    n--;
    return Nterms(n);
}

console.log(Nterms(5));
