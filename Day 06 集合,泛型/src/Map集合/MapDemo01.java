package Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("老婆1", "朴智妍");
        map.put("老婆2", "李知恩");
        map.put("老婆3", "裴秀智");
        map.put("老婆4", "赵美延");
        map.put("老婆6", "金智秀");
        map.put("老婆7", "朴初珑");
        map.put("老婆8", "咸恩静");
        //System.out.println(map);    //输出顺序不做保证
        System.out.println(map.get("老婆1"));     //根据键来找值
        System.out.println(map.get("老婆6"));

        /*遍历:方式二*/
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //entrySet中每个元素都是Map.Entry<String, String>类型
        for (Map.Entry<String, String> kv : entrySet) {
            String key = kv.getKey();
            String value = kv.getValue();
            System.out.println(key+" "+value);
        }







    }
}


