package edu.kaist.biosoft.bis332.week5;

public class DataParsingBasic {
    public static void main(String args[]) {
        String s1 = "apple";
        String s2 = "Banana";
        String s3 = "Cat";
        String s4 = "APpLE";
        String s5 = "pineapple";
        String s6 = "scatter";
        String s7 = "catch";


        String output="";
        output = s5 + " ends with " + s1 + ": ";
        output = output + s5.endsWith(s1) + "\n";
        System.out.println(output);

        output="";
        output = s7 + " starts with " + s3 + ": ";
        output = output + s7.startsWith(s3) + "\n";
        System.out.println(output);

        output="";
        output = "cat is inside " + s6 + " at: ";
        output = output + s6.indexOf("cat");
        System.out.println(output);
    }
}
