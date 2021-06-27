package org.jishaStudy.Interfaces_example;

public class test implements  it22 {
    @Override
    public void m1() {
        System.out.println("aa");
    }

    public static void main(String[] args) {
        test t=new test();
        t.m1();
    }
}
interface it22{
    void m1();
}
