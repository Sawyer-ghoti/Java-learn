package Day13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsDemo0 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImple());
        es.submit(new RunnableImple());

        es.shutdown();
        }
}

