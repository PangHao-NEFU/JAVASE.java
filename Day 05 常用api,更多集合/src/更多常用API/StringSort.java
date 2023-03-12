package 更多常用API;

import java.util.Arrays;

/*对字符串数组进行排序
* 基本思想，
* 1.先将字符串以空格为分界拆分成一个字符串数组，用split（）
* 2.将字符串数组中的每个字符串转成int类型赋值给新创建的int数组，用Integer.parseInt()
* 3.用Arrays.sort（）进行升序排序
* 4.用StringBuilder逐步添加排序后的int[]
* 5.最后把StringBuilder用toString转为String类型并返回*/

public class StringSort {
    //String s = "91 27 46 38 50";输出"27,38 46 50 91"
    public static String solution(String s) {
        String[] sp = s.split(" ");     //左边可以用ctrl alt v快速生成
        int[] arr = new int[sp.length];
        for (int x=0;x<sp.length;x++) {
            arr[x]=Integer.parseInt(sp[x]);
        }
        Arrays.sort(arr);
        StringBuilder new_s=new StringBuilder("");
        for(int y=0;y< sp.length;y++){
            new_s.append(arr[y]);
            if(y!=sp.length-1){
                new_s.append(" ");
            }
        }

        return new_s.toString();
    }

}















