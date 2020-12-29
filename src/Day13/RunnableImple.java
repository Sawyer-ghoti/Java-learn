package Day13;

public class RunnableImple implements  Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
