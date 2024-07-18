import java.util.*;
import java.util.concurrent.TimeUnit;
class ConsumeR extends Thread {
    private Queue<Integer> queue;

    ConsumeR(Queue<Integer> q) {
        this.queue=q;
    }
    public void run() {
        while (true){
                if(!queue.isEmpty()){
                    int a=queue.poll();
                    if (isPrime(a)) {
                        System.out.println("Dequeued Prime Number: " + a);
                    }
                }
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public boolean isPrime(int a) {
        if (a<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(a);i++) {
            if (a%i==0) {
                return false;
            }
        }
        return true;
    }
}