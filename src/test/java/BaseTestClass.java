import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("inside before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");

    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }
}

