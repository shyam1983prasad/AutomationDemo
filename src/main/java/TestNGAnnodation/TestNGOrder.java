package TestNGAnnodation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by muthuselvan on 10/13/17.
 * https://www.tutorialspoint.com/testng/testng_execution_procedure.htm
 * in beforeSuite
 in beforeTest
 in beforeClass
 in beforeMethod
 in test case 1
 in afterMethod
 in beforeMethod
 in test case 2
 in afterMethod
 in afterClass
 in afterTest
 in afterSuite
 */
public class TestNGOrder {

    @BeforeClass
    public void beforeTestClass() {
        System.out.println("In - beforeTestClass ");

    }

    @BeforeMethod
    public void beforeTestMethod() {
        System.out.println("In - beforeTestMethod ");

    }

    @Test
    public void TestMethond() {
        System.out.println("In - Test Method");

    }
}
