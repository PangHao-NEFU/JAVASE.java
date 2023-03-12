package 局部内部类;

public class Outer {
    private int num = 10;

    public void method() {
        class Inner {           //内部类在成员方法里面
            int num2 = 23;
            public void show() {
                System.out.println(num);    //可以访问外部类成员
                System.out.println(num2);
            }
        }
        Inner i = new Inner();     //需要在方法内部创建对象使用，该类可以直接访问外部类成员，
        i.show();                  //也可以访问方法内局部变量
    }
}
