package smoke;

import org.testng.annotations.Test;

public class Test2 {

    @Test(groups = {"smokeTest"})
    public void Test1() {
        System.out.println("Posledovatelno test1");
    }

    @Test(dependsOnMethods = {"Test1"})
    public void Test2() {
        System.out.println("Posledovatelno test2");
    }
}


