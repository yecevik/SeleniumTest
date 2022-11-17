package com.Syntax.class05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDropdow {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");

        Thread.sleep(3000);


//find the WebElement dropdown by looking select tag
        WebElement DD = driver.findElement(By.xpath("//select[@name='States']"));

        Select sel=new Select(DD);
        sel.selectByIndex(3);
Thread.sleep(3000);
        sel.selectByVisibleText("Texas");
Thread.sleep(3000);
sel.deselectByVisibleText("Texas");

//to select all options

        List<WebElement> options=sel.getOptions();
        for (int i = 0; i <options.size() ; i++) {
            sel.selectByIndex(i);}
            Thread.sleep(3000);
            sel.deselectAll();

            //how can you check if dropdown is multi select or not using selenium

            boolean multiselect=sel.isMultiple();
            System.out.println(multiselect);
            



    }
}