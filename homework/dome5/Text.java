package i064homework.dome5;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        // ... existing code ...
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                // 如果是数字的第一个字符，前面加*
                if (i == 0 || !(str.charAt(i - 1) >= '0' && str.charAt(i - 1) <= '9')) {
                    sb.append('*');
                }
                sb.append(c);
                // 如果是数字的最后一个字符，后面加*
                if (i == str.length() - 1 || !(str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9')) {
                    sb.append('*');
                }
            } else {
                sb.append(c);
            }
        }

        String res = sb.toString();
        System.out.println(res);



    }
}
