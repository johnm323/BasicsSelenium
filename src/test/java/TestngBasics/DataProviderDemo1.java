package TestngBasics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 {

    @DataProvider
    public Object[][] dataset1(){

      return new Object[][]
              {

                      {"username1", "password1", "test1"},
                      {"username2", "password2", "test2"},
                      {"username3", "password3", "test3"},

              };

    }



    @Test(dataProvider = "dataset1")
    public void test1(String username, String password, String text){

        System.out.println(username+"    "+ password+"  "+text);
    }


}
