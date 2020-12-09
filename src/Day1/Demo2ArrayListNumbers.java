package Day1;
/*
要求：生成20个随机数字，装入集合之中，筛选出所有偶数并且以新集合的形式输出
 */

import java.util.ArrayList;
import java.util.Random;

public class Demo2ArrayListNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(40));
        }
        System.out.println(list);
        ArrayList<Integer> EvenNums = selectEvenNumbers(list);
        System.out.println(EvenNums);
    }


    public static ArrayList<Integer> selectEvenNumbers(ArrayList<Integer> list){
        ArrayList<Integer> EvenList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer a = list.get(i);
            if(a%2==0){
                EvenList.add(a);
            }

        }
        return EvenList;
    }
}
