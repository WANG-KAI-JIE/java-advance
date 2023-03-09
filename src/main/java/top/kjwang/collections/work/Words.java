package top.kjwang.collections.work;

import java.util.*;

/**
 * @author kjwang
 * @Date 2023/3/9 19:06
 */
public class Words {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("orange");
        words.add("tomato");
        words.add("apple");
        words.add("litchi");
        words.add("banana");
        System.out.println("排序前：");
        for (String w : words) {
            System.out.print(w+" ");
        }
        System.out.println("\n"+"排序后：");
        words.sort((o1, o2) -> o1.compareTo(o2));
        for (String s : words) {
            System.out.print(s + " ");
        }
    }
}
