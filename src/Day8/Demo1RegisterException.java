package Day8;

import java.util.Scanner;

/**
 * 要求：模拟注册操作，如果用户名已经存在，则抛出异常并提示：The username is not available！
 * 使用数组保存已经注册过的用户名；使用Scanner获取用户输入的用户名；定义一个方法进行判断
 */

public class Demo1RegisterException {
    static String[] nameList = {"Jack","Mars","Pete","Ana"};
    public static void main(String[] args) throws RegisterException {
        Scanner sc = new Scanner(System.in);
        String urName = sc.nextLine();
        for(String s:nameList){
            if(urName.equals(s)){
                throw new RegisterException("This name has been token!");
            }
        }


    }
}


