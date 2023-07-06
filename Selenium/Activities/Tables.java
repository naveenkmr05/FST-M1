package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;

import java.util.List;

public class Tables {
    public static void main(String[] args) throws InterruptedException {
        // Install driver
        WebDriverManager.firefoxdriver().setup();

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/tables");

        System.out.println(driver.getTitle());

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println(rows.size());

        List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
        System.out.println(columns.size());

        List<WebElement> rowsSortTable = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println(rowsSortTable.size());

        List<WebElement> columnsSortTable = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        System.out.println(columnsSortTable.size());

        WebElement columnValueSortTable = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println(columnValueSortTable.getText());

        WebElement columnValue2SortTable = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(40,3000)",columnValue2SortTable.getText());
//        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr[1]")).click();


//        WebElement columnValue3SortTable = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
//        System.out.println(columnValue3SortTable.getText());

        driver.quit();
    }
}