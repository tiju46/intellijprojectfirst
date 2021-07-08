package com.orangehrm.test;

import com.orangehrm.base.Baseclass;
import com.orangehrm.pages.Loginpage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginpagetest extends Baseclass {
    Loginpage log;

    public loginpagetest(){
        super();
    }


    @BeforeMethod
    public void setup(){
        initilization();
        log = new Loginpage();

    }

    @Test(priority = 1)
    public void titletest(){

        String expectedtitle = "OrangeHRM";
        String actualtitle = log.validatelogin();
        Assert.assertEquals(actualtitle,expectedtitle);

    }
    @Test(priority = 2)
    public void logcheck(){
        log.validatelogin(prop.getProperty("username"), prop.getProperty("password"));
    }

    @AfterMethod
    public void driverclose(){
        driver.quit();
    }
}

