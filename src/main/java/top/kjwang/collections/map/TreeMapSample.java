package top.kjwang.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author kjwang
 * @Date 2023/3/9 16:58
 */
public class TreeMapSample {
    //按自定义规则对TreeMap进行排序
    static class RecordComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }

    public void sort(){
        Map<String,Object> record = new TreeMap<>(new RecordComparator());
        record.put("A1","1");
        record.put("C3","2");
        record.put("B5","3");
        record.put("X1","4");
        record.put("C1","5");
        record.put("B1","6");
        System.out.println(record);
    }

    public static void main(String[] args) {
        TreeMapSample sample = new TreeMapSample();
        sample.sort();
    }
}
