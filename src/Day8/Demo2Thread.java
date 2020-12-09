package Day8;

public class Demo2Thread {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.run();
        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }
    }
}
