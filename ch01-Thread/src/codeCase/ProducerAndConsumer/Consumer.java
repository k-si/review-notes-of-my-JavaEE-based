package codeCase.ProducerAndConsumer;

public class Consumer implements Runnable {

    SyncStack stack;

    public Consumer(SyncStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        char c;
        for (int i = 0; i < 5; i++) {
            c = stack.pop();
            System.out.println("Consumer:" + c);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
