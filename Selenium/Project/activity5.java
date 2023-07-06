package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.Color;

//Getting colors

public class activity5 {
    public static void main(String[] args) throws InterruptedException {
        // Install driver
        WebDriverManager.firefoxdriver().setup();

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.name("Login")).click();

        WebElement toolbar = driver.findElement(By.id("toolbar"));
        String toolbarColor = toolbar.getCssValue("color");

        // convert rgba to hex
        String hexColor = Color.fromString(toolbarColor).asHex();
        System.out.println("Color is :" + toolbarColor);
        System.out.println("Hex code for color:" + hexColor);

        driver.quit();
    }
}