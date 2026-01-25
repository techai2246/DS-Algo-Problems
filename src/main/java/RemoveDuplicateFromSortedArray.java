public class RemoveDuplicateFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int uniqueCount = 0;
        int [] finalArray = new int[nums.length];
        if(nums.length==0){
            return 0;
        }
        finalArray[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                finalArray[++uniqueCount]=nums[i];
            }
        }
        //Re-enrich the array with final Array
        for(int k=0; k<uniqueCount+1; k++){
            nums[k]=finalArray[k];
        }
        return uniqueCount+1;
    }

    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray = new RemoveDuplicateFromSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicateFromSortedArray.removeDuplicates(nums);
        System.out.println("Length of array after removing duplicates: " + length);
        System.out.print("Array after removing duplicates: [");
        for(int i=0; i<length; i++){
            System.out.print(nums[i]);
            if(i < length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
