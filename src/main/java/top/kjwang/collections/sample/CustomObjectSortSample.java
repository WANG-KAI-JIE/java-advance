package top.kjwang.collections.sample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author kjwang
 * @Date 2023/3/9 17:48
 */
public class CustomObjectSortSample {
    private static class CustomComparator implements Comparator<Goods>{
        @Override
        public int compare(Goods o1, Goods o2) {
            return o2.getTitle().compareTo(o1.getTitle());
        }
    }

    public List<Goods> sort(List<Goods> list) {
        CustomComparator comp = new CustomComparator();
        list.sort(comp);
        return list;
    }

    public static void main(String[] args){
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("11111111","商品A"));
        goodsList.add(new Goods("22222222","商品B"));
        goodsList.add(new Goods("33333333","商品C"));
        goodsList.add(new Goods("44444444","商品D"));

        System.out.println("排序前");
        System.out.println(goodsList);

        System.out.println("排序后");
        List<Goods> list = new CustomObjectSortSample().sort(goodsList);
        System.out.println(list);
    }
}
