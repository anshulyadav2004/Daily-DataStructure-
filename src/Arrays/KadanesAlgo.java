package Arrays;

public class KadanesAlgo {
    public static int maxmimumSubarraySum(int[] nums){
             int maxsum=nums[0];

             int sum =0;
             int start=-1;
             int end=-1;
             for(int i=0;i<nums.length;i++){
                 sum+=nums[i];

                 if(sum>maxsum){
                         maxsum=sum;
                         end=i;
                     }
                 if(sum<0){
                     sum=0;
                     start=i+1;
                 }

             }
        System.out.println("This is index ["+start+" "+end+"]");
             return maxsum;
             

    }

    public static void main(String args[]){
       int result = maxmimumSubarraySum(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(result);

    }
}
