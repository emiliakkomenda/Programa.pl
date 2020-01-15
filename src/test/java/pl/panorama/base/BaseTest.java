package pl.panorama.base;

import org.junit.After;
import org.junit.Before;
import pl.panorama.driver.DriverController;

import static pl.panorama.navigation.NavigatorsProvider.inMainPage;

public class BaseTest {

    private DriverController driverController = DriverController.getInstance();

    @Before
    public void setUp() {
        driverController.start();
        inMainPage().goToMainPage();
    }

    @After
    public void tearDown() {
        driverController.getDriver().quit();
    }
}
