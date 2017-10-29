/**
 * Created by muthuselvan on 10/8/17.
 */
public class ParentChild {

    public static void main(String[] args) {

        RemoteWebDriverImpl parentClass = new FirefoxDriverClass();
        parentClass.parentmethod();

        // parent object class hold the child object , using this
        // only we can call method in parent class


//        RemoteWebDriverImpl parentClass1 = new FirefoxDriverClass();
//        parentClass.parentmethod();


        FirefoxDriverClass remoteWebDriver = new FirefoxDriverClass();
        remoteWebDriver.childmethod();

        // ChildClass ChildInstance = (ChildClass) ParentInstance .. Type Casting
        FirefoxDriverClass firefoxDriverClass = (FirefoxDriverClass) parentClass;
        firefoxDriverClass.childmethod();
    }
}

class RemoteWebDriverImpl implements WebDriverInterface {
    public void parentmethod() {
        System.out.println("Parent Methond");
    }
}

class FirefoxDriverClass extends RemoteWebDriverImpl {
    public void childmethod() {
        System.out.println("Child Methond");
    }
}


class ChromeDriverClass extends RemoteWebDriverImpl {
    public void childmethod() {
        System.out.println("Child Methond");
    }
}


interface WebDriverInterface {
    void parentmethod();
}
