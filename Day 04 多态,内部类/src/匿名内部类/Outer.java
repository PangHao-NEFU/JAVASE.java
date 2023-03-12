package 匿名内部类;

public class Outer {
    public void method() {
        /*new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();                          //本质是一个对象，是对象就可以调用方法*/
        //上方注释也可以如下写法：
        Inter i = new Inter() {            //多态方式
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();
    }
}
