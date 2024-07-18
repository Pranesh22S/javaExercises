import java.util.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class Producer extends Thread {
    private Queue<Integer> queue;
    Random r=new Random();
    Producer(Queue<Integer> q) {
        this.queue = q;
    }
    public void run() {
        while (true) {
            int a=r.nextInt(1000)+1;
            System.out.println("Enqueued Number :"+a);
            queue.offer(a); 
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
