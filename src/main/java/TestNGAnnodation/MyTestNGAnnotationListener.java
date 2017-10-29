package TestNGAnnodation;

/**
 * Created by muthuselvan on 10/11/17.
 */
import java.lang.reflect.Method;

import org.testng.*;

/**
 * The listener interface for receiving MyTestNGAnnotation events.
 * The Listener can be automatically invoked when TestNG tests are run by using ServiceLoader mechanism.
 * You can also add this listener to a TestNG Test class by adding
 * <code>@Listeners({com.amareshp.annotations.MyTestNGAnnotationListener.class})</code>
 * before the test class
 *
 * @see MyTestNGAnnotation
 */
public class MyTestNGAnnotationListener implements IInvokedMethodListener, ITestListener ,ISuiteListener {

    String name = null;
    String city = null;
    String state = null;
    boolean testSuccess = true;


    /* (non-Javadoc)
     * @see org.testng.IInvokedMethodListener#beforeInvocation(org.testng.IInvokedMethod, org.testng.ITestResult)
     */
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {


        if(method.isTestMethod() && annotationPresent(method, MyTestNGAnnotation.class) ) {

            System.out.println("This gets invoked before every TestNG Test that has @MyTestNGAnnotation Annotation...");
            name = method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(MyTestNGAnnotation.class).name();
            System.out.println("Name: " + name + " City: " + city + " State: " + state);
            AnnodationProcessing annodationProcessing = new AnnodationProcessing();
            annodationProcessing.setName(name);
            annodationProcessing.setCity(city);
            annodationProcessing.setCity(state);
            System.out.println("Detail >>>" +annodationProcessing.getDetail());
        }
    }


    private boolean annotationPresent(IInvokedMethod method, Class clazz) {
        boolean retVal = method.getTestMethod().getConstructorOrMethod().getMethod().isAnnotationPresent(clazz) ? true : false;
        return retVal;
    }

    /* (non-Javadoc)
     * @see org.testng.IInvokedMethodListener#afterInvocation(org.testng.IInvokedMethod, org.testng.ITestResult)
     */
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {

        if(method.isTestMethod()) {
            if(method.getClass().isAnnotationPresent(MyTestNGAnnotation.class)) {


//                name = method.getConstructorOrMethod().getMethod().getAnnotation(MyTestNGAnnotation.class).name();

                System.out.println("This gets invoked after every TestNG Test that has @MyTestNGAnnotation Annotation...");
            }
            if( !testSuccess ) {
                testResult.setStatus(ITestResult.FAILURE);
            }
        }
    }

    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public ITestNGMethod getMethodDetail(ITestNGMethod m1) {
     //???
        return m1;
    }

    public void onStart(ITestContext context) {
        for(ITestNGMethod m1 : context.getAllTestMethods()) {

            getMethodDetail(m1);
            if(m1.getConstructorOrMethod().getMethod().isAnnotationPresent(MyTestNGAnnotation.class)) {
                //capture metadata information.
                name = m1.getConstructorOrMethod().getMethod().getAnnotation(MyTestNGAnnotation.class).name();
                city= m1.getConstructorOrMethod().getMethod().getAnnotation(MyTestNGAnnotation.class).city();
                state = m1.getConstructorOrMethod().getMethod().getAnnotation(MyTestNGAnnotation.class).state();
                System.out.println("onStart >>>  : " +name);
            }
        }

    }

    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub

    }


    @Override
    public void onStart(ISuite suite) {
        System.out.println("onStart " +suite.getAllMethods());
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("onFinish " +suite.getAllMethods());
    }
}
