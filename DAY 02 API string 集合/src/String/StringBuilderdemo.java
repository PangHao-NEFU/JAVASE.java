package String;
/*stringbuilder是可变的，而string创建完后不可变*/
public class StringBuilderdemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("hello");
//        stringbuilder两个重要的方法添加.append(任意类型)返回对象本身，和反转.reverse()返回相反的字符序列,其都改变原有对象
        sb = sb2.append("world");
        System.out.println(sb);     //helloworld
        System.out.println(sb2);
        sb = sb2.reverse();
        System.out.println(sb);     //dlrowolleh
        System.out.println(sb2);
        /*stringbuilder和string类型的互相转换*/
        //sb转为s，用toString（）方法即可，s转为sb需要用构造方法 public StringBuilder（String s）
        String s = sb2.reverse().toString();
        System.out.println(s);
        StringBuilder sb3 = new StringBuilder(s);
        System.out.println(sb3);
    }
}

