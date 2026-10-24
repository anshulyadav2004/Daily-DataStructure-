package Arrays;

import java.util.ArrayList;
import java.util.List;

public class WiggleElement {

    public static void main(String[] args) {
     int nums []= new int[]{1,7,4,9,2,5};

        List<Integer> result = new ArrayList<>();
        int newbie = nums[1]-nums[0];
        result.add(newbie);
        for (int i = 2; i < nums.length; i++) {

            newbie = nums[i] - nums[i-1];

            if ((newbie < 0) && (result.get(result.size() - 1) > 0)) {
                result.add(newbie);
            } else if (( newbie> 0) && (result.get(result.size() - 1) < 0)) {
                result.add(newbie);
            }


        }

        System.out.println(result);

    }
}
