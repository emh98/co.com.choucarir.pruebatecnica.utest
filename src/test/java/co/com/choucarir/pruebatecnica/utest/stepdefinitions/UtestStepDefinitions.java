package co.com.choucarir.pruebatecnica.utest.stepdefinitions;

import co.com.choucarir.pruebatecnica.utest.tasks.OpenRegister;
import co.com.choucarir.pruebatecnica.utest.tasks.OpenUp;
import co.com.choucarir.pruebatecnica.utest.tasks.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Luisa wants part of community at Utest$")
    public void than_Luisa_wants_part_of_community_at_Utest() {
        OnStage.theActorCalled("Luisa").wasAbleTo(OpenUp.thePage(),(OpenRegister.thePage()));
    }


    @When("^she try sign up at the Utest platform$")
    public void she_try_sign_up_at_the_Utest_platform() {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.theForm());
    }
}
