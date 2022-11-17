package com.Syntax.class07;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");

        WebElement getBtn = driver.findElement(By.xpath("//button[text()='Get New User']"));
        getBtn.click();
        WebElement getName = driver.findElement(By.xpath("//p[contains(text(),'First Na')]"));
        String text=getName.getText();
        System.out.println("text:"+text);


    }
}