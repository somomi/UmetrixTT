package com.dataart.thucydides.behaves;

import com.dataart.thucydides.steps.UmetrixNavigationSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by achernyshev on 25.11.2016.
 */
public class UmetrixNavigationBehaves {

    @Steps
    UmetrixNavigationSteps umetrixNavigationSteps;

    @Given("user is on Umetrix login page")
    @When("user is on Umetrix login page")
    public void userOpensLoginWebPage() {
        umetrixNavigationSteps.userOpensLoginWebPage();
    }

    @Given("user enters login '$username' and password '$password'")
    @When("user enters login '$username' and password '$password'")
    public void userEntersCreds (String username, String password) {
        umetrixNavigationSteps.userEntersCreds(username, password);
    }

    @Then("user should see correct username placed on home page's header")
    public void checkUsernameOnHeader (String username) {
        umetrixNavigationSteps.checkUsernameOnHeader(username);
    }

}
