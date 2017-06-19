package string;

/**
 * Created by Administrator on 2017/6/19.
 *
 * 判断字符串是否是回文字符串
 * 递归的方法
 */
public class isPalindrome {
     public static String isPalindrome(String s){
         if (s.length()<=1)
             return "yes";
         else  if (s.charAt(0)!=s.charAt(s.length()-1))
             return  "no";
         else
             return  isPalindrome(s.substring(1,s.length()-1));
     }

    public static void main(String[] args) {
       System.out.println( isPalindrome("ab"));
    }

}
