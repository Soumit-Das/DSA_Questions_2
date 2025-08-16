public class PrintNumbers {

    public static void print_1_to_N(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        print_1_to_N(n-1);
        System.out.println(n);
    }

    public static void divide(int n){
        if(n < 1){
            return;
        }
        System.out.println(n);
        divide(n/2);
    }

    public static void print_N_to_1(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print_N_to_1(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Printing 1 to N");
        print_1_to_N(5);
        System.out.println("Printing N to 1");
        print_N_to_1(5);
        System.out.println("divide");
        divide(10);
    }
}
