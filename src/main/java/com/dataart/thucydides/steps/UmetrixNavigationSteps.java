package com.dataart.thucydides.steps;

import com.dataart.thucydides.models.User;
import com.dataart.thucydides.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by achernyshev on 25.11.2016.
 */
public class UmetrixNavigationSteps extends ScenarioSteps {

    UmetrixLoginWebPage umetrixLoginWebPage;
    UmetrixWebPageHeader umetrixWebPageHeader;
    UmetrixProjectsWebPage umetrixProjectsWebPage;
    UmetrixSelectProjectType umetrixSelectProjectType;

    @Step
    public void userOpensLoginWebPage() {
        umetrixLoginWebPage.openLoginPage();
    }

    @Step
    public void userLoginsAs(String username, String password) {
        User user = new User("asveboda@umetrix.com","1qW@3er4");
        umetrixLoginWebPage.loginAs(user);
    }

    @Step
    public void checkUsernameOnHeader(String username) {
        username = "asveboda@umetrix.com";
        assertThat(umetrixWebPageHeader.getCurrentProfile(), is(username));
    }

    @Step
    public void openProjectsWebPage() {umetrixWebPageHeader.navigateToProfileDetails();}

    @Step
    public void openSelectProjectTypePage() {umetrixProjectsWebPage.clickNewProjectButton();}

    @Step
    public void openNewCustomProjectPage() {umetrixSelectProjectType.clickCustomIcon();}

}
