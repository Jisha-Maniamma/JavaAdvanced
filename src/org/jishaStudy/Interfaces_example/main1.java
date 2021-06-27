package org.jishaStudy.Interfaces_example;

public class main1 {
    public static void main(String[] args) {
        m1 a=new main2();
        main b=new main2();
        main2 c=new main2();
        /////
        a.m1();
        c.m1();
        ((main2) b).m1();

        ((main2) a).name="";
        //((main2) b)
        b.name="";
        //((main2) c)class
        c.name="";

        ((main2) b).b=new String[] {"a"};
       // ((main2) a).
        c.b=new String[] {"a"};
//        ((main2) a).
        ((main2) a).b=new String[] {"a"};


    }
}

class main2 extends  main implements m1{
String[] b;
public void m1(){
    System.out.println("m11");
}
}
class main {
    String name;
}
interface m1{
    default void m1(){
        System.out.println("m1");
    };
}


