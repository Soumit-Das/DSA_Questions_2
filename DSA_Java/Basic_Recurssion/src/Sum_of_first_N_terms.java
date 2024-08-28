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

public class Sum_of_first_N_terms {
    static long sum;
    public static long Nterms(long n){
        if(n < 1){
            return sum;
        }
        sum += n * n * n;
        n--;
        return Nterms(n);
    }
    public static void main(String[] args){
        System.out.print(Nterms(5));
    }
}
