//input[@name='firstName']
package com.Syntax.class07;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://accounts.google.com/signup");

        WebElement helpBtn= driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privacyBtn= driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        Set<String> allHandles=driver.getWindowHandles();

        for (String handle : allHandles) {
            // switching the focus to the current handle
            driver.switchTo().window(handle);
            String title= driver.getTitle();
            if(title.equalsIgnoreCase("Google Account Help")){
                System.out.println("Title is: "+title);
                break;
            }
        }
        WebElement comBtn= driver.findElement(By.xpath("//a[text()='Community']"));
        comBtn.click();
        for (String handle : allHandles) {
            // switching the focus to the current handle
            driver.switchTo().window(handle);
            String title= driver.getTitle();
            if(title.equalsIgnoreCase("Create your Google Account")){
                System.out.println("Title is: "+title);
                break;
            }
        }
                WebElement user= driver.findElement(By.xpath("//input[@type='email']"));
                user.sendKeys("Hokus Pokus");
            }
        }

