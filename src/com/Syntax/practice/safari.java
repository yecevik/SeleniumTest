package com.Syntax.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
public class safari {




        public static void main(String[] args) {

// Instantiate a SafariDriver class.
            WebDriver driver = new SafariDriver();
// Launch Website
            driver.navigate().to("http://www.google.com/");

// Click on the search text box and send value
            driver.findElement(By.id("lst-ib")).sendKeys("BrowserStack");

// Click on the search button
            driver.findElement(By.name("btnK")).click();

// Close the Browser
            driver.close();

        }
}
