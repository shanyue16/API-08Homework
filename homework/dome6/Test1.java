package i064homework.dome6;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /*
        验证码的规则:
        验证码的内容:可以是小写字母，也可以是大写字母，还可以是数字长度为5
        内容中是四位字母，1位数字。
        其中数字只有1位，但是可以出现在任意的位置。
        举例:
        正确的验证码:We1fg 6gKoqtqB2p错误的验证码:iuybs(没有数字)
        j1s2u(两个数字)
        */
        /*
        1.生成一个初步的验证码:
            1.1生成四个随机的字母 拼接
                1.1.1把这些随机的内容都放入到数组当中 长度52char类型的数组:a-z A-
                1.1.2生成一个随机的索引
                1.1.3通过这个随机的索引.获取随机的元素
                1.1.4 重复4次(拼接)
            1.2末尾拼接一个随机的数字
        2.把最后一个数字跟前面的字母进行交换(位置:随机的)

        -------------------------------------

        1.把这些随机的内容都放入到数组当中 长度52 char类型的数组:a-z A-Z
        2.生成一个随机的索引
        3.通过这个随机的索引，获取随机的元素
        4.重复4次(拼接)
        abcd
        5.末尾拼接一个随机的数字
        abcd1
        6.把字符串变成字符数组
        abcd1 ---
        a,b,c.d,1
        7.生成一个随机索引(交换)
        8.可以拿着最大索引上的数据，跟随机索引上的数据进行位置的交换
        a,b,1,c,d
        9，再把这个字符数组，变回字符串
        "ab1cd"
        */

        StringBuilder sb = new StringBuilder();
        String str;
        char c = getRandomChar1();
        sb.append(c);
        c=getRandomChar2();
        sb.append(c);
        c=getRandomChar3();
        sb.append(c);
        c=getRandomChar3();
        sb.append(c);
        str = sb.toString();
        Random r = new Random();
        int number = r.nextInt(0,10);
        str+=number;
        char[] arr = str.toCharArray();
        //获取随机索引
        int index = r.nextInt(0,4);
        char temp = arr[4];
        arr[4] = arr[index];
        arr[index] = temp;
        //字符数组转换成字符串
        String res = new String(arr);
        System.out.println(res);
    }

    //获取随机字母
    public static char getRandomChar1(){
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Random r = new Random();
        int index = r.nextInt(chars.length);
        char c = chars[index];
        return c;
    }
    public static char getRandomChar2(){
        Random r = new Random();
        char[] arr = getArr();
        int index = r.nextInt(arr.length);
        char c = arr[index];
        return c;
    }
    //生成数组
    public static char[] getArr(){
        char[] arr = new char[52];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char)('a'+i);
        }
        for (int i = 0; i < 26; i++) {
            arr[i+26] = (char)('A'+i);
        }
        return arr;
    }
    public static char getRandomChar3(){
        char c;
        Random r = new Random();
        int index = r.nextInt(52);
        if(index < 26){
            c = (char)('A'+index);
        }else{
            c = (char)('a'+index);
        }
        return c;
    }

}
