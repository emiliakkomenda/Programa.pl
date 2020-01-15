package pl.panorama.navigation.navigators;

import org.openqa.selenium.By;
import pl.panorama.navigation.Navigator;

public class LogInNavigator extends Navigator {

    public void clickEmailTexField() {
        getDriver().findElement(By.id("user-email"));
    }

    public void writeLogInEmail() {
        getDriver().findElement(By.id("user-email")).sendKeys("d223654@urhen.com");
    }

    public void clickPasswordTextField() {
        getDriver().findElement(By.id("user-password"));
    }

    public void writeLogInPassword() {
        getDriver().findElement(By.id("user-password")).sendKeys("Aq1@Aq1@");
    }

    public void clickLogInButton() {
        getDriver().findElement(By.name("user-login-email[submit]")).click();
    }
}
