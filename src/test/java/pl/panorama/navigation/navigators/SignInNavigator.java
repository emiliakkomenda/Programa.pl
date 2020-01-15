package pl.panorama.navigation.navigators;

import org.openqa.selenium.By;
import pl.panorama.navigation.Navigator;

public class SignInNavigator extends Navigator {

    public void clickEmailTexField() {
        getDriver().findElement(By.id("user-email"));
    }

    public void writeSignInEmail() {
        getDriver().findElement(By.id("user-email")).sendKeys("test@test.com");
    }

    public void clickPasswordTextField() {
        getDriver().findElement(By.id("password5e1e37afba0cc"));
    }

    public void writeSignInPassword() {
        getDriver().findElement(By.id("password5e1e37afba0cc")).sendKeys("1@Qw1@Qw");
    }

    public void clickRepeatPasswordTextFiled() {
        getDriver().findElement(By.id("password_repeat5e1e37afba14a"));
    }

    public void writeSignInRepeatPassword() {
        getDriver().findElement(By.id("password_repeat5e1e37afba14a")).sendKeys("1@Qw1@Qw");
    }
}
