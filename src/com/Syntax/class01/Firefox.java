package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.mozilla.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);

        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(3000);
        driver.quit();

        driver.close();
    }}