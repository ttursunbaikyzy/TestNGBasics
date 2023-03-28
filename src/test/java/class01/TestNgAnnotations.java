package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotations {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("i am before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("i am after method");
    }

    @Test (groups = "regression")
    public void aFirstTestCase(){
        System.out.println("I am the first test case");
    }

    @Test
    public void bSecondTestCase(){
        System.out.println("I am the second test case");
    }

    @Test
    public void cThirdTestCase(){
        System.out.println("I am the third test case");
    }


}
