package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static examples.ActionsBase.doSwipe;

public class activity2 {

    AppiumDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options caps = new UiAutomator2Options();
        caps.setPlatformName("android");
        caps.setAutomationName("UiAutomator2");
        caps.setAppPackage("com.android.chrome");
        caps.setAppActivity("com.google.android.apps.chrome.Main");
        caps.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(serverURL,caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium");
    }

    @Test
    public void webAppTest(){
        Dimension dims = driver.manage().window().getSize();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button[@text='Get Started!']")));

        Point start = new Point((int)(dims.getWidth()*0.5), (int)(dims.getHeight()*0.9));
        Point end = new Point((int)(dims.getWidth()*0.5), (int)(dims.getHeight()*0.2));

        doSwipe(driver, start, end, 200);
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[contains(@text='To-Do List')]"))).click();

        driver.findElement(AppiumBy.id("taskInput")).sendKeys("Get number of tasks");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']"));
        driver.findElement(AppiumBy.id("taskInput")).sendKeys("Clear the list");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']"));

        driver.findElement(AppiumBy.xpath("//android.view.View[@text='Add more tasks to this list.']")).click();
        driver.findElement(AppiumBy.xpath("//android.view.View[@text='Get number of tasks']")).click();
        driver.findElement(AppiumBy.xpath("//android.view.View[@text='Clear the list']")).click();

        driver.findElement(AppiumBy.className("android.view.View[@text='Clear List']")).click();
    }
}
