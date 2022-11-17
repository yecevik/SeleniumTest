package com.Syntax.class03;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class DemoqaPractice2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//div[text()='Forms']")).click();
        //Thread.sleep(3000);
driver.quit();
       // driver.findElement(By.className("header-wrapper")).click();


    }
}