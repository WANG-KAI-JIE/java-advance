package top.kjwang.collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author kjwang
 * @Date 2023/3/9 15:58
 */
public class TreeSetSample {
    static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    public void sort(){
        Set<Integer> set = new TreeSet<>(new IntegerComparator());
        set.add(100);
        set.add(140);
        set.add(180);
        set.add(200);
        System.out.println(set);
    }
    public static void main(String[] args) {
        new TreeSetSample().sort();
    }
}
