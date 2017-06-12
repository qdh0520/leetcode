package practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/12.
 */
public class arrayTest {

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5 };
        String intArrayString = Arrays.toString(intArray);

// print directly will print reference value
//        System.out.println(intArray);
// [I@7150bd4d

        System.out.println(intArrayString);
// [1, 2, 3, 4, 5]


        String[] stringArray = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));//接收一个数组
        boolean b = Arrays.asList(stringArray).contains("a");// 检查数组中是否包含某个元素
        String[] stringArr = new String[arrayList.size()];
        arrayList.toArray(stringArr);
        for (String s : stringArr)
            System.out.println(s);

    }
}
