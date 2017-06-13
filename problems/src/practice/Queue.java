package practice;

import java.util.LinkedList;

/**
 * Created by Administrator on 2017/6/13.
 * 队列 先进先出
 */
public class Queue<T>{

    private LinkedList<T> storage=new LinkedList<T>();
    /** 入栈 */
    public  void push(T v) {
        storage.addFirst(v);
    }
    /** 出栈，但不删除*/
    public  void peek(T v){
        storage.getLast();
    }


    /** 出栈，删除 */
    public T pop()
    {
        return storage.removeLast();
    }


    /** 栈是否为空 */
    public boolean empty()
    {
        return storage.isEmpty();
    }

    /** 输出栈元素 */
    public String toString()
    {
        return storage.toString();
    }

}
