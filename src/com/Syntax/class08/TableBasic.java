package com.Syntax.class08;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableBasic {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        WebElement allTable = driver.findElement(By.xpath(" //table[@id='customers']"));
        String Alltable=allTable.getText();
       // System.out.println(Alltable);

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for(var row:rows) {
           String rowText = row.getText();
            //System.out.println(rowText);
            //System.out.println("-----------------");
            if (rowText.contains("Google")){
                System.out.println(rowText);
                //        print all the individual columns of the table
                List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
                for(WebElement column:columns){
                    String columntext = column.getText();
                    System.out.println(columntext);
                    System.out.println("-----------------");
                }

            }

        }
    }
}
