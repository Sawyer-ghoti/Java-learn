package Day3;

import java.util.ArrayList;

public class Manager extends User{

    public Manager(){

    }
    public Manager(String name,int money){
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        ArrayList<Integer> list = new ArrayList<>();
        int leftMoney = super.getMoney();
        if(leftMoney <= totalMoney){
            System.out.println("Manager's money left is not enough.");
            return list;
        }
        super.setMoney(leftMoney-totalMoney);

        int modMoney = totalMoney % count;
        int avgMoney = (totalMoney-modMoney) / count;

        for (int i = 0; i < count; i++) {
            if(i == count -1){
                list.add(modMoney);
            }
            list.add(avgMoney);
        }
        return list;
    }


}
