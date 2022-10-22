package co.com.choucarir.pruebatecnica.utest.tasks;

import co.com.choucarir.pruebatecnica.utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenRegister implements Task{
    public static Performable thePage() {
        return Tasks.instrumented(OpenRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestPage.BUTTON_JOIN_TODAY));

    }
}
