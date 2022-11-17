package com.Syntax.reviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntaxProject.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
//        get the radio button Male
        List<WebElement >radioBtn = driver.findElements(By.xpath("//input[@name='ageGroup']"));
//        check if the radio btn is displayed


        for (WebElement rdbtns:radioBtn){
            String option=rdbtns.getAttribute("value");
            if (option.equalsIgnoreCase("5 - 15")){
                rdbtns.click();
            }

        }

    }
}