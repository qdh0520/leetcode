package string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 字符串中第一个出现的不重复字符
 *
 */
public class FirstCharacter {


    public static String FirstChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        //   LinkedHashMap按插入顺序排序 保证第一次出现
        if (s == null || s.isEmpty()) return "#";
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i)) + 1;//count 代表出现的次数
                map.put(s.charAt(i), count);  //map中存在则count值加1
            } else map.put(s.charAt(i), 1);
        }
        for (Character out : map.keySet()) {
            if (map.get(out) == 1)
                return out.toString();
        }
        return "#";
    }

    public static void main(String[] args) {
        System.out.println(FirstChar("googlled"));

    }

}
