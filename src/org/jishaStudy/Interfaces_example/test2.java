package org.jishaStudy.Interfaces_example;

public class test2 {
    public static void main(String[] args) {
        it11 a=new main111();
        a.mi1();
    }
}
abstract  class it11{
    abstract void mi1();
}
class main111 extends it11{
    public void mi1(){
        System.out.println("haaii");
    }
}
