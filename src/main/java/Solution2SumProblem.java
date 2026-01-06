import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2SumProblem {
    //Bruteforce Approach complexity would order of nˆ2
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

    //Optimal Approach complexity would order of n

    public int[] twoSumOptimal(int[] nums, int target){
        int[] result = new int[2];
        //LinkedList<Integer> integerList = Arrays.stream(nums).boxed().collect(Collectors.toCollection(LinkedList::new));
        ArrayList<Integer> integerList = new ArrayList<>();
        for(int element: nums){
            integerList.add(element);
        }
        for(int i=0;i<=integerList.size()-1;i++){
            int element = integerList.get(i);
            int complement = target - element;
            if(integerList.contains(complement)){
                result[1]=integerList.indexOf(element);
                result[0]=integerList.lastIndexOf(complement);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution2SumProblem solution = new Solution2SumProblem();
        int[] nums = {1, 3, 5, -7, 6, -3};
        int target = 0;
        int[] result = solution.twoSum(nums, target);
        int[] resultOptimal = solution.twoSumOptimal(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        System.out.println("[" + resultOptimal[0] + ", " + resultOptimal[1] + "]");
    }
}
