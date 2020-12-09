package Day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
要求：将一个list数组将指定格式输出
 */
public class Demo1ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Anriana");
        list.add("Mike");
        list.add("Doja");
        list.add("Joji");
        System.out.println("Original form:"+list);
        arrayListPrint(list);


    }


    public static void arrayListPrint(ArrayList<String> list){
        System.out.print("Reformed:[");
        for (int i = 0; i < list.size(); i++) {

            if(i == list.size()-1){
                System.out.print(list.get(i)+"]\n");
            }
            else{
                System.out.print(list.get(i)+"@");
            }

        }
    }
}
