package com.Syntax.class03;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.TreeMap;
public class XPathDemo {

    public static void main(String[] args)  throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abradacabra");

        //driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

       // Thread.sleep(3000);
        //driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

        driver.findElement(By.xpath("//input[starts-with(@name,'pa')]")).sendKeys("abc123lkj");


    }
}
