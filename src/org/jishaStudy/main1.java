package org.jishaStudy;

public class main1 {
    public static void main(String[] args) {
StringBuilder a=new StringBuilder("lion");
String b=null;
       // System.out.println(a.substring(a.indexOf("l"),a.indexOf("p")));
b=a.append("X").substring(a.indexOf("l"),a.indexOf("X"));
        System.out.println(b);
    }
}
class Animal1{
    int b;
   Animal1(){
       System.out.println("animal");
   }
   Animal1(int a){
       this.b=a;
       System.out.println(a);
   }
}
class Dog1 extends Animal1{
    Dog1(int a, int b){

    }

}
