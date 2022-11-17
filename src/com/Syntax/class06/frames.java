package com.Syntax.class06;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class frames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames");



//        Task 1: Print the animals on screen and then  Select Baby Cat From The drop Down

//Step1: switch to the frame using by index
        driver.switchTo().frame(1);
//        find the  text animals and print on screen
                WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
                String text = animalText.getText();
                System.out.println(text);

//        check the check box
//switch focus to the main page
        driver.switchTo().defaultContent();

//        switch to the frame containing the subframe which has checkbox
        driver.switchTo().frame("frame1");
        WebElement inputTxt = driver.findElement(By.xpath("//input"));
        inputTxt.sendKeys("abracadbra");

//        finding the frame through xpath and switching using BY Webelement method
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
//        find the checkbox
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

    }

}