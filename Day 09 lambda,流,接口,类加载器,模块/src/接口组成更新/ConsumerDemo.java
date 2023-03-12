package 接口组成更新;

import java.util.function.Consumer;

/*练习:
* 字符串数组中有多条信息,请按照格式"姓名:xx,年龄:xx"的格式将信息打印
* 要求:把打印姓名动作作为第一个Consumer接口的Lambda实例
*     把打印年龄的动作作为第二个Consumer接口的Lambda实例
*     将两个Consumer接口按照顺序组合到一起使用,用andThen方法*/
public class ConsumerDemo {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33"};
        printInfo(strArray,
            (s)->{
            String[] split = s.split(",");
            System.out.print("姓名:"+split[0]+",");
            },
            (s)->{
            String[] split = s.split(",");
            System.out.println("年龄:"+split[1]);
        });
    }

    private static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for(String s:arr) {
            con1.andThen(con2).accept(s);
        }
    }
}
