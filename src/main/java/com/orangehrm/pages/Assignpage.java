package com.orangehrm.pages;

import com.orangehrm.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignpage extends Baseclass {

    @FindBy(id = "assignleave_txtEmployee_empName")
    WebElement empname;

    @FindBy(xpath = "/select[@id='assignleave_txtLeaveType']")
    WebElement leavetype;

    @FindBy(xpath = "//input[@id='assignleave_txtFromDate']")
    WebElement frmDate;

    @FindBy(xpath = "//input[@id='assignleave_txtToDate']")
    WebElement toDate;

    @FindBy(xpath = "//textarea[@id='assignleave_txtComment']")
    WebElement commentBox;


    public Assignpage(){
        PageFactory.initElements(driver,this);
    }


    public void method_assignleave(){

    }

}
