package org.jishaStudy;

public class extendsClass {

    public static void main(String[] args) {
        cat c=new cat();
c.getInfoAnimal();
c.getInfoCat();
c.getInfoAnimal();

        cat ccc=new cat();
        Animal11 aaa=ccc;

        ///error
//        Animal11 aa=new Animal11();
//        cat cc= (cat) aa;
        //error
       // cat cc=new Animal11();
        Animal11 aa=new cat();
aa.getInfoAnimal();
//////////
        cat c1=new cat();
        Animal11 a1=new Animal11();
        System.out.println(c1.isDangerous());
        System.out.println(a1.isDangerous());

        a1.getInfoAnimal();
        c1.getInfoCat();
    }
}

class  Animal11{
   // protected int age;

    //static and non-static optuput differs
     public  boolean isDangerous(){
        // System.out.println("baaa");
         return true;
     }
     public void getInfoAnimal(){
       //  System.out.println("baaazzz");
        // System.out.println(this.isDangerous());
         System.out.println("animals are dangerous is a "+isDangerous()+" statement");
     }

}
class cat extends Animal11{
    public boolean isDangerous(){
        return false;
    }
    public void getInfoCat(){
        System.out.println("cats are dangerous is a "+isDangerous()+" statement");
    }

}
