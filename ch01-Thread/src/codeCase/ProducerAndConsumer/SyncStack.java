package codeCase.ProducerAndConsumer;

public class SyncStack {

    private int index = 0;
    private char[] buffer = new char[6]; // 大小为六个单位的缓冲区

    public synchronized void push(char c) {
        while (index == buffer.length) {
            try {
                this.wait(); // 充满字符的时候需要阻塞线程，等待pop
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify(); // 唤醒pop线程
        buffer[index] = c;
        index++;
    }

    public synchronized char pop() {
        while (index == 0) {
            try {
                this.wait(); // 缓冲区为空，线程阻塞，等待push
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify(); // 唤醒push线程
        index--;
        return buffer[index];
    }
}
