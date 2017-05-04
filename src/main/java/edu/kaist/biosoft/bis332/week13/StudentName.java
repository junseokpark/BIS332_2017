package edu.kaist.biosoft.bis332.week13;

/**
 * Created by Junseok Park on 2017-05-04.
 * reference : http://ayoubelabbassi.blogspot.kr/2011/01/how-to-add-annotations-at-runtime-to.html
 */

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME) // The annotation is saved in the *.class
@Target(value = ElementType.METHOD) // The annotation ca be used on methods.
public @interface StudentName {
    public String name();
}

