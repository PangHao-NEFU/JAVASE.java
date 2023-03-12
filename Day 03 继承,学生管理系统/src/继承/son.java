package 继承;
/*extends关键字可以用来继承父类
* this:代表本类对象的引用，指向调用该方法的实例对象，
* super：使用方法与this相似，代表父类对象的引用
* 关键字       访问成员变量      访问构造方法        访问成员方法
* this      this.成员变量      this（...）      this.成员方法（...）
*           访问本类成员变量    访问本类构造方法   访问本类成员方法
* super     super.成员变量    super（...）       super.成员方法（...）
*           访问父类成员变量    访问父类构造方法    访问父类成员方法
* */
public class son extends father{
    public son() {
        /*注意，子类所有构造方法都会默认访问父类无参构造方法
        * 如果没有提供父类无参构造方法，也可以在子类的构造方法中手动进行对父类的有参构造
        * super（"张三"，18）*/
    }

    public son(String name, int age) {
        super(name, age);
    }
}
