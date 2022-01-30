package TestngBasics;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @DataProvider
    public Object[][] dataset(){

        Object[][] dataset = new Object[4][2];
        dataset[0][0]="username1";
        dataset[0][1]="password1";

        dataset[1][0]="username2";
        dataset[1][1]="password2";

        dataset[2][0]="username3";
        dataset[2][1]="password3";

        dataset[3][0]="username3";
        dataset[3][1]="password4";

        return dataset;

    }

    @Test(dataProvider = "dataset")
    public void test(String username, String password){

        System.out.println(username+"    "+ password);

    }



}
