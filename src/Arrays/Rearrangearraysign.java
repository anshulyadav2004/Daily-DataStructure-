package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Rearrangearraysign {
    public static void main(String[] args) {
        int arr[] = new int[]{-1,1};
        int n = arr.length;
        List<Integer> positivelist = new ArrayList<>();
        List<Integer> negativelist = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                negativelist.add(arr[i]);
            }
            else {
                positivelist.add(arr[i]);
            }
        }
        for(int i=0;i<n/2;i++){

            arr[2*i] = positivelist.get(i);
            arr[2*i+1] = negativelist.get(i);
        }
        for(int nums:arr){
            System.out.print(nums +" ");
        }

    }
}
