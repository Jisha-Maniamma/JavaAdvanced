package org.jishaStudy;

public class mm1 {
    public static void main(String[] args) {
        long a=123;
        int b=3;
        float f=1.2f;
        boolean bol=true;
        //b=b*a is error
        b*=a;
        System.out.println(b);
        //float,boolean,double not allowed inside switch
        switch (b){
            case 0:
                break;
            default:
                break;
        }
        //for same type of variable initialized
        //re instialization not allowed (again)
        //if no break and continue allowed
        //switch no continue allowed
        String lo="animal";
        System.out.println(lo.replace('a','A'));

String str=new String("j");
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        System.out.println(sb.indexOf("a")+""+ sb.indexOf("al"));
        System.out.println(sub);
        //substring donot chnage value of string builder
        System.out.println(sb);
        System.out.println(str);
    }
}
