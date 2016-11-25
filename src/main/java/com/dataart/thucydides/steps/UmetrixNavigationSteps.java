package com.dataart.thucydides.steps;

import com.dataart.thucydides.models.User;
import com.dataart.thucydides.pages.UmetrixLoginWebPage;
import com.dataart.thucydides.pages.UmetrixWebPageHeader;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static com.dataart.thucydides.models.UserBuilder.admin;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by achernyshev on 25.11.2016.
 */
public class UmetrixNavigationSteps extends ScenarioSteps {

    private User user;
    UmetrixLoginWebPage umetrixLoginWebPage;
    UmetrixWebPageHeader umetrixWebPageHeader;

    @Step
    public void userOpensLoginWebPage() {
        umetrixLoginWebPage.openLoginPage();
    }

    @Step
    public void userEntersCreds(String username, String password) {
        user = admin();
        user.setUsername(username);
        user.setPassword(password);
        umetrixLoginWebPage.loginAs(user);
    }

    @Step
    public void checkUsernameOnHeader (String username) {
        assertThat(umetrixWebPageHeader.getCurrentProfile(), is(username));
    }


}
