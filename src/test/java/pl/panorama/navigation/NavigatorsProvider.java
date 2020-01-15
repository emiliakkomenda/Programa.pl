package pl.panorama.navigation;

import org.openqa.selenium.NotFoundException;
import pl.panorama.navigation.navigators.LogInNavigator;
import pl.panorama.navigation.navigators.MainNavigator;
import pl.panorama.navigation.navigators.SignInNavigator;

import java.util.ArrayList;
import java.util.List;

public class NavigatorsProvider {

    private final static NavigatorsProvider INSTANCE = new NavigatorsProvider();

    private List<Navigator> navigators = new ArrayList<>();

    private NavigatorsProvider() {
        navigators.add(new MainNavigator());
        navigators.add(new SignInNavigator());
        navigators.add(new LogInNavigator());
    }

    private <T extends Navigator> T getNavigator(Class<T> navigatorClass) {
        for (Navigator navigator : navigators) {
            if (navigator.getClass().equals(navigatorClass)) {
                //noinspection unchecked
                return (T) navigator;
            }
        }

        throw new NotFoundException("Navigator with given name was not found");
    }

    public static MainNavigator inMainPage() {
        return INSTANCE.getNavigator(MainNavigator.class);
    }

    public static SignInNavigator inSignInPage() {
        return INSTANCE.getNavigator(SignInNavigator.class);
    }

    public static LogInNavigator inLogInPage() {
        return INSTANCE.getNavigator(LogInNavigator.class);
    }
}
