package com.dataart.thucydides.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

/**
 * Created by achernyshev on 25.11.2016.
 */
public class UmetrixProjectsWebPage extends PageObject {

    @FindBy(id = "newproject")
    public WebElementFacade newProjectButton;

    public void clickNewProjectButton() {
        newProjectButton.click();
    }
}
