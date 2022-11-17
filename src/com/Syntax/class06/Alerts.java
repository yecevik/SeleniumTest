package com.Syntax.class06;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Alerts {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        //handling the Alert
Thread.sleep(3000);
       Alert simpleAlert1=driver.switchTo().alert();
        simpleAlert1.accept();

        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
       confirmationAlert.click();
        Thread.sleep(3000);
        Alert confirmationAlert1=driver.switchTo().alert();
       confirmationAlert1.dismiss();

        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
promptAlert.click();
        Thread.sleep(3000);

        Alert promptAlert1=driver.switchTo().alert();
        promptAlert1.sendKeys("Engin");
        Thread.sleep(3000);
        promptAlert1.accept();


    }
}