package TestngBasics;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriverManager.iedriver().setup();

    }


}
