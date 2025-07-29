public class Smallest_SubArray_Sum {

    public int minSubArrayLen(int target, int[] nums) {
        int st = 0;
        int e = 0;
        int ans = Integer.MAX_VALUE;
        int curr = 0;
        while(e < nums.length){
            curr += nums[e];
            e++;
            while(st < e && curr >= target){
                ans = Math.min(ans, e - st + 1);
                curr = curr - nums[st];
                st++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans - 1;
    }

    public static void main(String[] args) {
        Smallest_SubArray_Sum smallestSubArraySum = new Smallest_SubArray_Sum();
        int target = 7;
        int[] arr = {2,3,1,2,4,3};
        int subArrLen = smallestSubArraySum.minSubArrayLen(target, arr);
        System.out.println(subArrLen);
    }

}
