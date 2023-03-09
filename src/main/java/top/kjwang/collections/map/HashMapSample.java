package top.kjwang.collections.map;

import java.util.HashMap;

/**
 * @author kjwang
 * @Date 2023/3/9 16:06
 */
public class HashMapSample {
    public static void main(String[] args) {
        //实例化HashMap，HashMap同样存储在java.util包下
        //范型可以只写在左边，右边范型可以省略
        HashMap<String,Object> student = new HashMap<>();
        //put方法向Map放入键值对
        student.put("name","张三");
        System.out.println(student);

        //多次为同一个key赋值，新的value会覆盖旧value，同时将旧value返回
        String name = (String) student.put("name","李四");
        System.out.println(name+"已被替换为李四");
        System.out.println(student);
    }
}
