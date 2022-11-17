package com.Syntax.reviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {


    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntaxProject.com radio button
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@name='color']"));

        for (WebElement chbx : checkBoxes) {
            String option = chbx.getAttribute("value");
            if (option.equalsIgnoreCase("blue")) {
                chbx.click();
                break;
            }
        }


    }


}
