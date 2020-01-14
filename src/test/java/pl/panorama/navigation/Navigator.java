package pl.panorama.navigation;

import org.openqa.selenium.WebDriver;
import pl.panorama.driver.DriverController;

public class Navigator {

    protected static WebDriver getDriver() {
        return DriverController.getInstance().getDriver();
    }
}
