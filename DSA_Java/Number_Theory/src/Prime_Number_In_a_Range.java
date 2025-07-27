import java.util.ArrayList;

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
