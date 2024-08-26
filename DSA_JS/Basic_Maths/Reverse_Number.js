/* 

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21

*/                   

function reversed(n){
    let revNum = 0;
    while (n > 0) {
        let ld = n % 10;
        revNum = (revNum * 10) + ld;
        n = Math.floor(n / 10);
    }
    return revNum;
}

console.log(reversed(120));
                            
                        