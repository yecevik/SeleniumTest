package com.Syntax.class02;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LocatingElements {

    public static void main(String[] args) {
        /* go to FB.com
        enter username
        enter pass
        click login
         */


            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
            WebDriver driver=new ChromeDriver();
            driver.get("http://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("Abracadabra");
        driver.findElement(By.name("pass")).sendKeys("xyz123");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
    }
}
