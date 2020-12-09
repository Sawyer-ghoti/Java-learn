package Day2;


import java.util.HashMap;
import java.util.Scanner;

/*
要求：输入一个字符串，统计各种字符出现的次数，包括大写字母、小写字母、数字、else
 */
public class Demo1StringCountChar {
    private static Scanner s =new Scanner(System.in);

    public static void main(String[] args) {

        String str = s.nextLine();
        System.out.println(str);
        char[] c = str.toCharArray();
        System.out.println(c.getClass());
        int count = 0;
        HashMap<Character,Integer> charNums = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            if(!charNums.containsKey(c[i])){
                count++;
                for (int j = i+1; j < c.length; j++) {
                    if(c[j]==c[i]){
                        count++;
                    }
                    else{
                        continue;
                    }
                }
                charNums.put(c[i],count);
                count = 0;
            }
        }
        System.out.println("All chars has been count:"+charNums);
        HashMap<Character,Integer> charKinds = new HashMap<>();
        int numberNums = 0;
        int lowerNums = 0;
        int upperNums = 0;
        int otherNums = 0;
        for (char key : charNums.keySet()) {
            char ch = key;
            int num = charNums.get(ch);
            if('a' <= ch && ch <= 'z')
            {
                lowerNums += num;
            }
            else if('A' <= ch && ch <= 'Z'){
                upperNums += num;
            }
            else if('0' <= ch && ch <= '9'){
                numberNums += num;
            }
            else{
                otherNums += num;
            }

        }
        System.out.println("小写字母有"+lowerNums+"个");
        System.out.println("大写字母有"+upperNums+"个");
        System.out.println("数字子u有"+numberNums+"个");
        System.out.println("其他字符有"+otherNums+"个");

    }

}
