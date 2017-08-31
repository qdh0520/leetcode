package practice;

import java.beans.PropertyChangeSupport;

/**
 * Created by Administrator on 2017/8/30.
 */
public class MergeSort {


    public static  void mergeSort(int[] list){

        if(list.length>1){
            int[] firstHalf=new int[list.length/2];
            System.arraycopy(list,0,firstHalf,0,list.length/2);
            mergeSort(firstHalf);

            int secondHalfLength=list.length-list.length/2 ;
            int[]  secondHalf =new int[secondHalfLength];
            System.arraycopy(list,list.length/2,secondHalf,0,secondHalfLength);
            mergeSort(secondHalf);

            merge(firstHalf,secondHalf,list);
        }
    }

    public static void merge(int[]list1,int[]list2,int[] temp) {

        int curent1=0; //index in list1
        int curent2=0; //index in list2
        int curent3=0;//index in temp
        while (curent1<list1.length&& curent2<list2.length){
            if(list1[curent1]<list2[curent2])
                temp[curent3++]=list1[curent1++];
            else
                temp[curent3++]=list2[curent2++];
        }
        while (curent1<list1.length)  //当list1与list2数组长度不一样长时
            temp[curent3++]=list1[curent1++];
        while (curent2<list2.length)  //当list1与list2数组长度不一样长时
        temp[curent3++]=list2[curent2++];

    }

    public static void main(String[] args) {
      int[] list={2,3,2,5,6,1,-2,3,14,12};
        mergeSort(list);
        for(int i=0;i<list.length;i++)
            System.out.println(list[i]+"");

    }

}

