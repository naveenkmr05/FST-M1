package examples;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;

import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;


public class ActionsBase {
    //Create Pointer
    private static final PointerInput pointer = new PointerInput(PointerInput.Kind.TOUCH,"finger");

    //Create Swipe action
    public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration){
        Sequence swipe =  new Sequence(pointer, 1)
                .addAction(pointer.createPointerMove(Duration.ofMillis(0), viewport(),start.getX(),start.getY()))
                .addAction(pointer.createPointerDown(LEFT.asArg()))
                .addAction(pointer.createPointerMove(Duration.ofMillis(duration), viewport(),end.getX(),end.getY()))
                .addAction(pointer.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }
}