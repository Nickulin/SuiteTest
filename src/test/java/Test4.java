import org.testng.annotations.Test;

public class Test4 {

    @Test
    public  void test4() throws InterruptedException {
        System.out.println("Test4");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = {"test4"})
    public void test44(){
        System.out.println("Test44");
    }
}
