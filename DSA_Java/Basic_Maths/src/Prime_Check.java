/*

For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.


Example 1:

Input:
N = 5
Output:
1
Explanation:
5 has 2 factors 1 and 5 only.
Example 2:

Input:
N = 25
Output:
0
Explanation:
25 has 3 factors 1, 5, 25

 */

public class Prime_Check {
    public static int check(int n){
        int count = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                count++;
                if((n / i) != i){
                    count++;
                }
            }
        }
        if(count == 2){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args){
        System.out.println(check(4));
    }
}
