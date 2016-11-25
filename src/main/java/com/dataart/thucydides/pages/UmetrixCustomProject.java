package com.dataart.thucydides.pages;

import com.dataart.thucydides.models.Project;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

/**
 * Created by achernyshev on 25.11.2016.
 */
public class UmetrixCustomProject extends PageObject {

    @FindBy(id = "newName")
    WebElementFacade newProjectNameInputField;
    @FindBy(id = "newDueDate")
    WebElementFacade newDueDateInputField;
    @FindBy(xpath = "//a[contains(.,'ss')]")
    WebElementFacade ssCustomTemplate;

    public void setSSCustomTemplate(Project project) {
        newProjectNameInputField.clear();
        newDueDateInputField.clear();
        newProjectNameInputField.sendKeys(project.getProjectName());
        newDueDateInputField.sendKeys(project.getDueDate());
        ssCustomTemplate.click();
    }
}
