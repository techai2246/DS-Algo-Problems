public class Solution2SumProblem {
    public int[] twoSum(int[] nums, int target) {
        int result[]= new int[2];
        for(int i=0; i<=nums.length-2;i++){
            for(int j = i+1; j<=nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Solution2SumProblem solution = new Solution2SumProblem();
        int[] nums = {1, 3, 5, -7, 6, -3};
        int target = 0;
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
