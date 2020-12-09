package Day2;
/*
要求:Define a function ,reform {1,2,3} into [1#2#3]
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo0String {
    private static int[] nums = {1,2,3};

    public static void main(String[] args) {
        String str  = "[";

        for (int i = 0; i < nums.length; i++) {
            if(i == nums.length-1){
                str  += "word" + nums[i]  + "]";
            }
            else{
                str  += "word" + nums[i] + "#";
            }
        }
        System.out.println(str);
    }
}
