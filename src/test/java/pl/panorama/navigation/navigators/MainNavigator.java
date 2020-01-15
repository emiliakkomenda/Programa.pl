package pl.panorama.navigation.navigators;

import org.openqa.selenium.By;
import pl.panorama.navigation.Navigator;

public class MainNavigator extends Navigator {

    public void goToMainPage() {
        getDriver().get("http://qa-test.programa.pl/");
    }

    public void clickSignInButton() {
        getDriver().findElement(By.linkText("Zarejestruj się"));
    }

    public void clickLogInButton() {
        getDriver().get("http://qa-test.programa.pl/user/login");
    }
}
