package co.com.choucarir.pruebatecnica.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSingUpPage extends PageObject {
    public static final Target FIRTS_NAME_INPUT = Target.the("she cant writing first name").
            located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("she cant writing last name").
            located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("she cant writing email").
            located(By.id("email"));
    public static final Target SPEAK_INPUT = Target.the("she cant writing language speak").
            located(By.xpath("//input[@type= 'search']"));
    public static final Target MONTH_INPUT = Target.the("she cant writing me birthday month").
            located(By.xpath("//select[@id= 'birthMonth']//option[@label= 'April']"));
    public static final Target DAY_INPUT = Target.the("she cant writing me birthday day").
            located(By.xpath("//select[@id= 'birthDay']//option[@label= '4']"));
    public static final Target YEAR_INPUT = Target.the("she cant writing language me birthday year").
            located(By.xpath("//select[@id= 'birthYear']//option[@label= '1996']"));
    public static final Target LOCATION_BUTTON = Target.the("she next step of form").
            located(By.xpath("//a[@class= 'btn btn-blue']//span[contains(text(),'Next: Location')]"));

    public static final Target CITY_INPUT = Target.the("she cant writing than she life city").
            located(By.id("city"));
    public static final Target ZIP_INPUT = Target.the("she cant writing postal code").
            located(By.id("zip"));
    public static final Target DEVICE_BUTTON = Target.the("she next step of form").
            located(By.xpath("//a[@class= 'btn btn-blue pull-right']//span[contains(text(),'Next: Devices')]"));
    public static final Target LAST_STEP_BUTTON = Target.the("she next step of form").
            located(By.xpath("//a[@class= 'btn btn-blue pull-right']//span[contains(text(),'Next: Last Step')]"));
    public static final Target PASSWORD_INPUT = Target.the("she create password").
            located(By.id("password"));
    public static final Target PASSWORD_CONFIRMATION_INPUT = Target.the("she create confirmation password").
            located(By.id("confirmPassword"));
    public static final Target ACCEPT_TERMS_CHECK = Target.the("she accept term and conditions").
            located(By.id("termOfUse"));
    public static final Target PRIVACY_SETTINGS_CHECK = Target.the("she accept term and conditions").
            located(By.id("privacySetting"));
    public static final Target SPACE_PART = Target.the("representation of space in black").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[1]/span[1]"));
    public static final Target COMPLET_BUTTON = Target.the("she next step of form").
            located(By.xpath("//a[@class= 'btn btn-blue']//span[contains(text(),'Complete Setup')]"));
}
