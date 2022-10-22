package co.com.choucarir.pruebatecnica.utest.tasks;

import co.com.choucarir.pruebatecnica.utest.userinterface.UtestSingUpPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.By;

public class SignUp implements Task{
    public static Performable theForm() {
        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("firts").into(UtestSingUpPage.FIRTS_NAME_INPUT),
                Enter.theValue("last").into(UtestSingUpPage.LAST_NAME_INPUT),
                Enter.theValue("em@gmail.com").into(UtestSingUpPage.EMAIL_INPUT),
                Click.on(UtestSingUpPage.MONTH_INPUT),
                Click.on(UtestSingUpPage.DAY_INPUT),
                Click.on(UtestSingUpPage.YEAR_INPUT),
                Enter.theValue("Spanish").into(UtestSingUpPage.SPEAK_INPUT),
                Click.on(UtestSingUpPage.SPEAK_INPUT),
                Click.on(UtestSingUpPage.LOCATION_BUTTON),
                Enter.theValue("Cali").into(UtestSingUpPage.CITY_INPUT),
                MoveMouse.to(UtestSingUpPage.SPACE_PART),
                Enter.theValue("12548522").into(UtestSingUpPage.ZIP_INPUT),
                Click.on(UtestSingUpPage.DEVICE_BUTTON),
                Enter.theValue("12548522").into(UtestSingUpPage.ZIP_INPUT),
                Click.on(UtestSingUpPage.DEVICE_BUTTON),
                Click.on(UtestSingUpPage.LAST_STEP_BUTTON),
                Enter.theValue("Abvwtyrk98*").into(UtestSingUpPage.PASSWORD_INPUT),
                Enter.theValue("Abvwtyrk98*").into(UtestSingUpPage.PASSWORD_CONFIRMATION_INPUT),
                Click.on(UtestSingUpPage.PRIVACY_SETTINGS_CHECK),
                Click.on(UtestSingUpPage.ACCEPT_TERMS_CHECK),
                Click.on(UtestSingUpPage.COMPLET_BUTTON));

    }
}
