package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HbHomePage {
    public HbHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
        closeHomePagePopup();
    }
    @FindBy(className = "homepage-popup")
    private WebElement homePagePopup;


    public void closeHomePagePopup(){

        if (homePagePopup.isDisplayed()){
            Driver.getDriver().findElement(By.className("modal-close")).click();
        }
    }

}
