package Day11;

import java.util.HashMap;



public class LeetCodeRomanCharacter {
    public static void main(String[] args) {
        HashMap<Character,Integer> RomanNum = new HashMap<>();
        RomanNum.put('I',1);
        RomanNum.put('V',5);
        RomanNum.put('X',10);
        RomanNum.put('L',50);
        RomanNum.put('C',100);
        RomanNum.put('D',500);
        RomanNum.put('M',1000);
        String romanNum = new String("XD");
        char[] romanChar = romanNum.toCharArray();
        System.out.println(romanChar[0]);
        int sum = 0;
        int lastRoNum = RomanNum.get(romanChar[romanChar.length-1]);
        System.out.println(lastRoNum);
        System.out.println(romanChar);
        for (int i = 0; i < romanChar.length-1; i++) {
            int roNum = RomanNum.get(romanChar[i]);
            int nextRoNum = RomanNum.get(romanChar[i+1]);
            if (roNum<nextRoNum){
                sum -= roNum;
            }
            else {
                sum += roNum;
            }
        }
        sum += lastRoNum;
        System.out.println(sum);
    }
}
