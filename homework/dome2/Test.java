package i064homework.dome2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        描述
        写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。(不区分大小写字母)
        数据范围:1≤n≤1000
        输入描述:
        第一行输入一个由字母、数字和空格组成的字符串，第二行输入一个字符(保证该字符不为空格)，
        输出描述:
        输出输入字符串中含有该字符的个数。(不区分大小写字母)
        */
        //键盘录入字符串数据
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.nextLine();
        System.out.print("请输入一个想要查找的字符：");
        char ch = sc.next().charAt(0);
        int count = 0;
        /*for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == ch || c == Character.toUpperCase(ch) || c == Character.toLowerCase(ch)){
                count++;
            }
        }*/
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==ch||c==ch-'a'+'A'){
                count++;
            }
        }
        System.out.println(count);
    }
}
