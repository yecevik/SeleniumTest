package LocatorsPractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Path;


public class Locators1 {
/*
Locators in Selenium

1- ID
2- className
3- name
4- tagName
5- linkText
6- partialLinkText
7- cssSelector
8- xPath

 */


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        String Path="https://demoqa.com/text-box";
        String linkpath="https://demoqa.com/links";
        driver.manage().window().maximize();

        driver.get(Path);
        driver.findElement(By.id("userName")).sendKeys("Hello Abicim");


    }

}
