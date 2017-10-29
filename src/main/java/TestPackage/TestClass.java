package TestPackage;

import TestNGAnnodation.MyTestNGAnnotation;
import org.testng.annotations.Test;



import java.util.HashMap;

/**
 * Created by muthuselvan on 10/13/17.
 */
public class TestClass {

    public static void main(String[] args) {
        HashMap<String,String> hashMap  = new HashMap<>();
        printValues(hashMap);

        // read end iti

    }
    @MyTestNGAnnotation(name="muthu", city="San Francisco", state="California")
    @Test
    public void readAnnodation() {

    }

    public String readProperty(String filename) {
        String readfile = "";
        return readfile;

    }

    public HashMap<String ,String> addPropertyToHashMap(String fileContent ) {
        HashMap<String,String> properties = new HashMap<>();
        return properties;

    }

    public static void printValues(HashMap<String ,String> propertyMap) {

        propertyMap.put("os1","mac");
        propertyMap.put("os2","windows");
        propertyMap.put("os3","linux");
        propertyMap.put("os4","sun");
        propertyMap.forEach((k,v)-> System.out.println(k + ":" +v));
    }
}
