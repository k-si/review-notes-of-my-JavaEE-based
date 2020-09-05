package codeCase.ProducerAndConsumer;

public class SyncTest {

    public static void main(String[] args) {
        SyncStack stack = new SyncStack();
        Thread producer = new Thread(new Producer(stack));
        Thread consumer = new Thread(new Consumer(stack));
        producer.start();
        consumer.start();
    }
}
