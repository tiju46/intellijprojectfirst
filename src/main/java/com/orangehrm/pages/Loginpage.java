package com.orangehrm.pages;

import com.orangehrm.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Baseclass {


    @FindBy(id = "txtUsername")
    WebElement logusername;

    @FindBy(id = "txtPassword")
    WebElement logpassword;

    @FindBy(id = "btnLogin")
    WebElement logbutton;



    public Loginpage(){

        PageFactory.initElements(driver,this);
    }

    public String validatelogin(){

        return driver.getTitle();
    }

    public void validatelogin(String un, String pwd){
        logusername.sendKeys(un);
        logpassword.sendKeys(pwd);
        logbutton.click();
    }
}
