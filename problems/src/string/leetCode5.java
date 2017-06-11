package string;

/**
 * Created by Administrator on 2017/6/8.
 * 题目

 给出一个 string 串 s，找到里面最长的回文串。你可以假设 s 最长的长度是 1000。

 回文串：一个正读和反读都一样的字符串

 示例1：

 输入: "babad"

 输出: "bab"

 提示: "aba" 也是一个正确的解答.
 示例2：

 输入: "cbbd"

 输出: "bb"
 */
public class leetCode5 {

    //lo表示回文字符串首字符序号，macLen表示回文子串的长度
    private int lo, maxLen;

    public String longestPalindrome(String s) {
        //得到字符串长度
        int len = s.length();
        //若长度小于2，则就是回文，直接返回
        if (len < 2)
            return s;
        //用for循环一个个试过去
        for (int i = 0; i < len-1; i++) {
            //当回文串是奇数的时候
            extendPalindrome(s, i, i);
            //当回文串是偶数的时候
            extendPalindrome(s, i, i+1);
        }
        //返回最长回文串
        return s.substring(lo, lo + maxLen);
    }
    //从中间往外扩散然后得到回文串
    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            //通过j--,k++向外扩散
            j--;
            k++;
        }
        //当找到比较长的串时保存串初始符号位置以及长度
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }


    }

    public static void main(String[] args) {
        leetCode5 ex=new leetCode5();
//        ex.longestPalindrome("abbc");
        System.out.print( ex.longestPalindrome("abbc"));
    }
}

