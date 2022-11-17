package com.Syntax.reviewClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Basics {
    public static void main(String[] args) throws InterruptedException{

        //setting up webdriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        //create an instance
        WebDriver driver = new ChromeDriver();
        //open facebook
        driver.get("https://www.facebook.com/");
        //maximize the window
        driver.manage().window().maximize();
        // before closing wait 5 sec



        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Engin");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Cevik");




        Thread.sleep(3000);
        //quit the browser
        driver.quit();


    }
}
