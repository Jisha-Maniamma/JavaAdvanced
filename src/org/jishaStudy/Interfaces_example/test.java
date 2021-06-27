package org.jishaStudy.Interfaces_example;

public class test extends  it33 {
  //  @Override


    public static void main(String[] args) {
        test t=new test();
        t.m1();
        t.m2();
    }

    @Override
    public void m2() {

    }
}
interface it22{
    void m1();
    void m2();
}
abstract class it33 implements it22 {
    public void m1() {
        System.out.println("aa");
    }
}

