package com.Syntax.class08;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        // click on the button "change text to selenium webDriver"
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement button = driver.findElement(By.xpath("//button[text()='Remove']"));
        button.click();

       // WebDriverWait wait=new WebDriverWait(driver,20);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement Message = driver.findElement(By.xpath("//p[@id='message']"));
        String text=Message.getText();
        System.out.println(text);

        WebElement button2 = driver.findElement(By.xpath("//button[text()='Enable']"));
        button2.click();
        WebDriverWait wait2=new WebDriverWait(driver,20);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement Message2 = driver.findElement(By.xpath("//p[@id='message']"));
        String text2=Message2.getText();
        System.out.println(text2);
        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys("Hokus Pokus");
        WebElement button3 = driver.findElement(By.xpath("//button[text()='Disable']"));
        button3.click();
        WebDriverWait wait3=new WebDriverWait(driver,20);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement Message3 = driver.findElement(By.xpath("//p[@id='message']"));
        String text3=Message3.getText();
        System.out.println(text3);








    }
}