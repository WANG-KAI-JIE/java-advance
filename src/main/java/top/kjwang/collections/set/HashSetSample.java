package top.kjwang.collections.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kjwang
 * @Date 2023/3/9 15:45
 */
public class HashSetSample {
    public static void main(String[] args) {
        //实例化Set集合
        Set<String> mobileSet = new HashSet<>();
        //通过add方法增加新的元素
        mobileSet.add("12345678");
        mobileSet.add("22334455");
        mobileSet.add("66778899");
        System.out.println(mobileSet);

        //Set集合不允许出现重复，add方法返回值代表是否真正在集合中插入数据
        boolean isChanged = mobileSet.add("77889900");
        System.out.println("Set集合是否发生改变："+isChanged);
        System.out.println(mobileSet);

        //对于已有的数据，再次调用add方法写入将返回false
        isChanged = mobileSet.add("77889900");
        System.out.println("Set集合是否发生改变："+isChanged);
        System.out.println(mobileSet);

        //Set集合可以使用所有Collection接口定义的方法
        int count = mobileSet.size();
        boolean result = mobileSet.contains("77889900");
        System.out.println("Set集合中的元素个数："+count+"，包含77889900："+result);
        //⚠️注意：get等以索引获取数据的方法属于List接口，因此Set实现类无法使用
        //mobileSet.set("");
    }
}
