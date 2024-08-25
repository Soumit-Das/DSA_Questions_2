public class Palindrome_Integer {
    public static boolean palindrome(int x){
        if(x < 0){
            return false;
        }
        int dup = x;
        int rev = 0;
        int last;
        while(x != 0){
            last = x % 10;
            rev = (rev * 10) + last;
            x = x / 10;
        }
        if(rev == dup){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(palindrome(-121));
    }
}
