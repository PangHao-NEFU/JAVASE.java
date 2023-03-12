package 多态;

public class smallCat extends Cat{
    public int age = 1;

    @Override
    public void eat() {
        System.out.println("小猫喝奶");
    }
}
