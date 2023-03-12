package 多态;

public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();   //多态形式创建对象
        System.out.println(a.age);  //输出父类的40
//        访问成员变量，编译时看等号左边的父类，运行时也看左边的父类
//        System.out.println(a.weight);编译报错，父类中没有weight属性
        a.eat();    //访问成员方法，输出的是子类的重写方法，运行看等号右边
//        a.play();     编译报错！因为父类中没有play这个方法，play是Cat类的方法

        Cat c = new Cat();
        System.out.println(c.age);
        c.eat();

        Animal a1 = new Animal();
        System.out.println(a.age);
        a1.eat();

        Animal a2 = new smallCat();
        System.out.println(a2.age);
        a2.eat();
    }
}
/*总结：多态中成员访问的特点
* 成员变量：编译和执行都看左边的父类
* 成员方法：编译时看左边的父类，执行时会执行子类重写的方法*/
