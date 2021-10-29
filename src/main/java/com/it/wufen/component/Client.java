package com.it.wufen.component;

/**
 * @创建人 wufeng
 * @创建时间 2021/9/10
 * @描述
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        ConcreteCompany cc = new ConcreteCompany("Composite X");
        cc.add(new Leaf("Leaf XA"));
        cc.add(new Leaf("Leaf XB"));
        root.add(cc);

        ConcreteCompany cc2 = new ConcreteCompany("Composite XY");
        cc2.add(new Leaf("Leaf XYA"));
        cc2.add(new Leaf("Leaf XYB"));
        root.add(cc2);

        root.add(new Leaf("Leaf C"));
        Leaf leafD = new Leaf("Leaf D");

        root.add(leafD);
        root.remove(leafD);
        root.display(1);


    }
}
