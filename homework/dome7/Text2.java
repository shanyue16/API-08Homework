package i064homework.dome7;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.print("请输入第二个数字：");
        int b = sc.nextInt();
        int[] arr1 = getarr(a, getlen(a));
        int[] arr2 = getarr(b, getlen(b));
        printarr(arr1);
        printarr(arr2);
        int[] arr3 = multipy(arr1, arr2);
        printarr(arr3);
        String multipy = arrtostr(arr3);
        System.out.println(multipy);
    }
    public static int[] getarr(int a,int len){
        int[] arr = new int[len];
        for (int i = len-1; i >= 0 ; i--) {
            arr[i] = a % 10;
            a /= 10;
        }
        return arr;
    }
    public static int getlen(int a){
        int len = 0;
        while(true){
            a /= 10;
            len++;
            if(a == 0){
                break;
            }
        }
        return len;
    }
    //相乘方法
    public static int[] multipy(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int count1 = 0;
        for (int i=arr1.length-1; i >= 0; i--) {
            int temp=0,count2 = 0;
            for(int j=arr2.length-1; j >= 0; j--) {
                int num = arr1[i] * arr2[j] + arr3[arr3.length - 1 - count1 - count2] + temp;
                arr3[arr3.length - 1 - count1 - count2] = num % 10;
                temp = num / 10;
                count2++;
            }
            arr3[arr3.length - 1 - count1 - count2] += temp;
            count1++;
        }
        return arr3;
    }
    //将数组转化为字符串
    public static String arrtostr(int[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    //遍历数组
    public static void printarr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();
    }
}
