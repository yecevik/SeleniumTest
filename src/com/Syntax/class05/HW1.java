package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        Thread.sleep(3000);


       WebElement drop = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select sel=new Select(drop);

        sel.selectByIndex(11);
        List<WebElement> options = sel.getOptions();
        for (int i = 0; i < options.size() ; i++) {
       /*Webelement*/     String option=options.get(i).getText();
//String text=option.getText();
            System.out.println(option);
        }

        WebElement drop2 = driver.findElement(By.xpath("//input[@type='submit']"));
        drop2.click();
        Thread.sleep(3000);
        System.out.println("----------");
        System.out.println("Page title is : " + driver.getTitle());

    }
}