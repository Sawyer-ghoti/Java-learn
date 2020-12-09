package Day3;

import java.util.ArrayList;
import java.util.Random;

public class Members extends User{
    public Members(){
    }

    public  Members(String name, int money){
        super(name, money);
    }

    public ArrayList<Integer> recieve(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());
//        int moneyIn = list.get(index);
//        list.remove(index);
        int moneyIn = list.remove(index);
        super.setMoney(super.getMoney()+moneyIn);
        return list;
    }
}
