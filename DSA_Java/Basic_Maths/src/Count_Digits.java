public class Count_Digits {

    public static int count(int n){
        int count = 0;
        int num = n;
        while(n > 0){
            if(n%num == 0){
                count++;
            }
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(count(12));
    }
}
