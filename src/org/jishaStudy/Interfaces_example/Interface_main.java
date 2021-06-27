package org.jishaStudy.Interfaces_example;

import java.util.ArrayList;
import java.util.List;

public class Interface_main implements  NotMyInterface,MyInterface{


    public static void main(String[] args) {
        Interface_main m=new Interface_main();
        List<String> a=new ArrayList<>();

    }

    @Override
    public void m1() {
        MyInterface.super.m2();
    }


}
interface MyExtendedInterface extends  NotMyInterface,MyInterface{

    @Override
     default void m1() {
        MyInterface.super.m2();

    }


}
interface  it1{
         void m1() ;
}
interface it2{
      void m1();
}
interface  it3 extends  it1,it2{



}
class A implements  it1{


    @Override
    public void m1() {

    }
}
interface NotMyInterface{
    abstract void m1();
    //void m3();

}
interface MyInterface{
    abstract void m1();
    default void m2(){
        System.out.println("inside m2");
    }
    static void m3(){
        System.out.println("indise m3");
    }

}
