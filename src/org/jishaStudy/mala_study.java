package org.jishaStudy;

public class mala_study {
    public static void main(String[] args) {
        String[] p={"jisha","manish","arun"};
        outer:
        for(String a:p){
            for(String aa:p){
                if(aa.equals("arun"))
                    continue outer;
                System.out.println(aa);


            }
        }


        System.out.println(".....");


        ezjava[] S={new ezjava(),new ezjava()};
        S[0].name="p";

        for(ezjava a:S){
            a=new ezjava();
            System.out.println(a.name);
            //System.out.println(a.name);
        }
        for(ezjava a:S){
            System.out.println(a.name);
        }
    }
}
class ezjava{
    String name="hai";
}