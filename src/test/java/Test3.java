import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {

    @DataProvider(name = "db")
        public static Object[][] dbData(){
        return new Object[][]{
                {"SQL", 1},
                {"NOSQL",2}
        };
    }

    @Parameters({"db"})
    @Test(dataProvider = "db")
    public void test1(String e1, int e2){
        System.out.println("Test3"+ " " + e1 + " "+ e2);
    }
}
