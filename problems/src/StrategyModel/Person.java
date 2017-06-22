package StrategyModel;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.Console;

/**
 * Created by Administrator on 2017/6/22.
 */
public class Person {

    public Person(){

    }
    private  String name;
    public Person(String name){

      this.name=name;
    }

    public  void show(){
        long time=  System.currentTimeMillis();
       System.out.println("装扮[0] "+name+time);

    }
}
