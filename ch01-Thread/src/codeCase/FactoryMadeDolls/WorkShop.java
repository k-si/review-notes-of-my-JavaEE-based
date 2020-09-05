package codeCase.FactoryMadeDolls;

public class WorkShop implements Runnable{

    private int nums;
    private int sum;

    public WorkShop(int nums) {
        this.nums = nums;
    }

    @Override
    public void run() {
        while (nums > 0) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum++;
            nums--;
            System.out.println(Thread.currentThread().getName()+"加工，当前加工数量为:"+ sum);
        }
    }
}
