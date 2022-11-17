package com.Syntax.class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class HwXPath {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click(); //This method is unique
       // driver.findElement(By.xpath("//a[contains(@id,'btn')]")).click(); (This oneis not unique but  works too. Because its first one on the line!!!)
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[starts-with(@class,'list')]")).click();

        driver.findElement(By.xpath(" //input[starts-with(@class,'form')]")).sendKeys("Java...Don't give me Drama!!!");

        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(9000);
        driver.quit();

//a[text()=' Start Practising ']


    }
}
