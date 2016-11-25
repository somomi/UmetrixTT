package com.dataart.thucydides.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by achernyshev on 25.11.2016.
 */
public class UmetrixSelectProjectType extends PageObject {

    @FindBy(id = "custom")
    private WebElementFacade customIcon;

    public void clickCustomIcon() {
        customIcon.click();
    }

}
