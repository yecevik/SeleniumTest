package com.Syntax.class11;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
//draggable
        WebElement dragableElement = driver.findElement(By.xpath("//div[@id='draggable']"));
//droplocation
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

        //action
        Actions action=new Actions(driver);
       // action.dragAndDrop(dragableElement,dropLocation).perform();
        //or you can use this method as well
action.clickAndHold(dragableElement).moveToElement(dropLocation).build().perform();




    }
}