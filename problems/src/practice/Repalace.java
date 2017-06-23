package practice;

/**
 * Created by Administrator on 2017/6/23.
 */
public class Repalace {
    public static  String  repalace(String s){

        return  s.replaceAll(" ","%20");
    }

    public static void text(String[] args) {

            String str = "  kk kkk klaf    fsaff fsge tg sagh ger fsaga   ";
            //测试的字符串

            String regex = "\\s+";
            //表示一个或多个空格的正则表达式

            str = str.trim();
            //去掉字符串开头和结尾的空格

            String str1 = str.replaceAll(regex, "");
            //去掉所有的空格

            String str2 = str.replaceAll(regex, " ");
            //把一个或多个空格替换成一个空格

            System.out.println(str);
            System.out.println(str1);
            System.out.println(str2);
        }

    public static String ReplaceByBuffer(String s){
        StringBuilder result = new StringBuilder();
        for (int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            if (String.valueOf(a).equals(" ")){
                result.append("%20");
            }else {
                result.append(a);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
//        System.out.println(repalace("we are young"));
        System.out.println(ReplaceByBuffer("we are young"));
    }
}
