package org.jishaStudy;

public class main2 {
    public static void main(String[] args) {
person p1=new person("j",22);
        person p11=new person("j",2);
main2 t=new main2();
        System.out.println(p1);
person p2=change(p1);
person p3=change(25);
        System.out.println(p1+" "+p2);
        System.out.println(p2.name+" "+p2.age);
        System.out.println(p1.name+" "+p1.age);
        System.out.println(p3.name+" "+p3.age);

        swap(p1,p11);

        System.out.println(p1+" "+p11);
        System.out.println(p11.name+" "+p11.age);
        System.out.println(p1.name+" "+p1.age);
    }
    private static person change(int o){
        person p2=new person("o",89);
        p2.age=80;
        return  p2;
    }
    private static person change(Object o){
        person a2=(person)o;
        a2.age=30;
        return  a2;
    }
    static void swap(person a, person b){
        person c=a;
        a=b;
        b=c;
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        Integer aa=128;
        Integer bb=128;
        System.out.println(aa==bb);
    }

}

class person{
    person(String s,int i){
        ++pid;
        name=s;
        age=i;
    }
    static int pid;
    int age;
    String name;
}
