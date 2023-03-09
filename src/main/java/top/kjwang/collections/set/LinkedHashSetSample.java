package top.kjwang.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author kjwang
 * @Date 2023/3/9 15:56
 */
public class LinkedHashSetSample {
    public static void main(String[] args) {
        Set<String> mobileSet = new LinkedHashSet<>();
        mobileSet.add("12345678");
        mobileSet.add("87654321");
        mobileSet.add("22334455");
        mobileSet.add("66778899");
        System.out.println(mobileSet);
    }
}
