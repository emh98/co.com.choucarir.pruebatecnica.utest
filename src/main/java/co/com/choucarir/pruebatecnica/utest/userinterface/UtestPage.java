package co.com.choucarir.pruebatecnica.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/about-us")
public class UtestPage extends PageObject {
    public static final Target BUTTON_JOIN_TODAY = Target.the("Open page of register user").
            located(By.className("unauthenticated-nav-bar__sign-up"));
}
