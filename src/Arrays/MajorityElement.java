package Arrays;

import java.util.Arrays;

public class MajorityElement {
    public static void majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int maxcount=0;
        int number =nums[0];
        int answer=0;
        for(int i=0;i<nums.length;i++){
            if(number==nums[i]){
                count++;
                if(count>maxcount){
                    maxcount=count;
                    answer=nums[i];
                }
            }
            else{
                number =nums[i];
                count=1;
            }
        }
        System.out.println("majority element is "+maxcount+"number"+answer);
    }
}
