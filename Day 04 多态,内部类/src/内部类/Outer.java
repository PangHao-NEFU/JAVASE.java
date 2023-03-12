package 内部类;

public class Outer {
    private int num = 10;

    private class  Inner{
        private int inner_num=30;   //innernum是需要保护的数据
        public void show() {    //假设show方法是需要保护的成员
            System.out.println(num);
        }

        public int getInner_num() {
            return inner_num;
        }
    }

    public void method() {
        Inner i = new Inner();
        System.out.println(i.inner_num);       //注意，inner_num是内部类保护的对象，也可以直接在外部类中访问
        System.out.println(i.getInner_num());
        i.show();
    }



}
