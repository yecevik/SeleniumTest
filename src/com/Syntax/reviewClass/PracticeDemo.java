package com.Syntax.reviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracticeDemo {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        goto syntaxProject.com radio button
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //when user sends  in the username Admin
        WebElement userName = driver.findElement(By.id("txtUsername"));

        //send the username
        userName.sendKeys("Admin");

        //Then user send in the wrong password
        WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys("abracadabra");


        //        Then user clicks on login Button
        WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        btn.click();

//        Then VERIFY THAT THE ERROR "Invalid credentials"

//get the error message from the DOM
        WebElement errorMSG = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error = errorMSG.getText();

//        verification

        if(error.equalsIgnoreCase("Invalid credentials")){
            System.out.println("the correct Error message is there --->verified");
        }
        else{

            System.out.println("the correct Error message is not there ");
        }




    }
}

