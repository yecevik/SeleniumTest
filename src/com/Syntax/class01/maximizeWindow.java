package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");

        driver.manage().window().maximize();

        driver.manage().window().fullscreen();


        driver.quit();
    }
}
