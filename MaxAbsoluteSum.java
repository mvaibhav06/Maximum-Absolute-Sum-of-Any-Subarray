public class MaxAbsoluteSum {
    public static int maxSum(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int absSum = Integer.MAX_VALUE;
        int sum = 0;
        int negSum = 0;
        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            negSum += nums[i];

            if (sum > maxSum){
                maxSum = sum;
            }
            if (negSum < absSum){
                absSum = negSum;
            }
            if (sum <= 0){
                sum = 0;
            }
            if (negSum >= 0){
                negSum = 0;
            }
        }

        return Math.max(Math.abs(absSum), maxSum);
    }

    public static void main(String[] args) {
        int[] nums = {2,-5,1,-4,3,-2};
        System.out.println(maxSum(nums));
    }
}
