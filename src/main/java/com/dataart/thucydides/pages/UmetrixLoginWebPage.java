package com.dataart.thucydides.pages;

import com.dataart.thucydides.models.User;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.support.FindBy;

/**
 * Created by achernyshev on 25.11.2016.
 */
public class UmetrixLoginWebPage extends PageObject {

    @FindBy(id = "cred_userid_inputtext")
    WebElementFacade usernameInputField;
    @FindBy(id = "cred_password_inputtext")
    WebElementFacade passwordInputField;
    @FindBy(id = "cred_sign_in_button")
    WebElementFacade signInButton;

    private String basicUrl = SystemEnvironmentVariables.createEnvironmentVariables().getProperty("selenium.baseUrl");

    public void openLoginPage() {
        getDriver().get("https://" + basicUrl);
        getDriver().manage().window().maximize();
    }

    public void loginAs(User user) {
        usernameInputField.clear();
        passwordInputField.clear();
        usernameInputField.sendKeys(user.getUsername());
        passwordInputField.sendKeys(user.getPassword());
        signInButton.click();
    }
}

