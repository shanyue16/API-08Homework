package i064homework.dome4;

public class Test {
    public static void main(String[] args) {
        /*
        我们的身份证号码拥有一定的规则:
        1、2位:省份
        5、6位:区县
        15、16位:所在地派出所
        3、4位:城市
        7-14位:出生年、月、日
        17位:性别(奇数男性，偶数女性)
        18位:个人信息码(随机产生)
        要求:
        假设有身份证:321104200801121234，获取人物的出生年月日和性别进行输出。
        输出结果:
        出生年月日:2008年01月12日
        性别为:男
        */
        String id = "321104200801121234";
        String birth = id.substring(6,14);
        System.out.println("出生年月日:"+birth.substring(0,4)+"年"+birth.substring(4,6)+"月"+birth.substring(6,8)+"日");
        //获取性别
        char sex = id.charAt(16);
        if((sex-'0') % 2 == 1){
            System.out.println("性别为:男");
        }else{
            System.out.println("性别为:女");
        }
        //获取省份
        System.out.println("省份代号:"+id.substring(0,2));
        //获取城市
        System.out.println("城市代号:"+id.substring(2,4));
        //获取区县
        System.out.println("区县代号:"+id.substring(4,6));
        //获取所在派出所
        System.out.println("所在派出所:"+id.substring(14,16));
        System.out.println("个人信息码(随机产生):"+id.substring(17));
    }
}
