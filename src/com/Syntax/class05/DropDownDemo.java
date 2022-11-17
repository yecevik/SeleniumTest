package com.Syntax.class05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");

        Thread.sleep(3000);


//find the WebElement dropdown by looking select tag
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));

        Select select=new Select(dropDown);
        Thread.sleep(3000);

        select.selectByIndex(5);
        Thread.sleep(3000);
        select.selectByVisibleText("Saturday");
        Thread.sleep(3000);
        select.selectByValue("Sunday");

        //get all the objects available in the dropdown

        List<WebElement> options = select.getOptions();

        //traverse through loop

        for (int i = 0; i < options.size() ; i++) {
            WebElement option=options.get(i);
            String text=option.getText();
if(text.equalsIgnoreCase("Friday")){
    select.selectByIndex(i);
}

        }

    }
}