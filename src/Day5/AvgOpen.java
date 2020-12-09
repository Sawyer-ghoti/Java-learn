package Day5;

import java.util.ArrayList;

public class AvgOpen implements OpenMode{
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;
        ArrayList<Integer> red_list = new ArrayList<>();

        for (int i = 0; i < totalCount-1; i++) {
            red_list.add(avg);
        }
            red_list.add(avg+mod);


        return red_list;
    }
}
