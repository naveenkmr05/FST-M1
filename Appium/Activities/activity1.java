package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.AssertJUnit.assertEquals;

public class activity1 {

    WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options caps = new UiAutomator2Options();
        caps.setPlatformName("android");
        caps.setAutomationName("UiAutomator2");
        caps.setAppPackage("com.android.calculator2");
        caps.setAppActivity(".Calculator");
        caps.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, caps);
    }

    @Test
    public void multiplyTest() throws IOException {
        driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_9")).click();
        driver.findElement(AppiumBy.id("com.android.calculator2:id/eq")).click();

        String result = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
        takeScreenshot(driver);
        assertEquals(result,"45");
    }

    public static void takeScreenshot(WebDriver driver) throws IOException {
        File tempImg = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File screenshot = new File("src/test/resources/screenshot.jpg");
        FileUtils.copyFile(tempImg, screenshot);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }






}
