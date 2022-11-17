package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        Thread.sleep(3000);
        WebElement user = driver.findElement(By.cssSelector("input[id*='txtUsername']"));
        user.sendKeys("Admin");
        WebElement pass = driver.findElement(By.cssSelector("input[id*='txtPassword']"));
        pass.sendKeys("");

        WebElement log = driver.findElement(By.cssSelector("input[id*='btnLogin']"));
        log.click();

        WebElement message = driver.findElement(By.cssSelector("span[id*='spanMessage']"));
        String text = message.getText();
        boolean displayStatus = pass.isDisplayed();

        if (displayStatus) {
            System.out.println("Password cannot be empty is displayed : " + displayStatus);

        } else {
            System.out.println("Password cannot be empty is displayed : " + displayStatus);
        }

        //another way to verify:
        if (text.equalsIgnoreCase("Password cannot be empty")) {
            System.out.println("Error message (" + text + " )has been verified");
        }


    }
}