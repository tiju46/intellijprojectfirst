package com.orangehrm.pages;

import com.orangehrm.base.Baseclass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;


public class Quicklaunchpage extends Baseclass {


    @FindBy(xpath = "//span[contains(text(),'Assign Leave')]")
    WebElement assignleave;

    @FindBy(xpath = "//span[contains(text(),'Leave List')]")
    WebElement leavelist;

    @FindBy(xpath = "//span[contains(text(),'Timesheets')]")
    WebElement timesheet;

    @FindBy(xpath = "/span[contains(text(),'Apply Leave')]")
    WebElement applyleave;

    public Quicklaunchpage(){
        PageFactory.initElements(driver,this);
    }

    public void verifyassignleave(){
        assignleave.click();
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(screenshot, new File("/Users/addauser/IdeaProjects/webautomation/screenshots/test.png"));
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void verifyleavelist(){
        leavelist.click();
    }


}
