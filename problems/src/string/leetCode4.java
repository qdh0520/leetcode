package string;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/6/5.
 *
 *
 * 输入abc 输出 3
 * 输入abcac 输出 3
 * 输入abcacabcde 输出 5
 */
public class leetCode4 {

    public  int  lengthOfLongestSubstring(String s){
        if(s.length()==0) return 0;
        HashMap<Character,Integer> map =new HashMap<Character, Integer>();
        int max=0;
        for (int i=0 ,j=0;i<s.length();++i){
            System.out.println(i);
            if(map.containsKey(s.charAt(i))){

              j=Math.max(j,map.get(s.charAt(i))+1);
                // s.charAt(i)得到的是 hashmap 里的value hashmap的值也在更新


            }
          map.put(s.charAt(i),i);
          max=Math.max(max,i-j+1);

        }

        return max  ;
    }

    public static void main(String[] args) {
        leetCode4 leet =new leetCode4();
        leet.lengthOfLongestSubstring("abcacabcde");
        System.out .println( leet.lengthOfLongestSubstring("abcacabcde"));



    }


}
