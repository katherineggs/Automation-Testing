package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestWithDataProvider {
    @DataProvider
    public Object[][] studentsDP(){
        return new Object[][]{
                {1, "Alan"},
                {2, "Julio"},
                {3, "Esteban"}
        };
    }

    @Test(dataProvider = "studentsDP", groups = {"dataProvider", "all"})
    public void testWithDP(int id, String name){
        System.out.println("ID: "+ id);
        System.out.println("Student: "+ name);
    }
}
