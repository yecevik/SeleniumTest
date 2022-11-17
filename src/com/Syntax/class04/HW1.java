package com.Syntax.class04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        Thread.sleep(3000);

        WebElement user=driver.findElement(By.cssSelector("input[id*='txtUsername']"));
        user.sendKeys("Admin");
        WebElement pass=driver.findElement(By.cssSelector("input[id*='txtPassword']"));
        pass.sendKeys("Hum@nhrm123");

        WebElement log=driver.findElement(By.cssSelector("input[id*='btnLogin']"));
        log.click();

        WebElement message = driver.findElement(By.cssSelector("a[id*='welcome']"));
        String text=message.getText();
        System.out.println(text);





    }
}