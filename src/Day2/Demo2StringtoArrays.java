package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2StringtoArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        for(int i = chars.length-1;i>=0;i--){
            System.out.println(chars[i]);
        }
    }

}
