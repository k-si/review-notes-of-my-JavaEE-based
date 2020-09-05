package codeCase.FactoryMadeDolls;

public class Test {


    public static void main(String[] args) {
        Factory factory = new Factory();

        WorkShop t1 = new WorkShop(10); // 创建三个车间生产30个dolls
        WorkShop t2 = new WorkShop(10);
        WorkShop t3 = new WorkShop(10);

        factory.createWorkShop(t1);
        factory.createWorkShop(t2);
        factory.createWorkShop(t3);

        factory.product();
    }
}
