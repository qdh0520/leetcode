package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/12.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        lList.addFirst("6");
        lList.addFirst("8");
        lList.add("7");
        List<String> subl= lList.subList(1,4);

        System.out.println("链表的第一个元素是 : " + lList.getFirst());
        System.out.println("链表最后一个元素是 : " + lList.getLast());
        System.out.println("子链表是 : " +subl );
        System.out.println(lList.get(0));
////        public boolean add(Object element)
//        public boolean add(int index, Object element)
//        也可以把链表当初栈或者队列来处理:
//        public boolean addFirst(Object element)
//        public boolean addLast(Object element)
//        addLast()方法和不带索引的add()方法实现的效果一样.

        ArrayList<String >  arrayList=new ArrayList<>(lList); //直接可以将链表转换为 数组列表
        for (String s : arrayList) {
            System.out.println("s = " + s);
        }
        String[] array=arrayList.toArray(new String [0] );
    }
}