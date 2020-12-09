package Day7;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 要求：输入一段字符，计算所有字符的个数并且输出
 */
public class Demo0CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("You have entried these shit:"+input);
        char[] chars = input.toCharArray();
        HashMap<Character,Integer> charNum = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(charNum.containsKey(c)){
                Integer count = charNum.get(chars[i]);
                count++;
                charNum.replace(c,count);
            }
            else{
                charNum.put(c,1);
            }
        }
        System.out.println(charNum);
    }
}
