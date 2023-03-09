package top.kjwang.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author kjwang
 * @Date 2023/3/9 15:32
 */
public class ListLoopSample {
    public static void main(String[] args) {
        //创建List集合并添加数据
        List<String> bookList = new ArrayList<>();
        bookList.add("三国演义");
        bookList.add("水浒传");
        bookList.add("西游记");
        bookList.add("红楼梦");

        //方式1：通过标准for循环对每一个List元素赋值给book进行循环处理
        for (String book : bookList) {
            System.out.println(book);
        }
        System.out.println("--------------------------------");

        //方式2：利用forEach方法+Lambda表达式简化循环过程
        bookList.forEach(System.out::println);
        System.out.println("--------------------------------");

        //方式3：利用Iterator迭代器对象循环输出
        Iterator<String> itr = bookList.iterator();
        while (itr.hasNext()) {
            //提取出下一个元素，同时将指针向后移动
            String book = itr.next();
            System.out.println(book);
        }
    }
}
