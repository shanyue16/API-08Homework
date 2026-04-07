package i064homework.dome1;

public class Test {
    public static void main(String[] args) {
        /*
        把任意手机号中间四位变成****
        保留邮箱名第一个字母，保留@后面的内容
        13112345678
        zw1234@163.com
        131****5678
        z***@163.com
        */
        String phone = "13112345678";
        String newphone;
        newphone = phone.substring(0,3)+"****"+phone.substring(7);
        System.out.println(newphone);
        String email = "zw1234@163.com";
        String newemail;
        //获取@的索引
        int index = email.indexOf("@");
        newemail = email.charAt(0)+"***"+email.substring(index);
        System.out.println(newemail);
    }
}
