package codeCase.ProducerAndConsumer;

public class Producer implements Runnable {

    SyncStack stack;

    public Producer(SyncStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        char c;
        for (int i = 0; i < 5; i++) {
            c = (char) (Math.random() * 26 + 'A');
            stack.push(c);
            System.out.println("Producer:" + c);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
