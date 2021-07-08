package com.orangehrm.base;

import com.orangehrm.utils.testutil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Baseclass {

   public static WebDriver driver;
    public static Properties prop;


    public Baseclass(){

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/orangehrm"
                    + "/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void initilization(){
        String browsername = prop.getProperty("browser");
                if(browsername.equals("chrome")){
                    System.setProperty("webdriver.chrome.driver","/Users/addauser/IdeaProjects/webdemo/ChromeDriver/chromedriver");
                    driver = new ChromeDriver();
                }
                else{
                    driver.close();
                }
                 driver.manage().window().maximize();
                 driver.manage().deleteAllCookies();
                 driver.manage().timeouts().pageLoadTimeout(testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
                 driver.manage().timeouts().implicitlyWait(testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
                 driver.get(prop.getProperty("url"));
    }

}
