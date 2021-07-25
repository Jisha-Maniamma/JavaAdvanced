package org.jishaStudy;

public class main2 {
    public static void main(String[] args) {
person p1=new person("j",22);
main2 t=new main2();
        System.out.println(p1);
person p2=t.change(p1);
person p3=t.change(25);
        System.out.println(p1+" "+p2);
        System.out.println(p2.name+" "+p2.age);
        System.out.println(p1.name+" "+p1.age);
        System.out.println(p3.name+" "+p3.age);

    }
    private person change(int o){
        person p2=new person("o",89);
        p2.age=80;
        return  p2;
    }
    private person change(Object o){
        person p2=(person)o;
        p2.age=30;
        return  p2;
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
