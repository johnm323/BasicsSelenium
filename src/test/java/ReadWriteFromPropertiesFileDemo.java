import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteFromPropertiesFileDemo {

    public static void main(String[] args) throws IOException {

        //Pre-Requisite - Create a config.properties file under src/main/resources/properties

        Properties properties = new Properties();

        //Reading the File from config properties
        FileInputStream fis = new FileInputStream("src/main/resources/properties/config.properties");
        properties.load(fis);

        String readBrowserName = properties.getProperty("browser");
        System.out.println(readBrowserName);


        //Writing the File from config properties
        FileOutputStream fio = new FileOutputStream("src/main/resources/properties/config.properties");
        properties.setProperty("Key_Data","Value_Data");
        properties.store(fio, "Understanding how to write to a config file using key and value");

        System.out.println(properties.getProperty("Key_Data"));


    }



}
