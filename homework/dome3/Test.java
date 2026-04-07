package i064homework.dome3;

public class Test {
    public static void main(String[] args) {
        /*
        给你一个字符串s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。
        单词是指仅由字母组成、不包含任何空格字符的最大子字符串。
        */
        //声明字符串
        String s = "   fly me   to   the moon  ";
        String[] arr = s.trim().split("\\s+");
        //trim() 去除首尾空格
        //split("\\s+") 使用正则表达式，以一个或多个空白字符作为分隔符
        printArr(arr);
        System.out.println(arr[arr.length-1].length());
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for(int i=0;i < arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();
    }
    public static void printArr(String[] arr){
        System.out.print("[");
        for(int i=0;i < arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();
    }
}
