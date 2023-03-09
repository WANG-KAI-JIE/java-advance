package top.kjwang.collections.list;

import java.util.LinkedList;

/**
 * @author kjwang
 * @Date 2023/3/9 15:28
 */
public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList<String> bookList = new LinkedList<>();
        bookList.add("三国演义");
        bookList.add(0,"水浒传");
        bookList.add("西游记");
        bookList.add("红楼梦");
        System.out.println(bookList);

        bookList.addFirst("蒸汽革命");
        bookList.addFirst("黄金时代");
        System.out.println(bookList);
    }
}
