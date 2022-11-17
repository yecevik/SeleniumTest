package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");

        Thread.sleep(3000);
        // get the element textbox

        //driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("Abracadabra");

        // another way above
        WebElement textBox=driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));
        textBox.sendKeys("Abracadabra");
        WebElement button = driver.findElement(By.cssSelector(" button[onclick ^='showIn']"));
        button.click();


        //radioa buttons



    }
}