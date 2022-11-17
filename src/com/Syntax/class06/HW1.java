package com.Syntax.class06;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));

        driver.switchTo().frame(frame3);
       WebElement checkBox=driver.findElement(By.xpath("//input[@id='a']"));
       checkBox.click();

       driver.switchTo().defaultContent();
       driver.switchTo().frame("frame2");
       WebElement animal=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(animal);
        sel.selectByValue("babycat");
       //WebElement option=driver.findElement(By.xpath("//option[@value='babycat']"));
       //option.click();

       driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement inputTxt = driver.findElement(By.xpath("//input"));
        inputTxt.sendKeys("DONE");






    }
}