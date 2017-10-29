package TestNGAnnodation;

import org.testng.annotations.Test;


/**
 * Created by muthuselvan on 10/11/17.
 * http://amareshp.github.io/Creating-Your-Own-TestNG-Annotation/
 */
public class TestAnnodation {

    @Test
    @MyTestNGAnnotation(name="muthu", city="San Francisco", state="California")
    public void testAnnodation1() {
        System.out.println("Annodation called ..1 ");
    }

    @Test
    @MyTestNGAnnotation(name="revanth", city="San Francisco", state="California")
    public void testAnnodation2() {
        System.out.println("Annodation called.. 2");
    }
}
