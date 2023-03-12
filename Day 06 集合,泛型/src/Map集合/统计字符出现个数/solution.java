package Map集合.统计字符出现个数;
/*输入"aabbccdd",输出”a（2）b（2）c（2）d（2）“
思路：
* 创建hashmap集合，key是Charactor，值是Integer
* 遍历字符串，得到每个字符
* 拿得到的每个字符去hashmap中去找对应的key，看其返回值
*   如果返回null，说明该字符不存在，就把该字符作为key，value设为1
*   如果返回值不是null，说明已经存在，value值+1
* 遍历HashMap集合，得到键和值，按要求进行拼接后输出结果*/

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();


        TreeMap<Character, Integer> hm = new TreeMap<>();
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            Integer num=hm.get(c);
            if(num==null){
                hm.put(c, 1);
            }else{
                hm.put(c, ++num);
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        Set<Map.Entry<Character, Integer>> entrySet = hm.entrySet();
        for (Map.Entry<Character, Integer> kv:entrySet){
            Character k=kv.getKey();
            Integer v=kv.getValue();
            stringBuilder.append(k).append("(").append(v).append(")");
        }

        String result=stringBuilder.toString();
        System.out.println(result);
    }
}
