package i064homework.dome7;
import java.util.Scanner;
import java.math.BigInteger;
public class Test1 {
    public static void main(String[] args) {
        /*
        键盘输入两个字符串表示的非负整数，求它们的乘积。
        注意:需要考虑键盘录入的数据过大，超出int取值范围的
        */

        Scanner scanner = new Scanner(System.in);
        // 读取第一个字符串表示的非负整数
        System.out.println("请输入第一个非负整数：");
        String num1Str = scanner.nextLine();
        // 读取第二个字符串表示的非负整数
        System.out.println("请输入第二个非负整数：");
        String num2Str = scanner.nextLine();
        // 转换为BigInteger对象
        BigInteger num1 = new BigInteger(num1Str);
        BigInteger num2 = new BigInteger(num2Str);
        // 计算乘积
        BigInteger product = num1.multiply(num2);
        // 输出结果
        System.out.println("它们的乘积是：" + product);
        scanner.close();



    }
}
