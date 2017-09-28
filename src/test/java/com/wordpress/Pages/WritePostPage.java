package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

/**
 * Created by maciek on 27.09.17.
 */
public class WritePostPage {

    WebDriver driver;

    By writePostButton = By.cssSelector("a.masterbar__item.masterbar__item-new");
    By titlePost = By.cssSelector("textarea.textarea-autosize.editor-title__input");
    By textPost =By.id("mceu_27-body");
    By boldText = By.cssSelector("i.mce-ico.mce-i-bold");
    By PublishVerifyButton = By.cssSelector("button.button.editor-publish-button.is-primary");
    By PublishButton = By.cssSelector("div.editor-confirmation-sidebar__action");
    public WritePostPage(WebDriver driver)
        {
            this.driver = driver;
        }


    public void ClickOnWritePostButton(){
        driver.findElement(writePostButton).click();
    }
   // WebDriverWait wait = new WebDriverWait(driver, 40);

    public void SetTitle(String title){
      //  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("textarea.textarea-autosize.editor-title__input")));
        driver.findElement(titlePost).click();

        driver.findElement(titlePost).sendKeys(title);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    public void SetTextPost(String text){
        driver.findElement(textPost).click();
        driver.findElement(textPost).sendKeys(text);
    }
    public void SetBoldText(){
        driver.findElement(boldText).click();
    }
    public void ClickPublishVerify(){
       // WebElement elemen1t = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.button.editor-publish-button.is-primary")));
        driver.findElement(PublishVerifyButton).click();

    }
    public void ClickPublishButton(){


        //WebElement elemen = wait.until(ExpectedConditions.elementToBeClickable(By.className("button")));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(PublishButton).click();

    }

}