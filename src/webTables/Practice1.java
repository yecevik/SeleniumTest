package webTables;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://data.cityofnewyork.us/City-Government/Citywide-Payroll-Data-Fiscal-Year-/k397-673e");
        List<WebElement> coll = driver.findElements(By.xpath("  //div[@class='socrata-table frozen-columns']/table/tbody/tr/td[11]"));

        for(int i=0; i<coll.size();i++){

            var text= coll.get(i).getText();
            //System.out.println(text);
            String s=text.replaceAll("\\D+","");
            double dbl=Double.parseDouble(s);
if(dbl>90000.0){
    //System.out.println(text);
    WebElement name = driver.findElement(By.xpath("//div[@class='socrata-table frozen-columns']/table/tbody/tr["+(i+1)+"]/td[5]"));
    WebElement lastname = driver.findElement(By.xpath("//div[@class='socrata-table frozen-columns']/table/tbody/tr["+(i+1)+"]/td[4]"));
   System.out.println(name.getText()+" "+lastname.getText()+" : "+text);
    System.out.println(name.getText().replace('T','M')+" "+lastname.getText().replace('B','N'));

}
        }
    }}

/*Go to https://data.cityofnewyork.us/City-Government/Citywide-Payroll-Data-Fiscal-Year-/k397-673e
-at first page list the peoples names and last names who's salaries are between $90-$100K annualy.
-replace T to M at names and B to N at last names

 */


