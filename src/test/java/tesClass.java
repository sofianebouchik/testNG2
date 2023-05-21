import org.testng.Assert;
import org.testng.annotations.*;

public class tesClass {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("inside before method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }
    @Test
    public void firstTest(){
        System.out.println("inside first method");
        AddClass addClass=new AddClass();
        addClass.getSum(2,3);
        int res=addClass.getSum(2,3);
        Assert.assertEquals(5,res);
    }
    @Test
    public void secondTest(){
        System.out.println("this is second test");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
        System.out.println();
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }
}
