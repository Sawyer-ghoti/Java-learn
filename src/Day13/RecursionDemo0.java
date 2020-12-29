package Day13;

public class RecursionDemo0 {
    public static void main(String[] args) {
//        a();
        System.out.println(CountNums(100));
        System.out.println(TimeNums(10));
    }

    private static void a() {
        System.out.println("aaaaaa");
        a();
    }

    private static void b(int i) {
        if (i==100){
            return;
        }
        System.out.println(i);
        i++;
        b(i);
    }

    private static int CountNums(int i){
        if (i == 1){
            return 1;
        }

        return i + CountNums(i-1);

    }

    private static int TimeNums(int i){
        if (i==1){
            return 1;
        }
        return i*TimeNums(i-1);
    }


}