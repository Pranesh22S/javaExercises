import java.util.*;

public class Exercise13 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        ConsumeR consumer=new ConsumeR(q);
        Producer producer=new Producer(q);
        consumer.start();
        producer.start();
    }
}
