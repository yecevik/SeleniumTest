package com.Syntax.reviewTables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tables {

    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
        // create a WebDriver instance
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
                //fill out username
                driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();
//        goto the table look for the ID 45156A and check the checkBox Associated with it


//        counter variable
        int rowCount = 0;
        boolean notfound=true;
//        a while loop continues to execute till the condition in the paranthesis is TRUE
        int idNumber=1;
        while (notfound) {

//        get all the data in the column ID of the table
            List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));


            for (WebElement id : idColumn) {
                String personID = id.getText();

                if (personID.equals("41641A")|| personID.equals("4840054") ||personID.equals("41695A")) {

                    WebElement page= driver.findElement(By.xpath("//a[@class='current']"));
                    String pagetxt=page.getText();
                    System.out.println("Desired ID is at page #: " +pagetxt+" and row #: " +(rowCount + 1));

                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (rowCount + 1) + "]/td[1]"));
                    checkBox.click();
                    if(idNumber==3) {
                        notfound = false;
                    }
                    idNumber=idNumber+1;
                    break;
                }

                rowCount = rowCount + 1;
            }
            if(notfound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
                rowCount=0;
            }

        }
    }

}