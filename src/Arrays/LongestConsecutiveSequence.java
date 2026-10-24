package Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int nums[] = new int[]{100,4,200,1,3,2
        };
        int result = longestConsecutive(nums);
        System.out.println(result);
    }

    public static int longestConsecutive(int[] nums) {
          int size = nums.length;
          int length = 0;

          for(int i = 0; i < size; i++){
              int number = nums[i];
              int count =1;

              while(linearsearch(number+1,nums)==true){
                  number = number+1;
                  count++;
              }
              if(count>length){
                  length = count;
              }
          }
          return length;

    }
    private static boolean linearsearch(int number, int[] nums){

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == number){
               return true;
            }
        }
        return false;

    }
}
