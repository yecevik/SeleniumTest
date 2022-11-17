package com.Syntax.class07;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");


        WebElement start = driver.findElement(By.xpath("//button[@id='startButton']"));
        start.click();

        WebElement message = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text=message.getText();
      if(text.isEmpty()){
          System.out.println("There is no text to show!");
      }else {
          System.out.println("The text is :" + text);

      }
    }
}
