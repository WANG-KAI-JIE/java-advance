package top.kjwang.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author kjwang
 * @Date 2023/3/9 16:54
 */
public class LinkedHashMapSample {
    public static void main(String[] args) {
        Map<String,Object> myMap = new LinkedHashMap<>();
        myMap.put("name","张三");
        myMap.put("age",18);
        myMap.put("height",182);
        myMap.put("weight",60);
        //按插入顺序提取数据
        System.out.println(myMap);
    }
}
