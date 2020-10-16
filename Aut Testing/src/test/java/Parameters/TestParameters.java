package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
    @Test(groups = {"parameters", "all"})
    @Parameters({"FirstParameter", "SecondParameter"})
    public void testCaseWithParemeters(String param1, String param2){
        System.out.println(param1 + " " + param2);
    }
}
