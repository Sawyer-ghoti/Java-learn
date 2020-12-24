package Day12;

import java.util.ArrayList;
import java.util.HashMap;

public class LeetCodeBrackets {
    public static void main(String[] args) {
        String s = new String("{[()]}");
        isRightBracketsUsing(s);
    }
    private static boolean isRightBracketsUsing(String s){
        char[] chars = s.toCharArray();
        System.out.println(chars);
        int numb = chars.length/2;
        System.out.println(numb);
        //空字符串默认正确
        if (chars.length==0){
            return true;
        }
        //单数个符号必是错误的
        if (chars.length%2 != 0){
            return false;
        }
        HashMap<Character,Character> bracketsSet = new HashMap<>();
        bracketsSet.put('(',')');
        bracketsSet.put('[',']');
        bracketsSet.put('{','}');
        System.out.println(bracketsSet);

        if (bracketsSet.get(chars[numb]) != bracketsSet.get(chars[numb+1])){
            return false;
        }

        return true;
    }
}
