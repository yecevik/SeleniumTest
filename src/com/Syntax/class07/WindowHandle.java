package com.Syntax.class07;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://accounts.google.com/signup");
       String gmailHandle=driver.getWindowHandle();
        System.out.println(gmailHandle);
        WebElement helpBtn= driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privacyBtn= driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
// the title of my desired page is google account help
        //Task get window handles

        Set<String> allHandles=driver.getWindowHandles();

        for (String handle : allHandles) {
           // switching the focus to the current handle
            driver.switchTo().window(handle);

           String title= driver.getTitle();
            //compare if the title is of the privacy page
            if(title.equalsIgnoreCase("Google Account Help")){
                System.out.println("Title is: "+title);
                break;
            }

        }

                //find the community button and click
                WebElement commBtn= driver.findElement(By.xpath("//a[text()='Community']"));
        commBtn.click();








    }
}