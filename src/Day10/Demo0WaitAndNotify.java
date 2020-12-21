package Day10;
/**
 * 线程之间的通信
 * 顾客线程：（消费者）告知老板要的包子的种类和数量，调用wait方法，放弃cpu的执行，进入到WAITING状态
 * 老板线程：（生产者）花了5秒做 包子，之后notify顾客，唤醒顾客吃包子
 *
 * 注意：
 * 顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
 * 同步使用的锁对象必须保证唯一
 * 只有锁对象才能调用wait和notify方法

*/
public class Demo0WaitAndNotify {

    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("Inform the chief your favor");
                    try{
                        obj.wait();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("I am full now!");
                }
            }
        }.start();


        new Thread() {
            @Override
            public void run() {

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("The chief cooked for 5 second then he serve the customer");
                        obj.notify();
                    }

            }
            }.start();

    }
}
