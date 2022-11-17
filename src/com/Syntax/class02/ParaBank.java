package com.Syntax.class02;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ParaBank {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Joe");
        driver.findElement(By.id("customer.lastName")).sendKeys("Gibson");
        driver.findElement(By.id("customer.address.street")).sendKeys("100 Some street");
        driver.findElement(By.id("customer.address.city")).sendKeys("different City");
        driver.findElement(By.id("customer.address.state")).sendKeys("Weird State");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("99999");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("999-999-9999");
        driver.findElement(By.id("customer.ssn")).sendKeys("111-11-1111");
        driver.findElement(By.id("customer.username")).sendKeys("User Name");
        driver.findElement(By.id("customer.password")).sendKeys("Password");
        driver.findElement(By.id("repeatedPassword")).sendKeys("password");
        Thread.sleep(8000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(8000);

        driver.quit();
        driver.close();



    }
}
