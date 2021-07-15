package com.orangehrm.test;

import com.orangehrm.base.Baseclass;
import com.orangehrm.pages.Loginpage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.orangehrm.pages.Quicklaunchpage;
import org.testng.annotations.Test;

public class quicklaunchpagetest extends Baseclass {

    Quicklaunchpage quick;
    Loginpage log;
   /* public quicklaunchpagetest(){
        super();
    }**/

    @BeforeMethod
    public void setup(){
        initilization();
        log = new Loginpage();
        quick = new Quicklaunchpage();
    }
    @Test(priority = 1)
    public void asgnlvtest() throws InterruptedException {
        log.validatelogin(prop.getProperty("username"),prop.getProperty("password"));
        Thread.sleep(3000);
        quick.verifyassignleave();
        String actualurl =  driver.getCurrentUrl();
        String expurl = "https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave";
        Assert.assertEquals(actualurl,expurl);


    }
    @Test(priority = 2)
    public void leavelisttest(){
        log.validatelogin(prop.getProperty("username"),prop.getProperty("password"));
        quick.verifyleavelist();
        String actualurl = driver.getCurrentUrl();
        String expurl = "https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList";
        Assert.assertEquals(actualurl,expurl);

    }


    @AfterMethod
    public void close(){
        driver.quit();
    }
}
