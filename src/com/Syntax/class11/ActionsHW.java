package com.Syntax.class11;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ActionsHW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions action = new Actions(driver);
        action.contextClick(rightClickBtn).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Edit']")).click();
        Alert simpleAlert1=driver.switchTo().alert();
        simpleAlert1.accept();

        WebElement dbl=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions action2 = new Actions(driver);
        action2.doubleClick(dbl).perform();
        Thread.sleep(2000);
        Alert simpleAlert2=driver.switchTo().alert();
        simpleAlert2.accept();




    }
}