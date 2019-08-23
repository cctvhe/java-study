package unit5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] arg){
        //创建元素结合
        Map<String, String>  map = new HashMap<>();

        //将元素添加到集合
        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");
        map.put("杨康", "穆念慈");
        map.put("陈玄风", "梅超风");

        //遍历所有的键
        /**
        Set<String> set = map.keySet();
        //遍历所有的集合，获取得到每一个键
        for (String key : set){
            String value = map.get(key);
            System.out.println(key + "==" + value);
        }
        **/

        //获取所有键值对对象的集合
        /**
        Set<Map.Entry<String, String>> set = map.entrySet();
        //遍历所有健值对，得到每一个键值对对象
        for (Map.Entry<String, String> me : set){
            String key = me.getKey();
            String val = me.getValue();
            System.out.println(key + "---" + val);
        }
        **/

    }
}
