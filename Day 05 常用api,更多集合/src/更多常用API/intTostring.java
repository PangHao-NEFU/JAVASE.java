package 更多常用API;
/*int和string类型的相互转换*/
public class intTostring {
    public static void main(String[] args) {
        //int ->string
        int number = 100;
        //method 1
        String s1 = "" + number; //太不专业了！一看就是门外汉！
        //method 2: public static String.valueOf(int i)
        String s2 = String.valueOf(number);

        //string->int
        String s = "100";
        //method 1:String->Integer->int 比较麻烦
        Integer i = Integer.valueOf(s); //第一步先把String变为Integer
        int x=i.intValue();             //第二步用Integer的方法，获取数值 public int intValue(),返回此值 Integer为 int

        //method 2 String->int，一步到位,使用Integer中的静态方法parseInt
        //public static int parseInt(string s),将字符串参数解析为带符号的十进制整数。
        int y = Integer.parseInt(s);

    }
}
/*总结：
* int转string:   String.valueOf(i)
* string转int:   Integer.parseInt(s)*/