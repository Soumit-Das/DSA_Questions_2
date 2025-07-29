public class Segregate_zeros_ones {

    public int[] segregate0and1(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;

        while (p1 <= p2) {
            if (arr[p1] == 0 && arr[p2] == 1) {
                p1++;
                p2--;
            } else if (arr[p1] == 1 && arr[p2] == 0) {
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2--;
            } else if (arr[p1] == 0 && arr[p2] == 0) {
                p1++;
            } else if (arr[p1] == 1 && arr[p2] == 1) {
                p2--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Segregate_zeros_ones segregateZerosOnes = new Segregate_zeros_ones();
        int[] arr = {0, 0, 1, 1, 0};
        int[] res = segregateZerosOnes.segregate0and1(arr);

        for(int n : res){
            System.out.print(n+" ");
        }
    }
}
