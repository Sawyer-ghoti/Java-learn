package Day6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestString {
    public static void main(String[] args) {
        int x = -121;
        if (x<0){
            System.out.println("Nope");
        }
        StringBuilder strX = new StringBuilder(x+"");
        String reversedRes  = strX.reverse().toString();
        Boolean compareRes = (x+"").equals(reversedRes);
        System.out.println(compareRes);
    }
}
