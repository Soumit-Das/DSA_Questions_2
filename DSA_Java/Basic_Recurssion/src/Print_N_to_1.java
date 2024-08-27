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
