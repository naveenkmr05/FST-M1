package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import java.util.List;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        // Install driver
        WebDriverManager.firefoxdriver().setup();

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);

        driver.get("https://www.training-support.net/selenium/drag-drop");

        System.out.println(driver.getTitle());

        WebElement football = driver.findElement(By.id("draggable"));
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        builder.dragAndDrop(football, dropzone1).build().perform();
        String message = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
        System.out.println(message);

        builder.dragAndDrop(football, dropzone2).build().perform();
        String message2 = driver.findElement(By.xpath("//div[@id='dropzone2']/p")).getText();
        System.out.println(message2);

        driver.quit();
    }
}