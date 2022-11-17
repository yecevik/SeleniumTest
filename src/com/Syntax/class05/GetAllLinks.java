package com.Syntax.class05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        Thread.sleep(3000);
//get all links anchor tags

        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));

       //size of the lis
        System.out.println("The size of the list is : "+ebayLinks.size());

        // for loop for the transfer
        for (WebElement ebaylink:ebayLinks){
            //extracting the value of attribute href because it contains the link embedded in the Webelement
            String link=ebaylink.getAttribute("href");
            //print links
            System.out.println(link);

        }



    }
}