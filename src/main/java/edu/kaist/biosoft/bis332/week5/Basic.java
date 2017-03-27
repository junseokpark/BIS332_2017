package edu.kaist.biosoft.bis332.week5;


class Person {
    String name;
    double weight;
    public Person() {
        name = "Student";
        weight = 40.0;
    }
}

public class Basic {
    public static void main (String[] args){
        Person p1=new Person();
        p1.name="Alex";
        p1.weight=58.5;

        Person p2=new Person();
        p2.name="David";
        p2.weight=46.1;

        System.out.println(p1.name);
        System.out.println(p1.weight);

        System.out.println(p2.name);
        System.out.println(p2.weight);
    }
}
