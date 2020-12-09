package Day6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Testing {
    public static void main(String[] args) {
        Collection<Integer> numColl = new ArrayList<>();
        numColl.add(1);
        numColl.add(2);
        numColl.add(3);
        numColl.add(4);
        numColl.add(5);
        System.out.println(numColl);
        Iterator<Integer> iterator = numColl.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for(int i:numColl){
            System.out.println(i);
        }

    }
}
