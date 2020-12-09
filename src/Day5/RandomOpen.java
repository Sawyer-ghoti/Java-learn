package Day5;

import java.util.ArrayList;
import java.util.Random;

public class RandomOpen implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> red_list = new ArrayList<>();
        Random r = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            int money = r.nextInt(leftMoney/leftCount*2);
            red_list.add(money);
            leftCount--;
            leftMoney -= money;
        }
        red_list.add(leftMoney);
        return red_list;
    }

    public ArrayList<Double> getRandomRate(final int totalCount){
        ArrayList<Double> rateList = new ArrayList<>();
        ArrayList<Integer> numList = new ArrayList<>();
        Random random =  new Random();
        int count = 0;
        int temp = 0;
        for (int i = 0; i < totalCount; i++) {
            temp = random.nextInt(100);
            numList.add(temp);
            count += temp;
        }
        for (int i = 0; i < totalCount; i++) {
            double rate = numList.get(i)/count;
            rateList.add(rate);
        }
        return rateList;
    }
}
