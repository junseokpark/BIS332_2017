package edu.kaist.biosoft.bis332.week5;

public class hello {
    public static void main (String [] args) {
        System.out.println("Hello World\n");

        int age = 20;

        if (age > 19 ) {
            System.out.println("Welcome to BIS332!");
        } else if ( age <= 19 && age >= 13) {
            System.out.println("You are not eliable to take this BIS332 course!");
        } else {
            System.out.println("You are too young!");
        }

        // switch case
        switch(age) {
            case(20): System.out.println("Your age is 20.");
                break;
            default : System.out.println("Could you tell me your age?");
        }

    }
}
