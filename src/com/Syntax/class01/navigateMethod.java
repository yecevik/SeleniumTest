package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        driver.quit();


    }

}
