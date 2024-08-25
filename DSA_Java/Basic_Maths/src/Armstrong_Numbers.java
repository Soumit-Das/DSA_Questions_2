public class Armstrong_Numbers {
    public static String armstrongNumber(int n){
        int res = 0;
        int last;
        int num = n;
        while(n != 0){
            last = n % 10;
            res += last * last * last;
            n = n / 10;
        }
        if(num == res){
            return "true";
        }
        return "false";
    }

    public static void main(String[] args){
        System.out.println(armstrongNumber(372));
    }

}
