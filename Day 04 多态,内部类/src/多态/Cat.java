package 多态;

public class Cat extends Animal{
    public int age = 20;
    public int weight = 10;
    @Override
    public void eat() { //重写父类方法
        System.out.println("猫吃东西");
    }

    public void play() {
        System.out.println("猫玩线团");
    }
}
