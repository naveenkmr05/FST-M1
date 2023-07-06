package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

//Traversing Tables2

public class activity9 {
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
        WebElement leads = driver.findElement(By.xpath("//span/ul/li/a[text()='Leads']"));

        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(sales);
        action.moveToElement(leads);

        action.click().build().perform();
        Thread.sleep(5000);

        List<WebElement> names = driver.findElements(By.xpath("//form[@id='MassUpdate']/div[@class='list-view-rounded-corners']/table/tbody/tr/td/b/a"));
        List<WebElement> users = driver.findElements(By.xpath("//form[@id='MassUpdate']/div[@class='list-view-rounded-corners']/table/tbody/tr/td/a"));
        for(WebElement name: names){
            System.out.println(name.getText());
        }
        for(WebElement user: users){
            System.out.println(user.getText());
        }

        driver.quit();
    }
}
