package BusinessLogic;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import static Properties.Xpaths.*;


public class ChoosePartner {
    public static void Choose() throws MalformedURLException, InterruptedException {
        System.out.println("inside choose method");
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Sathya");
        capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capability.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capability);
        driver.get("https://magento.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(model)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(Partners)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(Choose)).click();
        Thread.sleep(5000);
    }
}
