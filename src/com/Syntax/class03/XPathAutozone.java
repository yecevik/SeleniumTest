package com.Syntax.class03;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class XPathAutozone {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.autozone.com/create");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Brad");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Pitt");
        driver.findElement(By.xpath("//input[contains(@name,'pos')]")).sendKeys("99999");
        driver.findElement(By.xpath("//input[starts-with(@name,'pho')]")).sendKeys("9999999999");
        driver.findElement(By.xpath("//input[starts-with(@name,'ema')]")).sendKeys("qmail.brad_p56@dummymail.com");
        driver.findElement(By.xpath("//input[starts-with(@class,'az_vv')]")).sendKeys("Az@*99999");
        driver.findElement(By.xpath("//div[text()='JOIN NOW']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
