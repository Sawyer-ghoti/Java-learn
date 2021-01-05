package Day16.FormalOutputString;

import java.util.function.Consumer;

public class Demo {
    //定义一个方法，参数传递String类型的数组和两个Consumer接口，消费字符串
    public  static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2){
        for (String message: arr) {
            con1.andThen(con2).accept(message);
        }
    }


    public static void main(String[] args) {
        String[] arr = {"Jack,male", "Ivanka,female", "Robin,female"};
        printInfo(arr,(message)->{
            String name = message.split(",")[0];
            System.out.println("##Name " +name);
        },(message)->{
            String age = message.split( ",")[1];
            System.out.println("##Age " +age+"\n");
        });

    }
}
