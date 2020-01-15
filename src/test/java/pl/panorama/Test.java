package pl.panorama;

import pl.panorama.base.BaseTest;

import static pl.panorama.navigation.NavigatorsProvider.inLogInPage;
import static pl.panorama.navigation.NavigatorsProvider.inMainPage;

public class Test extends BaseTest {

    @org.junit.Test
    public void logIn() {
        inMainPage().clickLogInButton();
        inLogInPage().clickEmailTexField();
        inLogInPage().writeLogInEmail();
        inLogInPage().clickPasswordTextField();
        inLogInPage().writeLogInPassword();
        inLogInPage().clickLogInButton();
    }
}
