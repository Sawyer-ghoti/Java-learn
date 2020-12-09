package Day7;

import java.util.*;

public class Testing {
    public static void main(String[] args) {
        HashMap<String,Integer> stuIdMap = new HashMap<>();
        stuIdMap.put("Jack",100);
        stuIdMap.put("Park",101);
        stuIdMap.put("Ella",102);
        stuIdMap.put("John",103);
        stuIdMap.put("Ame",104);
        System.out.println(stuIdMap);
        show1(stuIdMap);
        System.out.println("===================");
        show2(stuIdMap);



        //        for (Integer value : stuIdMap.values()){
//            System.out.println(value);
//        }
//        等同于下列
//        Collection<Integer> values = stuIdMap.values();
//        Iterator<Integer> iterator = values.iterator();
//        Set<String> strings = stuIdMap.keySet();
//        Iterator<String> iterator = strings.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        for (String k : stuIdMap.keySet()){
//            System.out.println(k);
//        }



    }

    /**
     * 使用HashMap的values()函数，直接获得由Map中的值组成的Set集合
     * 然后使用iterator进行迭代
     * @param map
     */

    public static void show1(HashMap<String,Integer> map){
        Collection<Integer> values = map.values();
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * 使用HashMap的Entry接口，获得键值对之间的关系(结婚证）
     * 这种映射关系作为对象存储到Set集合中，然后使用迭代器iterator进行迭代
     * @param map
     */
    public static void show2(HashMap<String,Integer> map ){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
