package i064homework.dome6;

import java.util.Random;

public class Text2 {
    /*public static void main(String[] args) {
        String str="";
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < 4; i++){
            sb.append(getChar());
        }
        str = sb.toString();
        Random r = new Random();
        int num = r.nextInt(10);
        int index = r.nextInt(str.length());
        str = str.substring(0,index)+num+str.substring(index+1);
        System.out.println(str);
    }*/
    public static void main(String[] args) {
        String str="";
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < 4; i++){
            sb.append(getChar2());
        }
        Random r = new Random();
        int num = r.nextInt(10);
        int index = r.nextInt(4);
        sb.insert(index,num);
        str = sb.toString();
        System.out.println(str);
    }
    public static char getChar1(){
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
    public static char getChar2(){
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
}
