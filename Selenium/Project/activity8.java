package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

//Traversing tables

public class activity8 {
    public static void main(String[] args) throws InterruptedException {
        // Install driver
        WebDriverManager.firefoxdriver().setup();

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.name("Login")).click();
        Thread.sleep(2);

        WebElement sales = driver.findElement(By.xpath("//span/a[text()='Sales']"));
        WebElement accounts = driver.findElement(By.xpath("//span/ul/li/a[text()='Accounts']"));

        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(sales);
        action.moveToElement(accounts);

        action.click().build().perform();
        Thread.sleep(5000);

        List<WebElement> names = driver.findElements(By.xpath("//form[@id='MassUpdate']/div[@class='list-view-rounded-corners']/table/tbody/tr/td/b/a"));

        int count = 1;
        for (int i=0; i<names.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(names.get(i).getText());
                count +=2;
                if (count > 10){
                    break;
                }
            }

        }
        driver.quit();
    }
}
