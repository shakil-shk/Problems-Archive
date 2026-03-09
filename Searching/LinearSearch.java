public class LinearSearch{
    public static void main (String[] args){
        int nums[] = {3,5,11,78,79,85,94,96,99,101,102,103,105,107,109,111};
        int target = 109;
        int result = linearSearch(nums, target);

        if (result != -1){
        System.out.println("Element found at Index : " + result);}
        else {
        System.out.println("Element not found");}


    }

    public static int linearSearch(int[] nums, int target){

       for (int i = 0; i < nums.length; i++){
        if (nums[i] == target)
         return i;
        }

       return -1;
    }
}