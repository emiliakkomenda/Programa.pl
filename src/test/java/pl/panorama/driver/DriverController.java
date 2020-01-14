package pl.panorama.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.panorama.utils.DriversPathProvider;

import java.util.concurrent.TimeUnit;

public class DriverController {

    private WebDriver driver;

    private static final DriverController INSTANCE = new DriverController();

    public static DriverController getInstance() {
        return INSTANCE;
    }

    private DriverController() {
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void start() {
        System.setProperty("webdriver.chrome.driver", DriversPathProvider.getChromeDriverPath());
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
    }
}
