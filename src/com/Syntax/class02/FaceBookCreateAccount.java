package com.Syntax.class02;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.By;
    import org.openqa.selenium.support.ui.Select;

    import java.util.TreeMap;

public class FaceBookCreateAccount {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
       Thread.sleep(3000);

        driver.findElement(By.name("firstname")).sendKeys("Yusuf");
        driver.findElement(By.name("lastname")).sendKeys("Cevik");
        driver.findElement(By.name("reg_email__")).sendKeys("engcvk123098564738@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("engcvk123098564738@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("aabbccdd__45ooasd%$%#$");

        WebElement dd1=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select select1=new Select(dd1);
        select1.selectByIndex(3);

        WebElement dd2=driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select select2=new Select(dd2);
        select2.selectByIndex(3);

        WebElement dd3=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select select3=new Select(dd3);
        select3.selectByVisibleText("1905");

        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@value='2']"));
        maleRadioBtn.click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(10000);
        driver.quit();












    }
}
