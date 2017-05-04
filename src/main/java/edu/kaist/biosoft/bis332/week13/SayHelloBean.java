package edu.kaist.biosoft.bis332.week13;

import java.lang.reflect.Method;

/**
 * Created by Junseok Park on 2017-05-04.
 * reference : http://ayoubelabbassi.blogspot.kr/2011/01/how-to-add-annotations-at-runtime-to.html
 */
public class SayHelloBean {
    private static final String HELLO_MSG = "Hello";

    @StudentName(name=" BiS332 Student!")
    public String sayHelloTo(String name) {
        return HELLO_MSG+name;
    }

    public static void main(String[] args) {
        try {
            //instanciate the bean
            SayHelloBean simpleBean = new SayHelloBean();
            //get the method descriptor through reflection
            Method helloMessageMethod = simpleBean.getClass().getDeclaredMethod("sayHelloTo", String.class);
            //scan the annotation
            StudentName mySimpleAnnotation = (StudentName)helloMessageMethod.getAnnotation(StudentName.class);
            System.out.println(simpleBean.sayHelloTo(mySimpleAnnotation.name()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
