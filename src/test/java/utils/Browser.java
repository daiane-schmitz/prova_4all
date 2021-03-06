package utils;


import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getCurrentDriver(){
        if(driver == null){
            try {
                ChromeOptions capability = new ChromeOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
                wait = new WebDriverWait(driver, 30);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

    public static void close(){
        getCurrentDriver().quit();
        driver = null;
    }

    public static void loadPage(String url) {
        getCurrentDriver().get(url);
    }

    public static void print(){
        byte[] screenshotBytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        InputStream screenshotStream = new ByteArrayInputStream(screenshotBytes);
        Allure.addAttachment("Screenshot Test: ", screenshotStream);
    }
}
