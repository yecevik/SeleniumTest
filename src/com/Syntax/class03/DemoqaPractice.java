package com.Syntax.class03;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class DemoqaPractice {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@class='card-up']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath(" //span[text()='Text Box']")).click();
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("A weird User Name");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("a.weirdemail@weirdo.com");
        driver.findElement(By.xpath("//textarea[starts-with(@id,'cur')]")).sendKeys("100 Weird Street weirs city WD,00001");
        driver.findElement(By.xpath("//textarea[starts-with(@id,'per')]")).sendKeys("Same as above");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(9000);
        driver.quit();




    }
}