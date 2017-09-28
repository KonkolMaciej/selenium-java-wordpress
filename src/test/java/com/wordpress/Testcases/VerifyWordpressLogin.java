package com.wordpress.Testcases;

import com.wordpress.Helper.BrowserFactory;
import com.wordpress.Pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Example test to verify login on wordpress website
 */
public class VerifyWordpressLogin {
    @Test
  public void verifyValidLogin()
  {

      WebDriver driver= BrowserFactory.startBrowser("firefox","https://wordpress.com/log-in");

      LoginPage login = new LoginPage(driver);

      login.loginSite("seleniumtestacc","seleniumtestacc123");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //waiting  for load website
      Assert.assertEquals("Followed Sites", driver.findElement(By.linkText("Followed Sites")).getText());
  }

}
