package codeCase.FactoryMadeDolls;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    private List<WorkShop> factory = new ArrayList<>(); // 盛放车间的容器

    public void product() { // 每个工厂开始生产doll
        for (int i = 0; i < factory.size(); i++)
            new Thread(factory.get(i)).start();
    }

    public void createWorkShop(WorkShop workShop) {
        factory.add(workShop);
    }
}
