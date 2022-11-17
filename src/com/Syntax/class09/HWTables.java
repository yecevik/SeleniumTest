package com.Syntax.class09;

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

public class HWTables {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // click on the button "change text to selenium webDriver"


        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("/Users/engincevik/IdeaProjects/SeleniumTest/Data/config.properties");
prop.load(fis);
      String userName=prop.getProperty("userName");
      String passWord=prop.getProperty("passWord");


        WebElement user = driver.findElement(By.cssSelector("input[id*='txtUsername']"));
        user.sendKeys(userName);
        WebElement pass = driver.findElement(By.cssSelector("input[id*='txtPassword']"));
        pass.sendKeys(passWord);

        WebElement log = driver.findElement(By.cssSelector("input[id*='btnLogin']"));
        log.click();
        WebElement pim = driver.findElement(By.xpath("//b[text()='PIM']"));
        pim.click();
        WebElement emp = driver.findElement(By.xpath("//a[text()='Employee List']"));
        emp.click();

        List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int i = 0; i<secondColumn.size(); i++ ){

            String  columnData=secondColumn.get(i).getText();
            if(columnData.equalsIgnoreCase("42093A")){
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]"));
                checkBox.click();
            }
        }


    }
}