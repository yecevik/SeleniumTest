package com.Syntax.class03;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//select[contains(@class,'nav')]")).click();
        driver.findElement(By.xpath("//option[text()='Electronics']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("macbook pro");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//img[@class='s-image' and @src='https://m.media-amazon.com/images/I/61aUBxqc5PL._AC_UY218_.jpg']")).click();
driver.findElement(By.id("acrCustomerReviewText")).click();
        driver.findElement(By.xpath("//a[@data-hook='see-all-reviews-link-foot']")).click();


        Thread.sleep(9000);
        //driver.quit();
    }
}
