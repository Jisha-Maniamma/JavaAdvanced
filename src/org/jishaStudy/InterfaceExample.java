package org.jishaStudy;

public class InterfaceExample {
    public static void main(String[] args) {
//        a a1=new exam();
//        ((exam) a1).sayhai();
        ab a2=new exam();
        ((exam) a2).sayhai();
        StringBuilder s=new StringBuilder("java");
        // System.out.println(s.reverse(s.substring(1,3)));

    }

}

interface a{

}
class exam extends ab {
    public void sayhai(){
        System.out.println("hai");
    }
}
class ab{

}
