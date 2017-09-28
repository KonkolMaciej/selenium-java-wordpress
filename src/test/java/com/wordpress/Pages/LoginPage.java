package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.*;

/**
 * This class will store all methods and locators about login page
 *
 */
public class LoginPage {

    WebDriver driver;
   By username = By.id("usernameOrEmail");
   By password = By.id("password");
   By logInBt = By.cssSelector("button.button.form-button.is-primary");

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void typeUserName(String usr){
        driver.findElement(username).sendKeys(usr);
    }
    public void typePassword(String pass){
       driver.findElement(password).sendKeys(pass);

    }
    public void ClickOnLogInButton(){
        driver.findElement(logInBt).click();
    }
    public void loginSite(String usr, String pass){
        typeUserName(usr);
        typePassword(pass);
        ClickOnLogInButton();

    }
}
