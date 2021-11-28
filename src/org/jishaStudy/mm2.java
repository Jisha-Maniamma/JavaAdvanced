package org.jishaStudy;

public class mm2 {
    public static void main(String[] args) {
        char a='\u0122';
        final char b='a';
        char c=123;
        float d=4;
        System.out.println(a);
        System.out.println(b);
        System.out.println(b+2);
        System.out.println(b+b);
        System.out.println(c);
        byte aa=10;
        byte bb=20;
        short cc= (short) (aa+bb);
        String name1="jisha";
        System.out.println(name1=="jisha");
        String name2=new String("jisha");
        System.out.println(name2=="jisha");
        System.out.println();
        System.out.println(name1.equals("jisha"));
        System.out.println(name2.equals("jisha"));
        System.out.println(name2.indexOf("is",1));


    }
}
