package TestNGAnnodation;

/**
 * Created by muthuselvan on 10/11/17.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A Custom Annotation to inject additional information into a TestNG Test
 * http://amareshp.github.io/Creating-Your-Own-TestNG-Annotation/
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTestNGAnnotation {

    /**
     * Service.
     *
     * @return the string
     */
    String name() default "";

    String city() default "";

    String state() default "";

}
