package com.Syntax.class10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class calender {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://www.delta.com/");
        WebElement calender =driver.findElement(By.xpath("//span[@class='calenderDepartSpan']"));
        calender.click();

        WebElement month=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
boolean isFound=false;
        while(!isFound){
          String  monthName= month.getText();
          if(monthName.equalsIgnoreCase("March")){

              List<WebElement> dates= driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
              for (WebElement date : dates) {
                  String currentdate=date.getText();
                  if (currentdate.equalsIgnoreCase("15")){
                      date.click();
                      break;
                  }
              }

              System.out.println("I have found desired Month : "+monthName);
              isFound=true;
          }else{
              driver.findElement(By.xpath("//span[text()='Next']")).click();
          }

        }



    }
}