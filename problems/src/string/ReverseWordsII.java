package string;

/**
 * Created by gouthamvidyapradhan on 21/03/2017.
 Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.

 The input string does not contain leading or trailing spaces and the words are always separated by a single space.

 For example,
 Given s = "the sky is blue",
 return "blue is sky the".

 Could you do it in-place without allocating extra space?
 */
public class ReverseWordsII
{
    /**
     * Main method
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        char[] c = {'t','h','e', ' ',  's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
        new ReverseWordsII().reverseWords(c);
        for (char i : c)
            System.out.print(i);
    }

    public void reverseWords(char[] s)
    {
        for(int i = 0, j = s.length - 1; i < j; i ++, j --)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;  // i从头出发，j从为尾出发
        }
        for(int i = 0, j = 0, l = s.length; i < l;)
        {
            if(s[i] == ' ')
            {
                if(s[i - 1] == ' ') //处理连续空格 j标记最后一个空格的位置
                {
                    j = i;
                    i ++; j ++;
                }
                else
                {
                    i = i - 1; // 回到空格前一个字符位置
                    for(int p = j, q = i; p < q; p ++, q--)
                    {
                        char temp = s[p];  //p 到q 字母倒序
                        s[p] = s[q];
                        s[q] = temp;
                    }
                    i = i + 1;
                    j = i;
                    i ++; j ++;
                }
            }
            else if(i == l - 1)
            {
                for(int p = j, q = i; p < q; p ++, q--)
                {
                    char temp = s[p];
                    s[p] = s[q];
                    s[q] = temp;
                }
                j = i;  //空格位置的处理
                i ++; j ++;
            }
            else
            {
                i ++;
            }
        }
    }
}
