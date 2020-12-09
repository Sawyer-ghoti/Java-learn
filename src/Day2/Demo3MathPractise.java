package Day2;
/*
要求：计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
plus: Input two boudary numbers and count out how many integers that has absolute value between 2.1 and 6
 */


import java.util.Scanner;

public class Demo3MathPractise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("最小数为：");
        double start = sc.nextDouble();
        System.out.print("最大数为：");
        double end = sc.nextDouble();
        int count = 0;
        for(int i=(int)start;i<end;i++){
            int abs =Math.abs(i);
            if(abs>2.1&&abs<6){
                count++;
            }

        }
        System.out.println(count);

    }
}
