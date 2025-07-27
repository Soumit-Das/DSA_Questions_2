import java.util.ArrayList;

/*
There we will be using Prime Sieve or Sieve of Erastosthens method which is an optimised method to solve ths question

Question print all prime numbers in a range

Sieve of Erastosthens says that if x is a prime number then all the factors of it will be non-prime number

Code approach

1. First, we create a boolean array of size (N + 1).
   → Why? Because we want to check and mark all numbers from 0 to N, whether they are prime or not.

2. We mark all values from 2 to N as `true`.
   → Why? Because initially we assume all numbers are prime. We will later mark non-primes as false.

3. We set 0 and 1 as `false`.
   → Why? Because 0 and 1 are not prime numbers by definition.

4. Now we run a loop from 2 to N:
   - For each number `i`, if it's still marked `true`, that means it's a prime.
   - Then we mark all multiples of `i` (starting from 2 * i) as `false`.
   → Why? Because multiples of a prime number cannot be prime. For example, if 2 is prime, then 4, 6, 8... are not prime.

5. After this process, the boolean array tells us which numbers are prime (true) and which are not (false).

6. Now we create a list to store the prime numbers in the range M to N:
   - We check each number from M to N in the boolean array.
   - If it's `true`, we add it to the result list.
   → Why? Because we only want to return the primes in the specified range.

7. Finally, return this list and print it.

This approach is fast and efficient compared to checking each number one-by-one using normal logic.
 */


public class Prime_Number_In_a_Range {

    ArrayList<Integer> primeRange(int M, int N) {
        boolean[] bool = new boolean[N+1];

        for(int i = 2; i <= N; i++){
            bool[i] = true;
        }

        bool[0] = false;
        bool[1] = false;

        for(int i = 2; i <= N; i++){
            if(bool[i] == true){
                for(int j = 2 * i; j <= N; j += i){
                    bool[j] = false;
                }
            }
        }

        ArrayList<Integer> prime = new ArrayList<>();

        for(int i = M; i <= bool.length-1; i++){
            if(bool[i] == true){
                prime.add(i);
            }
        }

        return prime;

    }

    public static void main(String[] args) {

        Prime_Number_In_a_Range range = new Prime_Number_In_a_Range();

        int M = 2;
        int N = 5;

        ArrayList<Integer> primes = range.primeRange(M, N);

        primes.forEach(System.out::println);
    }

}
