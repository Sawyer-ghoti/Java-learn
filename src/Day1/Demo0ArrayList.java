package Day1;

import java.util.ArrayList;
/*
要求：将三个Student对象假如集合并且遍历
 */
public class Demo0ArrayList {
    public static void main(String[] args) {
        Student one = new Student("13","jack");
        Student two = new Student("14","rose");
        Student three = new Student("15","PDD");
        ArrayList<Student> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.printf("No.%d is %s \t",i,stu.getName());
        }

    }
}
