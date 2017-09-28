package com.wordpress.Testcases;

import com.wordpress.Helper.BrowserFactory;
import com.wordpress.Pages.LoginPage;
import com.wordpress.Pages.WritePostPage;
import com.wordpress.Testcases.VerifyWordpressLogin.*;
import javafx.geometry.Pos;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by maciek on 27.09.17.
 */
public class VerifyCreatePost {
    @Test
    public void voidverifyValidPost(){

        WebDriver driver= BrowserFactory.startBrowser("firefox","https://wordpress.com/log-in");
        LoginPage login = new LoginPage(driver);
        login.loginSite("seleniumtestacc","seleniumtestacc123");


        WritePostPage Post = new WritePostPage(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); //waiting  for load website
        Post.ClickOnWritePostButton();
        String title = "titlenew";

        //Assert.assertEquals("editor-post-type.firepath-matching-node",driver.findElement(By.className("editor-post-type.firepath-matching-node")).getText());
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 40);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("textarea.textarea-autosize.editor-title__input")));
        Post.SetTitle(title);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Post.SetBoldText();
        Post.SetTextPost("This is example text on post :);)");
        WebElement elemen1t = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.button.editor-publish-button.is-primary")));
        Post.ClickPublishVerify();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //waiting  for load website
        Post.ClickPublishButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //waiting  for load website

       // Assert.assertEquals("Post published on ",driver.findElement(By.pa("Post published on")).getText());

        //driver.quit();
    }
}
