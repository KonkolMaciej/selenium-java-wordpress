package com.wordpress.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by maciek on 26.09.17.
 */
public class BrowserFactory {
    static WebDriver driver;
    public static WebDriver startBrowser(String browserName,String url)
    {

       if(browserName.equalsIgnoreCase("firefox"))
       {
           System.setProperty("webdriver.gecko.driver", "/home/maciek/projekty/seleniumJava/geckodriver");
           driver = new FirefoxDriver();
       }
       else if(browserName.equalsIgnoreCase("chrome")){
           driver = new ChromeDriver();
       }
       else if(browserName.equalsIgnoreCase("IE")){
           driver = new InternetExplorerDriver();
       }
       driver.manage().window().maximize();
        driver.get(url);
        return  driver;
    }

}
